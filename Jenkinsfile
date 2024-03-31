pipeline {
    agent {
        node {
            label 'naveen'
        }
    }

    stages {
        // stage('Clone Code') {
        //     steps {
        //         git branch: 'main', url: 'https://github.com/kalidindi-naveen/Simple_Maven.git'
        //     }
        // }
        stage('Build Code') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Static Code Analysis') {
        environment {
            SONAR_URL = "http://34.148.49.44:9000"
        }
            steps {
                    withCredentials([string(credentialsId: 'sonar-tkn', variable: 'SONAR_AUTH_TOKEN')]) {
                    sh 'mvn sonar:sonar -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.host.url=${SONAR_URL}'
                }
            }
        }
    }
}
