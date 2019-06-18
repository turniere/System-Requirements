# turnie.re

Use Case Specification: Login  
Version v1.0

# Table of contents

%toc-content%

# %toc-caption-1% Login

## %toc-caption-2% Brief Description

Users can have accounts, which are used for authentication. This describes how a user authenticates if he already has an account.

# %toc-caption-1% Flow of Events

## %toc-caption-2% Basic Flow

 - user navigates on the login page
 - user puts in his e-mail
 - user puts in his password
 - user clicks on 'login'
 - the frontend sends the credentials to the backend
 - the backend validates the credentials and replies to the frontend
 - if the credentials are invalid, the frontend shows an error message
 - if the credentials are valid, the frontend
   - shows a success message
   - changes the menu bar to indicate that the user is now logged in
   - redirects the user to the landing page
  
 
### %toc-caption-3% Activity Diagram
![Activity Diagram](../imgs/use_case_login.png)

### %toc-caption-3% Feature
todo

### %toc-caption-3% Mockup

![Mockup](../imgs/mockups/mockup_login.png)

## %toc-caption-2% Alternative Flows
Not Applicable (N/A)

# %toc-caption-1% Special Requirements

# %toc-caption-1% Preconditions
the user has registered and may log in

# %toc-caption-1% Postconditions
the user is logged in, the frontend indicates that in the menu bar

# %toc-caption-1% Extension Points
Not Applicable (N/A)
