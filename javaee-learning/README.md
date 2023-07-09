# Build
mvn clean package && docker build -t javaee.learning/javaee-learning .

# RUN

docker rm -f javaee-learning || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee-learning javaee.learning/javaee-learning 