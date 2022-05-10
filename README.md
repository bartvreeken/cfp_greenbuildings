# The Demo project for CFP Green Buildings

## Introduction
This is a demo project (Gradle 7+ and Kotlin 1.6) created for an assigned at CFP Green Buildings. The initial setup was created using the
_Spring Initializr_.

### Addition stuff added
The following stuff was added to spice up the project a bit more
- a yaml configuration file (port and logging)
- added _MockK_ to have better mocking support for Kotlin
- a demo controller and service to demonstrate a fully functional endpoint
- springdoc (oas3) Swagger UI to visualize the available endpoints
- two different type of tests

## How to run
The project is straightforward, just run the _DemoApplication_ class

### How to test
The project contains 2 test classes
- a single integration test to test the Spring setup and the endpoint(s): DemoControllerITTest
- a single MockK class, which contains unit tests for the DemoController. 


