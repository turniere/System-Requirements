# turnie.re

Use Case Specification: Edit Teams  
Version v1.0

# Table of contents

1. [Edit Teams](#edit-teams)
   1. [Brief Description](#brief-description)
1. [Flow of Events](#flow-of-events)
   1. [Basic Flow](#basic-flow)
      1. [Activity Diagram](#activity-diagram)
      1. [Feature](#feature)
      1. [Mockup](#mockup)
   1. [Alternative Flows](#alternative-flows)
1. [Special Requirements](#special-requirements)
1. [Preconditions](#preconditions)
   1. [User is not logged in](#user-is-not-logged-in)
1. [Postconditions](#postconditions)
1. [Extension Points](#extension-points)


# Edit Teams

## Brief Description

This use case allows users to change names of teams.

# Flow of Events

## Basic Flow

 - user creates a tournament
 - user views his tournament (e.g. via the (private) tournament list)
 - if the user is authorized (signed in and owner of the tournament), an edit button is shown
 - user clicks on edit
 - if the user isn't authorized to edit the tournament, he gets an error
 - a list of input fields with the teams is shown, each with an edit button
 - user changes a team name
 - user clicks on the edit button of that team
 - the frontend sends the changed name to the backend
 - if the backend confirms, the user gets a success message
 - if some error occurs, the user gets a error message and the changed name resets
 - as seen by the user, every occurence of the old team name will be replaced with the changed one
 
### Activity Diagram
![Edit_Teams](../imgs/use_case_edit_team_names.png)

### Feature
TBA

### Mockup
![Mockup Edit_Teams](../imgs/mockups/mockup_edit_teams.png)

## Alternative Flows
Not Applicable (N/A)

# Special Requirements
Not Applicable (N/A)

# Preconditions

## User is not logged in
The user will need to log in / register and create a tournament.

# Postconditions
every occurence of the old team name will be replaced with the changed one

# Extension Points
Not Applicable (N/A)
