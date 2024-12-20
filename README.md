
# Clone the repo, build the project, and run it locally using Docker.

git clone 

docker build -t book-app .

docker run -p 8080:8080 book-app

# Start Minikube and deploy

minikube start

kubectl apply -f deployment.yml

# Access the application
minikube service demo-app-service



