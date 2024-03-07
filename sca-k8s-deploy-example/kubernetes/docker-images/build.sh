#!/bin/bash

package() {
  cd consumer
  docker build -t registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-consumer-service .
  cd -
  cd provider
  docker build -t registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-provider-service .
}

push() {
  docker tag registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-consumer-service registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-consumer-service:latest
  docker push registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-consumer-service:latest
  docker tag registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-provider-service registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-provider-service:latest
  docker push registry.cn-hangzhou.aliyuncs.com/yuluo-yx/sca-k8s-demo-provider-service:latest
}

package
push
