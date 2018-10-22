package re.turnie.toccreator;

import re.turnie.toccreator.utils.FileCom;
import re.turnie.toccreator.utils.StringProcessing;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TOCCreator {

    public static void main(String[] args) {
        String[] files;

        try {
            files = FileCom.readLines(new File("build-file.txt"));
        } catch (IOException e) {
            System.out.println("Error while reading build file.");
            e.printStackTrace();
            return;
        }

        if(files.length % 2 != 0) {
            System.out.println("Build file is not valid.");
            return;
        }

        for(int i = 0; i < files.length; i += 2) {
            processFile(files[i], files[i + 1]);
        }
    }

    private static void processFile(String in, String out) {
        // Read all the lines from the file to process
        String[] lines;
        try {
            lines = FileCom.readLines(new File(in));
        } catch (IOException e) {
            System.out.println("Error while reading template");
            e.printStackTrace();
            return;
        }

        final Pattern captionPattern = Pattern.compile("%toc-caption-\\d+%");
        final Pattern depthExtractor = Pattern.compile("\\d+");

        Map<String, Integer> captionAmount = new HashMap<>();

        StringBuilder resultContent = new StringBuilder();

        Caption currentCaption = new Caption();

        for(int i = 0; i < lines.length; i++) {
            // Find the next line which contains a caption used for the table of contents
            Matcher templateMatcher = captionPattern.matcher(lines[i]);

            if(templateMatcher.find()) {
                // extract the caption
                String captionText = lines[i].substring(templateMatcher.end());

                // and the depth of the caption
                String tag = templateMatcher.group();
                Matcher depthMatcher = depthExtractor.matcher(tag);
                // noinspection ResultOfMethodCallIgnored
                depthMatcher.find();
                int depth = Integer.parseInt(depthMatcher.group());

                // rewind the captions according to the depths used in the
                if(depth == currentCaption.getDepth()) {
                    currentCaption = currentCaption.getParent();
                } else if(depth < currentCaption.getDepth() && depth > 0) {
                    while(depth - 1 != currentCaption.getDepth()) {
                        currentCaption = currentCaption.getParent();
                    }
                } else if(depth <= 0) {
                    System.out.println("The caption contained a non-positive depth, which is illegal.");
                    return;
                } else if(depth != currentCaption.getDepth() + 1) {
                    System.out.println("The caption depths were not in the right order. current depth=" + currentCaption.getDepth() + "; given=" + depth + ".");
                    return;
                }

                // create the caption-objects
                currentCaption = new Caption(currentCaption, captionText.trim(), captionAmount);

                // and transform the tagged line into an ordinary one
                resultContent.append(lines[i], 0, templateMatcher.start());
                resultContent.append(captionText.trim());
                resultContent.append(System.lineSeparator());
            } else {
                // normal lines are just appended
                resultContent.append(lines[i]);
                resultContent.append(System.lineSeparator());
            }
        }

        // rewind the captions to the root-caption (which doesn't actually contain a caption)
        while (currentCaption.getParent() != null) {
            currentCaption = currentCaption.getParent();
        }

        // build the table of contents
        StringBuilder toc = new StringBuilder();
        buildTableOfContents(toc, currentCaption);

        // insert the table of contents everywhere
        Pattern tocFinder = Pattern.compile("%toc-content%");
        String result = tocFinder.matcher(resultContent).replaceAll(toc.toString());

        // and write the result
        FileCom.writeFullText(new File(out), result);
    }

    private static void buildTableOfContents(StringBuilder toc, Caption currentCaption) {
        for(Caption childCaption : currentCaption.getChildren()) {
            // we start by appending the table of content entry of the first child,
            toc.append(childCaption.buildTableOfContentsLine());
            // then append all the children of the current caption
            buildTableOfContents(toc, childCaption);
            // and then continue appending all the children
        }
    }

    private static class Caption {

        /**
         * The caption that represents the parent of this caption
         */
        private Caption parent;
        /**
         * The inner captions of this caption
         */
        private List<Caption> children;

        /**
         * The amount of duplicates of the caption text that have occurred for this caption
         */
        private int duplicate;
        /**
         * The depth this caption is in
         */
        private int depth;
        /**
         * The actual caption text
         */
        private String caption;

        public Caption() {
            this.parent = null;
            this.children = new ArrayList<>();
            this.duplicate = 0;
            this.depth = 0;
            this.caption = null;
        }

        public Caption(Caption parent, String capt, Map<String, Integer> captionAmount) {
            this.parent = parent;
            this.children = new ArrayList<>();
            this.depth = parent.depth + 1;
            this.caption = capt;

            parent.getChildren().add(this);

            // create a value, if the caption doesnt exists as a key, or increment it
            String linkCaption = createLinkCaption();
            if(!captionAmount.containsKey(linkCaption)) {
                duplicate = 0;
                captionAmount.put(linkCaption, 1);
            } else {
                duplicate = captionAmount.get(linkCaption);
                captionAmount.put(linkCaption, duplicate + 1);
            }
        }

        public Caption getParent() {
            return parent;
        }

        public List<Caption> getChildren() {
            return children;
        }

        public int getDepth() {
            return depth;
        }

        public String getCaption() {
            return caption;
        }

        public String buildTableOfContentsLine() {
            return StringProcessing.format(
                    "{0}1. [{1}]({2}){3}",
                    StringProcessing.multiply("   ", this.depth - 1),
                    this.caption,
                    this.createLink(),
                    System.lineSeparator()
            );
        }

        private String createLink() {
            if(this.depth < 1) {
                return "";
            } else {
                return StringProcessing.format("#{0}", createLinkCaption());
            }
        }

        private String createLinkCaption() {
            StringBuilder result = new StringBuilder(caption.toLowerCase());
            for(int i = 0; i < result.length(); i++) {
                if(result.charAt(i) == ' ') {
                    result.setCharAt(i, '-');
                } else if(!Character.isAlphabetic(result.charAt(i)) && !Character.isDigit(result.charAt(i))) {
                    result.deleteCharAt(i);
                    i--;
                }
            }

            if(duplicate != 0) {
                result.append("-");
                result.append(duplicate);
            }

            return result.toString();
        }
    }
}
