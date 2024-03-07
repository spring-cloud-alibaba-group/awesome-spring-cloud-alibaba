FROM registry.cn-hangzhou.aliyuncs.com/yuluo-yx/java-base:V20240116

LABEL author="yuluo" \
	email="karashouk.pan@gmail.com"

ARG INNER_CONSUMER_PORT
ARG CONSUMER_ACTUATOR_PORT
ARG CONSUMER_APPS

COPY ${CONSUMER_APPS}app.jar /app.jar
COPY ${CONSUMER_APPS}application-docker.yml /application-docker.yml

EXPOSE ${INNER_CONSUMER_PORT}
EXPOSE ${CONSUMER_ACTUATOR_PORT}

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=docker"]
