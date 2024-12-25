# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Java class files to the container
COPY bin /app

# Run the Java application
CMD ["java", "test"]