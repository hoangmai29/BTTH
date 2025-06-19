pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10' // Tên cấu hình Maven trong Jenkins
        jdk 'JDK 17'         // Tên cấu hình JDK trong Jenkins
    }

    environment {
        APP_NAME = 'cicd_bt'
        JAR_NAME = 'cicd_bt-0.0.1-SNAPSHOT.jar'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/<your-username>/<your-repo>.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run App') {
            steps {
                sh 'nohup java -jar target/${JAR_NAME} &'
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
