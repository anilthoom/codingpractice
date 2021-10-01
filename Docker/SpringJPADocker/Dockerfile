FROM openjdk:11
ADD /target/SpringJPADocker-0.0.1-SNAPSHOT.jar spring-jpa-docker.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "spring-jpa-docker.jar"]