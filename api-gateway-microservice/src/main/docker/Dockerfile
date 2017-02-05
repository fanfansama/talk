FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD api-gateway-microservice-1.0-SNAPSHOT-exec.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV SERVER_PORT=8181
ENV EUREKA_INSTANCE_HOSTNAME="gateway"
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE="http://discovery:8761/eureka/"
EXPOSE 8181
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
