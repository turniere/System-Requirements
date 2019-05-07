# turnie.re

Test Plan:
Version v1.0

# Table of contents

%toc-content%

# %toc-caption-1% Introduction
## %toc-caption-2% Purpose
- The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. It describes the approach to testing the software, and is the top-level plan generated and used by managers to direct the test effort.

  This *Test Plan* for the turnie.re website supports the following objectives:

  - figure out if all functionalities work 
  - find out if all wrong inputs are catched
## %toc-caption-2% Scope
Unit-Tests are planned to cover most of the Use-Cases for the front-end.
## %toc-caption-2% Intended Audience
The targeted Audience are Developers working on this Project.
## %toc-caption-2% Document Terminology and Acronyms
- **SRS**	Software Requirements Specification
- **n/a**	not applicable
- **tbd**	to be determined
## %toc-caption-2% References
- n.a.

# %toc-caption-1% Evaluation Mission and Test Motivation
## %toc-caption-2%  Background
The main goal of testing is to be sure, that after all changes the functionalities will still work without problems.

Furthermore to find out where Bugs could possibly hide. 

## %toc-caption-2% Evaluation Mission
- find as many bugs as possible
- make sure everything works after changes
- advise about testing

## %toc-caption-2% Test Motivators
The motivation for testing our App with Unit-Tests is, that our App has the quality we imagined at the beginning. Another point is time, because it is much faster to test the App with Unit-Tests then to test everything everytime ourselves.

# %toc-caption-1% Target Test Items
For testing we decided to thoroughly test all Use-Cases and features our application has.

# %toc-caption-1% Outline of Planned Tests
## %toc-caption-2% Outline of Test Inclusions
n.a.
## %toc-caption-2% Outline of Other Candidates for Potential Inclusion
n.a.
# %toc-caption-1% Test Approach
## %toc-caption-2% Testing Techniques and Types
### %toc-caption-3% Function and Database Integrity Testing
The section Tested is Front- and Backend.

### %toc-caption-3% Unit Testing
|Technique Objective:| Target: LogIn, Create and   Delete Rating                    |
|---|---|
| Technique:              | Unit-Tests                                                   |
| Oracles:                | -Success   <br />- Errormessages                             |
| Required Tools:         | Unit-Test-Interface                                          |
| Success Criteria:       | - Server returns success, after sending data   <br />- Correct Errormessage gets   displayed |

### %toc-caption-3% Business Cycle Testing
n/a
### %toc-caption-3% User Interface Testing
Automated with use of Cucumber and Feature-Files
### %toc-caption-3% Performance Profiling 
n/a
### %toc-caption-3% Load Testing
n/a
### %toc-caption-3% Stress Testing
n/a
### %toc-caption-3% Volume Testing
n/a
### %toc-caption-3% Security and Access Control Testing
n/a
### %toc-caption-3% Failover and Recovery Testing
n/a
### %toc-caption-3% Configuration Testing
n/a
### %toc-caption-3% Installation Testing
n/a
# %toc-caption-1% Entry and Exit Criteria
## %toc-caption-2% Test Plan
### %toc-caption-3% Test Plan Entry Criteria
Operating System that runs Docker
### %toc-caption-3% Test Plan Exit Criteria
Success from Server or right Error
# %toc-caption-1% Deliverables
## %toc-caption-2% Test Evaluation Summaries
The tests are supposed to cover every thinkable situation the user is in.
## %toc-caption-2% Reporting on Test Coverage
Coveralls.io
## %toc-caption-2% Perceived Quality Reports
n.a.
## %toc-caption-2% Incident Logs and Change Requests
n/a
## %toc-caption-2% Smoke Test Suite and Supporting Test Scripts
n/a
## %toc-caption-2% Additional Work Products
n/a
### %toc-caption-3% Detailed Test Results
n/a
### %toc-caption-3% Additional Automated Functional Test Scripts
n/a
### %toc-caption-3% Test Guidelines
n.a.

### %toc-caption-3% Traceability Matrices
n/a
# %toc-caption-1% Testing Workflow
Unit-Tests in IDE
# %toc-caption-1% Environmental Needs
## %toc-caption-2% Base System Hardware
n/a
## %toc-caption-2% Base Software Elements in the Test Environment

| **Software Element Name** | **Version** | **Type and Other Notes** |
| ------------------------- | ----------- | ------------------------ |
| RubyMine                  |             | IDE                      |
| VisualStudioCode          |             | Editor                   |
| SublimeText               |             | Editor                   |
| Linux                     |             | Operating System         |
## %toc-caption-2% Productivity and Support Tools
n/a
# %toc-caption-1% Responsibilities, Staffing, and Training Needs
## %toc-caption-2% People and Roles

| **Human Resources** |                     |                                                     |
| ------------------- | ------------------- | --------------------------------------------------- |
| **Role**            | **Person assigned** | **Specific Responsibilities or Comments**           |
| Test Manager        | Daniel              | · Plan Test   <br>· Code Tests   <br>· Do Tests |
## %toc-caption-2% Staffing and Training Needs
n/a
# %toc-caption-1% Iteration Milestones
We want to cover all Use-Cases of the frontend
We want to cover all Use-Cases of the backend

# %toc-caption-1% Risks, Dependencies, Assumptions, and Constraints

| **Risk**                           | **Mitigation Strategy**                 | **Contingency    (Risk is realized)** |
| ---------------------------------- | --------------------------------------- | ------------------------------------- |
| Problems with Testcode and Steps   | Work on more better Testcode            | Publish new Testcode                  |
| Code has lots of side effects      | Refactor code (Clean Code principles)   | Publish new refactored tests          |

# %toc-caption-1% Management Process and Procedures
n.a.