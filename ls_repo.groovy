job('ls_repo') {
    logRotator(-1, 10)
    scm {
        github('the-it/WS_THEbotIT', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        shell('ls')
    }
}