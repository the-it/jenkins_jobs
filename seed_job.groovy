job('seed_job') {
    logRotator(-1, 10)
    scm {
        github('the-it/jenkins_jobs', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        dsl {
            external('**/*.groovy')
            removeAction('DISABLE')
        }
    }
}