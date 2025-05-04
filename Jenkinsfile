pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6' // Use the name from Global Tool Config
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/kaviyasrinivasan/automated-jenkins-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Test Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
