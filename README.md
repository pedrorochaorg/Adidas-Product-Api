# Adidas Products Api
Exercise to show case skills when developing java enabled microservices.


## Built With

- Java 8
- Spring Boot 2.1.1
- Spring 5 Webflux
- IntelliJ
- Project Lombok
- TestNG
- Jacoco

## Requirements
To run/build this code your host must have:
- Java 8 JRE/JDK
- Gradle 4.6+


## Additional Information

This api supports 1 type of authentication, Basic Auth.

Api docs OpenApi format are accessible to the following urls:

- `http://<host>:8080/v2/api-docs`
- `http://<host>:8080/swagger-ui-html`


## Building the code

To build the code you must run the following command:

```bash
./gradlew clean build
```

## Running the Web Server

To run the webserver you must run the following command:
```bash
./gradlew clean bootRun
```
The webserver will start running on port 8080


## Running Tests
To run the test cases in this project you must run the following command:
```bash
./gradlew clean test
```

The result of these tests will be stored in the following directories:

- reports/coverage (Jacoco Coverage Report)
- reports/tests/html ( TestNG / ReportNG Test Reports)


