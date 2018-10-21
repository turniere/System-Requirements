# turnie.re - Software Requirements Specification  

## Revision History:

| Date | Version | Description | Author |
| ---  | ---     | ---         | ---    |
| 21. Oct. 2018 | 1.0 | Initial | Jonas Seydel |

## Table of contents

%toc-content%
    
# %toc-caption-1% Introduction
## %toc-caption-2% Purpose
This System Requirements Specifications will specify the requirements towards the turnie.re project.  
It consists of a backend, a web frontend and possibly an Android app.
The document will specify all planned features and use cases.

## %toc-caption-2% Scope
In the scope of this SRS are all components related to turnie.re: The backend, the web frontend and potentially the Android app.

## %toc-caption-2% Definitions, Acronyms and Abbreviations
All the (technical) terms, acronyms and abbreviations used in this document are listed and described in the table below.

| Abbreviation / Term | Definition |
| --- | --- |
| User | Any human-like creature interacting with a component |
| Member | A user with an account |
| Tournament Owner | The owner of a tournament with access to all of it's features |
TODO: add smth...

## %toc-caption-2% References
All the important references, that are part of this project are listed below.

| Title | Link | Date (added) |
| --- | --- | --- |
| RUP SRS Specification | http://sce.uhcl.edu/helm/RationalUnifiedProcess/webtmpl/templates/req/rup_srs.htm | 21. Oct. 2018 |
| Blog | [blog.turnie.re](blog.turnie.re) | 19. Oct. 2018 |
| GitHub Organization | [git.turnie.re](git.turnie.re) | 19. Oct. 2018 |
| Issues | [jira.turnie.re](jira.turnie.re) | 21. Oct. 2018 |

## %toc-caption-2% Overview
This document will follow the structure defined in the RUP SRS Specification:
It will start with a general description of the complete product and it's components including the use case diagram.
The following section includes a detailed description of all requirements divided into multiple subsections.

# %toc-caption-1% Overall descriptions
Planning a tournament is a big effort without a digital tool on hand.
You have to remember teams, their results and based on that data determine winners which are transferred into the next stage.  
It will get even more complicated if you want to manage a group phase and transfer teams into playoffs based on their results in that phase.

Some people tend to use magically (not-)working solutions based on Excel sheets which are not scalable or even maintainable.  
To solve this once and for all we want to create a web page which will take care of managing your tournaments so you can focus on more important parts of your events.

## %toc-caption-2% Use Case Diagram
![Use Case Diagram](use_case_diagram.png)

# %toc-caption-1% Specific Requirements
## %toc-caption-2% Functionality
This section will contain all functional requirements for our application.
It will ignore the separation of backend, frontend and app and just focus on general functions.

### %toc-caption-3% Authorization
A *user* is able to read the manual, create an account (register), log in, recover their password, list public tournaments and view a public tournament.
After registration and login a *user* will become a *member* with access to all available features.

### %toc-caption-3% User management
Each *member* has a unique username and email-address and a password.
It can use either the username or the mail-address and the password to log in.
While logged in it can change their username, email-address and password.

### %toc-caption-3% Tournament management
A *member* can create a tournament and become it's *tournament owner*.
A *tournament* consists of a name, an optional description and multiple teams.
Each *team* has a unique name, which can be changed later on, and optionally a picture assigned to it.
On creation a member can specify those attributes
and create a group phase by specifying the number of teams per group and how many teams should get into the playoff stage.
The tournament view can be customized with a background, banner and color scheme.
There are two views to show a tournament:
A normal view designed for use by the tournament owner to enter match results
and a view designed for display on a big screen like a beamer displaying only one stage at a time.

If a group phase was chosen, it is initialized first after tournament creation.
It will consist of random groups including all given teams and a number of messages.
After all group matches are finished or if group phase was skipped a playoff phase will be generated.
It will consist of multiple stages depending on the number of teams chosen to get into this phase.
The winning teams of each stage will get into the next one resulting in a final stage with two teams and a tournament winner.

After a tournament is finished, leaderboards with relevant tournament statistics are generated and displayed.
## %toc-caption-2% Usability
The usability requirement is described separately by component.

### %toc-caption-3% Backend (REST API)
The backend will be used by the other two components and is not supposed to be used by the general user.
It will be documented publicly and will provide users with a technical understanding the option to create their own client applications.

### %toc-caption-3% Web Frontend
The web frontend is the most important component and everyone should be able to use it.
There will be an extensive manual explaining how to use and access every function of the project.

### %toc-caption-3% Android App
The Android app is the second most important component and everyone should be able to use it as well.
It will adhere to Google's Material Design Guidelines regarding usability.

## %toc-caption-2% Reliability
The backend as the most important should be available 99% of the time (downtime at most ~15m daily, ~7h monthly, 3d 16h yearly).
There will be proper monitoring and deployment techniques in place to ensure this requirement.
The web frontend depends on the backend therefore the same uptime guarantee can be given here.
As for the Android App which will feature an offline mode to allow it to function even during downtimes of the backend.

To keep the Java code maintainable it should adhere to Google's Java Style Guide which will be enforced and checked on every code change.
Additionally there will be automated unit and integration tests verifying correct functionality of all components on every change.

## %toc-caption-2% Performance
The response time of the backend should never exceed one second for user management and authorization tasks.
Tournament management is, especially during tournament creation, highly dependent on the database and very resource intensive and will exceed this limit but should never exceed a response time of 30 seconds for each task.
The web page should be able to handle at least 500 concurrent users.

## %toc-caption-2% Supportability
## %toc-caption-2% Design Constraints
## %toc-caption-2% Online User Dosumentation and Help System Requirements
## %toc-caption-2% Purchased Components
## %toc-caption-2% Interfaces
### %toc-caption-3% User Interfaces
### %toc-caption-3% Hardware Interfaces
### %toc-caption-3% Software Interfaces
### %toc-caption-3% Communications Interfaces
## %toc-caption-2% Licensing Requirements
## %toc-caption-2% Legal, Copyright and Other Notices
## %toc-caption-2% Applicable Standards
# %toc-caption-1% Supporting Information
