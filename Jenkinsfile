pipeline {
    agent any
    stages {
        stage('Build Application'){
            steps {
                maven('clean package', 'pom.xml')
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
