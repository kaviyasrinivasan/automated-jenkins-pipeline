pipeline {
    agent any

    tools {
        maven 'Maven' // Match this to your Global Tool Config name
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
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
