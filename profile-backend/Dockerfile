FROM eclipse-temurin:17-jdk

WORKDIR /app

# install dos2unix to fix Windows line endings
RUN apt-get update && apt-get install -y dos2unix

COPY . .

# fix mvnw line endings + permissions
RUN dos2unix mvnw
RUN chmod +x mvnw

# build
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/profile-backend-0.0.1-SNAPSHOT.jar"]
