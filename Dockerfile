# Use the latest Ubuntu image as the base
FROM ubuntu:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the entire application to the working directory
COPY . /app

# Install dependencies: OpenJDK 11 and Maven
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk maven && \
    apt-get clean;

# Build the application using Maven
RUN mvn clean package -DskipTests


# Specify the JAR file name (replace 'your-app-name.jar' with the actual JAR file name)
ARG JAR_FILE=target/*.jar

# Copy the JAR file to the working directory
COPY ${JAR_FILE} Product-App-0.0.1-SNAPSHOT.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "Product-App-0.0.1-SNAPSHOT.jar"]


