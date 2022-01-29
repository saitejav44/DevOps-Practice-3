pipeline {
    agent any
    stages {
        stage('Init'){
            steps {
                echo "Copying project from Git repository"
                scm {
                    git("git@github.com:saitejav44/DevOps-Practice-3.git", 'master')
                }
                echo "Triggering Poll SCM - To execute the Job whenever new commit made in Git"
                triggers {
                    scm('* * * * *')
                    }
            }
            steps {
                echo "Exevuting maven command"
                maven('clean package', 'pom.xml')
            }
            steps {
                publishers {
                    echo "Archive the war file generated"
                    archiveArtifacts '**/*.jar'
                    }
                }
            }
        }
    }
}
