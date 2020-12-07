cd C:\Satish\Kubernetes-Workspace\HelloWorld
mvn clean package -DskipTests
docker build -t "helloworld:latest" .
docker run -d --rm -p 8181:8181 --name hello1 helloworld:latest
docker run -d --rm -p 8181:8181 --env-file ./dev.properties --name hello1 helloworld:latest
docker run -d --rm -p 8485:8484 --name hello2 helloworld:latest