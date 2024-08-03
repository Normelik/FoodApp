
FROM gradle:jdk21-alpine AS builder
WORKDIR /app

COPY gradlew build.gradle settings.gradle ./
COPY gradle ./gradle

RUN ./gradlew dependencies

COPY . .

RUN ./gradlew bootJar

RUN ls -la /app/build/libs

FROM amazoncorretto:21-alpine
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
