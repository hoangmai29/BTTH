pipeline {
    agent any

    environment {
        APP_NAME = 'cicd_bt'
        JAR_NAME = 'cicd_bt-0.0.1-SNAPSHOT.jar'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/hoangmai29/BTTH.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Run App') {
            steps {
                bat 'start /b java -jar target\\%JAR_NAME%'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
        failure {
            echo 'Pipeline failed.'
        }
        success {
            echo 'Application built and deployed successfully.'
        }
    }
}
