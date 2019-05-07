# turnie.re

Use Case Specification: MatchCRUD;  
Version v1.0

# Table of contents

1. [MatchUpdate](#matchupdate)
   1. [Brief Description](#brief-description)
1. [Flow of Events](#flow-of-events)
   1. [Basic Flow](#basic-flow)
      1. [Activity Diagram](#activity-diagram)
      1. [Feature](#feature)
      1. [Mockup](#mockup)
         1. [Match Start](#match-start)
         1. [Match Update](#match-update)
   1. [Alternative Flows](#alternative-flows)
1. [Special Requirements](#special-requirements)
1. [Preconditions](#preconditions)
1. [Postconditions](#postconditions)
   1. [User enters correct score](#user-enters-correct-score)
   1. [User enters weird stuff](#user-enters-weird-stuff)
1. [Extension Points](#extension-points)


# MatchUpdate

## Brief Description

This Use Case Allows Users to bet on who will win the match. When selecting a Match from the List of Matches, the user is asked who he thinks will win. We will then show the percentage each team is voted for.

# Flow of Events

## Basic Flow

 - owner of tournament clicks on Match within that tournament
 - user is asked for the current score 
 - user submits current score
 - Match is updated according to the options the user submits
 
### Activity Diagram
TBA

### Feature
TBA

### Mockup
![Mockup](../imgs/mockups/mockup_match_update.png)

#### Match Start
TBA

#### Match Update
TBA

## Alternative Flows
Not Applicable (N/A)

# Special Requirements
Not Applicable (N/A)

# Preconditions
Tournament needs to be created

# Postconditions

## User enters correct score
Match will be updated accordingly

## User enters weird stuff
Error will be shown

# Extension Points
Not Applicable (N/A)
