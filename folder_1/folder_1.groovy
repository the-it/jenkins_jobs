listView('project-dummy') {
    description('All dummy jobs')
    jobs {
        name('ls_repo')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}