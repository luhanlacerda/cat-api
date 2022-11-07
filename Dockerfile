FROM openjdk:11
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} cat-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cat-api-0.0.1-SNAPSHOT.jar"]