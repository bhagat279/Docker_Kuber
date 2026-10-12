FROM openjdk:17
ADD target/Docker-Kuber.jar Docker-Kuber.jar
EXPOSE 8080
# Container start hote hi Spring Boot chalega
ENTRYPOINT ["java","-jar","Docker-Kuber.jar"]