# parent image
FROM eclipse-temurin:17-jdk-alpine
#installing curl command
RUN apk add curl
#adding temporary volume
VOLUME /tmp
EXPOSE 8080
#to copy the jar file from target to container
ADD target/aws-code-pipeline.jar aws-code-pipeline.jar
ENTRYPOINT ["java","-jar","/aws-code-pipeline.jar"]


