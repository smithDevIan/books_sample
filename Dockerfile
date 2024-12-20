FROM maven AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests


FROM openjdk:21
EXPOSE 8081
WORKDIR /app
COPY --from=builder /app/target/books-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Duser.timezone=EAT", "-Dspring.profiles.active=dev","-jar","app.jar"]

