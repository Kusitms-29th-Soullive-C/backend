FROM openjdk:17-alpine
COPY ./build/libs/soullive-c-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
# "-Dspring.profiles.active=prod",