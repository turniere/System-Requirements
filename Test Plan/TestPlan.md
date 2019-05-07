# turnie.re

Test Plan:
Version v1.0

# Table of contents

1. [Introduction](#introduction)
   1. [Purpose](#purpose)
   1. [Scope](#scope)
   1. [Intended Audience](#intended-audience)
   1. [Document Terminology and Acronyms](#document-terminology-and-acronyms)
   1. [References](#references)
1. [Evaluation Mission and Test Motivation](#evaluation-mission-and-test-motivation)
   1. [Background](#background)
   1. [Evaluation Mission](#evaluation-mission)
   1. [Test Motivators](#test-motivators)
1. [Target Test Items](#target-test-items)
1. [Outline of Planned Tests](#outline-of-planned-tests)
   1. [Outline of Test Inclusions](#outline-of-test-inclusions)
   1. [Outline of Other Candidates for Potential Inclusion](#outline-of-other-candidates-for-potential-inclusion)
1. [Test Approach](#test-approach)
   1. [Testing Techniques and Types](#testing-techniques-and-types)
      1. [Function and Database Integrity Testing](#function-and-database-integrity-testing)
      1. [Unit Testing](#unit-testing)
      1. [Business Cycle Testing](#business-cycle-testing)
      1. [User Interface Testing](#user-interface-testing)
      1. [Performance Profiling](#performance-profiling)
      1. [Load Testing](#load-testing)
      1. [Stress Testing](#stress-testing)
      1. [Volume Testing](#volume-testing)
      1. [Security and Access Control Testing](#security-and-access-control-testing)
      1. [Failover and Recovery Testing](#failover-and-recovery-testing)
      1. [Configuration Testing](#configuration-testing)
      1. [Installation Testing](#installation-testing)
1. [Entry and Exit Criteria](#entry-and-exit-criteria)
   1. [Test Plan](#test-plan)
      1. [Test Plan Entry Criteria](#test-plan-entry-criteria)
      1. [Test Plan Exit Criteria](#test-plan-exit-criteria)
1. [Deliverables](#deliverables)
   1. [Test Evaluation Summaries](#test-evaluation-summaries)
   1. [Reporting on Test Coverage](#reporting-on-test-coverage)
   1. [Perceived Quality Reports](#perceived-quality-reports)
   1. [Incident Logs and Change Requests](#incident-logs-and-change-requests)
   1. [Smoke Test Suite and Supporting Test Scripts](#smoke-test-suite-and-supporting-test-scripts)
   1. [Additional Work Products](#additional-work-products)
      1. [Detailed Test Results](#detailed-test-results)
      1. [Additional Automated Functional Test Scripts](#additional-automated-functional-test-scripts)
      1. [Test Guidelines](#test-guidelines)
      1. [Traceability Matrices](#traceability-matrices)
1. [Testing Workflow](#testing-workflow)
1. [Environmental Needs](#environmental-needs)
   1. [Base System Hardware](#base-system-hardware)
   1. [Base Software Elements in the Test Environment](#base-software-elements-in-the-test-environment)
   1. [Productivity and Support Tools](#productivity-and-support-tools)
1. [Responsibilities, Staffing, and Training Needs](#responsibilities-staffing-and-training-needs)
   1. [People and Roles](#people-and-roles)
   1. [Staffing and Training Needs](#staffing-and-training-needs)
1. [Iteration Milestones](#iteration-milestones)
1. [Risks, Dependencies, Assumptions, and Constraints](#risks-dependencies-assumptions-and-constraints)
1. [Management Process and Procedures](#management-process-and-procedures)


# Introduction
## Purpose
- The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. It describes the approach to testing the software, and is the top-level plan generated and used by managers to direct the test effort.

  This *Test Plan* for the turnie.re website supports the following objectives:

  - figure out if all functionalities work 
  - find out if all wrong inputs are catched
## Scope
Unit-Tests are planned to cover most of the Use-Cases for the front-end.
## Intended Audience
The targeted Audience are Developers working on this Project.
## Document Terminology and Acronyms
- **SRS**	Software Requirements Specification
- **n/a**	not applicable
- **tbd**	to be determined
## References
- n.a.

# Evaluation Mission and Test Motivation
## Background
The main goal of testing is to be sure, that after all changes the functionalities will still work without problems.

Furthermore to find out where Bugs could possibly hide. 

## Evaluation Mission
- find as many bugs as possible
- make sure everything works after changes
- advise about testing

## Test Motivators
The motivation for testing our App with Unit-Tests is, that our App has the quality we imagined at the beginning. Another point is time, because it is much faster to test the App with Unit-Tests then to test everything everytime ourselves.

# Target Test Items
For testing we decided to thoroughly test all Use-Cases and features our application has.

# Outline of Planned Tests
## Outline of Test Inclusions
n.a.
## Outline of Other Candidates for Potential Inclusion
n.a.
# Test Approach
## Testing Techniques and Types
### Function and Database Integrity Testing
The section Tested is Front- and Backend.

### Unit Testing
|Technique Objective:| Target: LogIn, Create and   Delete Rating                    |
|---|---|
| Technique:              | Unit-Tests                                                   |
| Oracles:                | -Success   <br />- Errormessages                             |
| Required Tools:         | Unit-Test-Interface                                          |
| Success Criteria:       | - Server returns success, after sending data   <br />- Correct Errormessage gets   displayed |

### Business Cycle Testing
n/a
### User Interface Testing
Automated with use of Cucumber and Feature-Files
### Performance Profiling
n/a
### Load Testing
n/a
### Stress Testing
n/a
### Volume Testing
n/a
### Security and Access Control Testing
n/a
### Failover and Recovery Testing
n/a
### Configuration Testing
n/a
### Installation Testing
n/a
# Entry and Exit Criteria
## Test Plan
### Test Plan Entry Criteria
Operating System that runs Docker
### Test Plan Exit Criteria
Success from Server or right Error
# Deliverables
## Test Evaluation Summaries
The tests are supposed to cover every thinkable situation the user is in.
## Reporting on Test Coverage
Coveralls.io
## Perceived Quality Reports
n.a.
## Incident Logs and Change Requests
n/a
## Smoke Test Suite and Supporting Test Scripts
n/a
## Additional Work Products
n/a
### Detailed Test Results
n/a
### Additional Automated Functional Test Scripts
n/a
### Test Guidelines
n.a.

### Traceability Matrices
n/a
# Testing Workflow
Unit-Tests in IDE
# Environmental Needs
## Base System Hardware
n/a
## Base Software Elements in the Test Environment

| **Software Element Name** | **Version** | **Type and Other Notes** |
| ------------------------- | ----------- | ------------------------ |
| RubyMine                  |             | IDE                      |
| VisualStudioCode          |             | Editor                   |
| SublimeText               |             | Editor                   |
| Linux                     |             | Operating System         |
## Productivity and Support Tools
n/a
# Responsibilities, Staffing, and Training Needs
## People and Roles

| **Human Resources** |                     |                                                     |
| ------------------- | ------------------- | --------------------------------------------------- |
| **Role**            | **Person assigned** | **Specific Responsibilities or Comments**           |
| Test Manager        | Daniel              | · Plan Test   <br>· Code Tests   <br>· Do Tests |
## Staffing and Training Needs
n/a
# Iteration Milestones
We want to cover all Use-Cases of the frontend
We want to cover all Use-Cases of the backend

# Risks, Dependencies, Assumptions, and Constraints

| **Risk**                           | **Mitigation Strategy**                 | **Contingency    (Risk is realized)** |
| ---------------------------------- | --------------------------------------- | ------------------------------------- |
| Problems with Testcode and Steps   | Work on more better Testcode            | Publish new Testcode                  |
| Code has lots of side effects      | Refactor code (Clean Code principles)   | Publish new refactored tests          |

# Management Process and Procedures
n.a.
