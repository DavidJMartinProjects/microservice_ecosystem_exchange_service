openjdk:8u171-alpine

EXPOSE 8080
#install Spring Boot artifact
VOLUME /tmp
ADD /target/exchange_rates-0.0.1-SNAPSHOT.jar exchange_rates.jar
RUN sh -c 'touch /exchange_rates.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/exchange_rates.jar"]
