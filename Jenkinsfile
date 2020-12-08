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
				//cleanWs()
				//println 'Stage checkout'
				git url: "git@github.com:satishcheppalli/HelloWorldK8S.git", branch: "main", credentialsId: 'github_ssh'
				}
		}
		stage("Build") {
			steps {
				bat "mvn clean package -DskipTests"
				}
		}
	}	

}