# turnie.re

Use Case Specification: Register  
Version v1.0

# Table of contents

1. [Register](#register)
   1. [Brief Description](#brief-description)
1. [Flow of Events](#flow-of-events)
   1. [Basic Flow](#basic-flow)
      1. [Activity Diagram](#activity-diagram)
      1. [Mockup](#mockup)
   1. [Alternative Flows](#alternative-flows)
      1. [Alternative Flow 1](#alternative-flow-1)
      1. [Alternative Flow 2](#alternative-flow-2)
1. [Special Requirements](#special-requirements)
   1. [Special Requirement 1](#special-requirement-1)
1. [Preconditions](#preconditions)
   1. [Precondition 1](#precondition-1)
1. [Postconditions](#postconditions)
   1. [Postcondition 1](#postcondition-1)
1. [Extension Points](#extension-points)
   1. [Extension Point 1](#extension-point-1)


# Register

## Brief Description

This use case allows guests to register for our website, and afterwards use our services using the given e-mail, username and password.

# Flow of Events

## Basic Flow

 - user puts in his username, e-mail and password
 - user clicks on "Register" button
 - client checks plausibility of credentials (format of username / e-mail; equality of passwords)
 - if credentials aren't plausible we'll show an error
 - server checks validity of credentials (username doesn't exist; plausibility check)
 - if credentials aren't valid we'll show an error
 - show the user his logged in page
 
### Activity Diagram
![Activity Diagram](../imgs/use_case_register.png)

### Mockup
![Mockuo](../imgs/mockup_register.png)

## Alternative Flows

### Alternative Flow 1

### Alternative Flow 2

# Special Requirements

## Special Requirement 1

# Preconditions

## Precondition 1

# Postconditions

## Postcondition 1

# Extension Points

## Extension Point 1
