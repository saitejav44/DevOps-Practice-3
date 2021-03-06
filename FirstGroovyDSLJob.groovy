job('FirstMavenProject_DSL') {
    description("First maven job generated by the DSL on ${new Date()}, the project is a small maven project hosted on github")
    scm {
        git("https://github.com/saitejav44/DevOps-Practice-3.git", */master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'pom.xml')
    }
    publishers {
        //Archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}
