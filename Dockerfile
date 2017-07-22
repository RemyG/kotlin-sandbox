FROM frolvlad/alpine-oraclejdk8:slim

ARG IMAGE_VERSION

VOLUME /tmp
ADD target/demo-${IMAGE_VERSION}.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]