# Cat-Api

## Overview

This Cat-Api is a CRUD to the cat breeds.

This API was build based of breeds from database of https://thecatapi.com/
Is consulting every minute to see if is anything diferent from our database of catapi.com database and update it

### How to configure the populate our database

On ```docker-compose.yml``` has a propertie called ```cron.expression``` that you can configure as you need

## Requirements

- Docker
- Docker Compose
- Java 11

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

### Run the Application + Database using docker

For docker execution, please go to main folder and execute the command ```docker-compose up```

## Swagger

```http://localhost:8080/swagger-ui/index.html```

## Collection

```/doc/cat-api-collection.json```