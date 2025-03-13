
FROM openjdk:17-jdk

# Set work directory
WORKDIR /app

# Copy the jar package to the work directory
COPY target/*.war app.war

# Run Java application
CMD ["java", "-jar", "app.war"]