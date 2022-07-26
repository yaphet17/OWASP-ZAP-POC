FROM openjdk:8
EXPOSE 8080
ADD target/owasp-zap-poc.jar owasp-zap-poc.jar
ENTRYPOINT ["java","-jar","/owasp-zap-poc.jar"]
