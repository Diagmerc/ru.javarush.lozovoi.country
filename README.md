To start this app you need get MySQL from docker with command:
docker run --name testDB -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:latest
Also you need to get Redis from docker with command:
docker run -d --name redis-stack -p 6379:6379 -p 8001:8001 redis/redis-stack:latest