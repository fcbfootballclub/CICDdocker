# syntax=docker/dockerfile:1
#
#FROM eclipse-temurin:17-jdk-jammy
#
#WORKDIR ./docker-p
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve
#
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]

#FROM openjdk:8
##WORKDIR /docker-p
#COPY target/docker-p-0.0.1-SNAPSHOT.jar docker-p-0.0.1-SNAPSHOT.jar
#ENTRYPOINT["java", "-jar", "/docker-p-0.0.1-SNAPSHOT.jar"]

FROM openjdk:8
COPY target/*.jar docker-p-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/docker-p-0.0.1-SNAPSHOT.jar"]