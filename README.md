# Cat-Api

## Overview

The Cat API

## Requirements

- Docker
- Docker Compose
- Java 11
- Gradle 7.4.1

## Technologies & Libraries

- SpringBoot
- Gson
- JUnit

## Testing Tasks

### Tests

```./gradlew test```

## Building & Running Tasks

### Run the Application using Spring Boot (i.e. standalone)

```./gradlew bootRun```

For local execution, please check the ```db/mssql``` folder that has the necessary to execute the container with
database using the command ```docker-compose up```

## Swagger

```http://localhost:8080/swagger-ui/index.html```