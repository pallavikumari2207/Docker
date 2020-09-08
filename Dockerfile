FROM openjdk:8-jdk-alpine
EXPOSE 5000
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]