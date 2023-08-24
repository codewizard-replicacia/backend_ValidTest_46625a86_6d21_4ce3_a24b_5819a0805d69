FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_ValidTest_46625a86_6d21_4ce3_a24b_5819a0805d69 backend_ValidTest_46625a86_6d21_4ce3_a24b_5819a0805d69
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_ValidTest_46625a86_6d21_4ce3_a24b_5819a0805d69/target/ValidTest-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar ValidTest-0.0.1-SNAPSHOT.jar"]