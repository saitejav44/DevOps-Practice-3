pipeline {
    agent any
    stages {
        stage('Init'){
            steps{
                echo 'Hi, This is a Practice file'
                echo 'We are starting the testing'
            }
        }
        stage('Build'){
            steps{
                echo 'Building sample Maven Project'
            }
        }
        stage('Deploy'){
            steps{
                echo 'We are in Staging Area'
                echo 'Deploying in Staging Area'
            }
        }
        stage('Deploy Production'){
            steps{
                echo 'We are in Production'
                echo 'Deploying in Production'
            }
        }
    }
}
