from maven:3.8.5-openjdk-17 as build
copy . .
run mvn clean package -DskipTests

from openjdk:17.o.1-jdk-slim
copy --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
expose 8080
entrypoint ["java","-jar","demo.jar"]