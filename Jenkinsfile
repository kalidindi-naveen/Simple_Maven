pipeline {
    agent {
        node {
            label 'build-server'
        }
    }

    stages {
        stage('Build Code') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
