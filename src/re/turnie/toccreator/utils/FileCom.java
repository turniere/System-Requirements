package re.turnie.toccreator.utils;

import java.io.*;

public class FileCom {

    /**
     * This method reads all the lines from the given file and returns them in an array.
     *
     * @param f the file to read from.
     * @return the lines that have been read from the file
     * @throws IOException in case something goes wrong
     */
    public static String[] readLines(File f) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(f))) {
            return reader.lines().toArray(String[]::new);
        }
    }

    /**
     * This method writes the given text to the given file.
     *
     * @param f the file to write to
     * @param str the text to write to the file
     * @return whether the writing process was correct
     */
    public static boolean writeFullText(File f, String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            writer.write(str);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
