


## 创建MySQL Docker容器，并启动
```bash
docker pull wolfdeng/mysql
```

```bash
docker run --name mysql-flyway -p 3306:3306 \
    -e MYSQL_DATABASE=FLYWAY -e MYSQL_USER=flyway \
    -e MYSQL_PASSWORD=flyway-samples \
    -e MYSQL_ROOT_PASSWORD=PassW0rd -it -d wolfdeng/mysql
```