FROM openjdk:11
ADD target/docker-security.jar docker-security.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-security.jar"]