FROM openjdk:8-jdk

EXPOSE 8081

ADD . /code
WORKDIR /code

RUN ./gradlew clean build -x check && cp /code/build/libs/ProductsApi.jar /app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "Dspring.profiles.active=docker,"/app.jar"]