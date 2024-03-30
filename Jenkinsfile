pipeline {
    agent {
        node {
            label 'build-server'
        }
    }

    stages {
        stage('Clone Code') {
            steps {
                git branch: 'main', url: 'https://github.com/kalidindi-naveen/Simple_Maven.git'
            }
        }
        stage('Build Code') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
