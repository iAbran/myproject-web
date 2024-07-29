from amazoncorretto:22-alpine-jdk

copy target/myproject-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java" , "-jar" , "/app.jar"]