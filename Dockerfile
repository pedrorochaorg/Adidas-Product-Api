FROM openjdk:8-jdk

EXPOSE 8081

ADD . /code

WORKDIR /code/products

RUN ./gradlew clean build -x check && copy build/libs/ProductsApi.jar /app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=docker","/app.jar"]