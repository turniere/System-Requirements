# turnie.re

Use Case Specification: Register  
Version v1.0

# Table of contents

%toc-content%

# %toc-caption-1% Register

## %toc-caption-2% Brief Description

This use case allows guests to register for our website, and afterwards use our services using the given e-mail, username and password.

# %toc-caption-1% Flow of Events

## %toc-caption-2% Basic Flow

 - user puts in his username, e-mail and password
 - user clicks on "Register" button
 - client checks plausibility of credentials (format of username / e-mail; equality of passwords)
 - if credentials aren't plausible we'll show an error
 - server checks validity of credentials (username doesn't exist; plausibility check)
 - if credentials aren't valid we'll show an error
 - show the user his logged in page
 
### %toc-caption-3% Activity Diagram
![Activity Diagram](../imgs/use_case_register.png)

### %toc-caption-3% Mockup
![Mockuo](../imgs/mockup_register.png)

## %toc-caption-2% Alternative Flows

### %toc-caption-3% Alternative Flow 1

### %toc-caption-3% Alternative Flow 2

# %toc-caption-1% Special Requirements

## %toc-caption-2% Special Requirement 1

# %toc-caption-1% Preconditions

## %toc-caption-2% Precondition 1

# %toc-caption-1% Postconditions

## %toc-caption-2% Postcondition 1

# %toc-caption-1% Extension Points

## %toc-caption-2% Extension Point 1
