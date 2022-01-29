pipeline {
    agent any
    stages {
        stage('Build Application'){
            steps {
                sh 'mvn -f pom.xml clean package'
            }
            post {
                success {
                    echo "Now archiving the Artifacts"
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
        stage('Deploy in stagin environment'){
            steps{
                build job: 'Deploy_Application_Staging_Env'
            }
        }
        stage('Deploy in Production environment'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'Approve Production Deployment ?'
                }
                build job: 'Deploy_Application_Production_Env'
            }
        }
    }
}
