FROM openjdk:17-jdk-slim
COPY build/libs/TestService-0.0.1-SNAPSHOT-plain.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]