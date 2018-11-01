job('DSL-Tutorial-1-Test') {
    scm {
        git('git://github.com/videocursoscloud/test-jenkins-1.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}