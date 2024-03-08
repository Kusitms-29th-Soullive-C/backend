#!/bin/bash

DEFAULT_CONF=" /etc/nginx/nginx.conf"

  echo "### BLUE => GREEN ####"
  echo ">>> green image를 pull합니다."
  docker-compose pull trothcam
  echo ">>> green container를 up합니다."
  docker-compose up -d trothcam
  while [ 1 = 1 ]; do
    echo ">>> green health check 중..."
    sleep 3
    REQUEST=$(curl http://127.0.0.1:8080)
    if [ -n "$REQUEST" ]; then
      echo ">>> 🍃 health check success !"
      break;
    fi
  done;
  sleep 3
  sudo nginx -s reload