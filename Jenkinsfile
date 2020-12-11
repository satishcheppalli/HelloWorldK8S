pipeline {
agent any

	tools {
			jdk 'JAVA_8'
			maven 'Maven'
		}
	environment {
		APP_NAME="HelloWorldK8S"
	}
	stages {
/*		stage("Checkout"){
			steps {
				git url: "git@github.com:satishcheppalli/HelloWorldK8S.git", branch: "main", credentialsId: 'github_ssh'
				}
		}
		stage("Build") {
			steps {
				bat "mvn clean package -DskipTests"
				bat "docker build -t helloworld:latest ."
				}
		}
*/		
		stage("k8s") {
			steps {
				//bat "kubectl config --kubeconfig=C:\Users\2750344\.kube\config"
				bat "kubectl config --kubeconfig=C:/Users/2750344/.kube/config get ns satish-ns"
				echo "Hi"
				}
		}
	}	

}
