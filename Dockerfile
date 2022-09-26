FROM openjdk:10-jre-slim

WORKDIR /app
COPY ./build/libs/sample-service-1.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "sample-service-1.0-SNAPSHOT.jar"]