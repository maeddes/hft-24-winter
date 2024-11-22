# Step 1: Use an official OpenJDK runtime as the base image
FROM eclipse-temurin:21-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the application's JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port that the Spring Boot application runs on
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
