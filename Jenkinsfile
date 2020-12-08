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
		stage("Checkout"){
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
		stage("k8s") {
			steps {
				bat "kubectl config get-contexts"
				}
		}
	}	

}