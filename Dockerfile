FROM openjdk:8-jdk-alpine

COPY target/exercise-0.0.1-SNAPSHOT.jar exercise-0.0.1.jar

ENTRYPOINT ["java", "-jar", "/exercise-0.0.1.jar"]

EXPOSE 8080