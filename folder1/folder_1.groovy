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

folder('folder1') {
    displayName('Project A')
    description('Folder for project A')
}

folder('folder1/testing') {
    description('Folder containing all QA jobs for project A')
}