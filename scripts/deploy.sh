#!/bin/bash

# 변수 설정
IMAGE_NAME="emilywin825/soullive"
CONTAINER_NAME="soullive"
HOST_PORT=8080
CONTAINER_PORT=8080

# 이미지 빌드
docker build -t $IMAGE_NAME .

# 기존 컨테이너 제거
docker stop $CONTAINER_NAME 2>/dev/null
docker rm $CONTAINER_NAME 2>/dev/null

# 컨테이너 실행
docker run -d -p $HOST_PORT:$CONTAINER_PORT --name $CONTAINER_NAME -e TZ=Asia/Seoul $IMAGE_NAME
