FROM java:8-jdk-alpine
COPY ./target/exchange_rates-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
RUN sh -c 'exchange_rates-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "exchange_rates-0.0.1-SNAPSHOT.jar"]

# build image
# docker build -t news-app .
# run image and expose port
# docker run -p 8080:8080 {image id}
