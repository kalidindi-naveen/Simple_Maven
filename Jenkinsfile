pipeline {
    agent {
        node {
            label 'naveen'
        }
    }

    stages {
        stage('Build Code') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
