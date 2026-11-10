
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar application-service.jar

EXPOSE 9092

ENTRYPOINT ["java", "-jar", "application-service.jar"]
