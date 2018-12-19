FROM openjdk:8-jdk

EXPOSE 8081

ADD ProductsApi.jar /app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "Dspring.profiles.active=docker,"/app.jar"]