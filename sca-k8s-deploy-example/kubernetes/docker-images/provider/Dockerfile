FROM registry.cn-hangzhou.aliyuncs.com/yuluo-yx/java-base:V20240116

LABEL author="yuluo" \
	email="karashouk.pan@gmail.com"

COPY app.jar /app.jar
COPY application-k8s.yml /application-k8s.yml

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
