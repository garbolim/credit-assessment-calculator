./mvnw clean install

docker build --no-cache -t exercise .

docker run --rm -p 8080:8080 -t exercise