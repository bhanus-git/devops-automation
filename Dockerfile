FROM openjdk:17
EXPOSE 8080
ADD target/devops-integration-sample.jar devops-integration-sample.jar
ENTRYPOINT ["java","-jar","/devops-integration-sample.jar"]