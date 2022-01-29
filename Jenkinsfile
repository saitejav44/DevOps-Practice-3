pipeline {
    agent any
    stages {
        stage('Build Application'){
            steps {
                sh 'mvn clean project'
            }
            post {
                success {
                    echo "Now archiving the Artifacts"
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
    }
}
