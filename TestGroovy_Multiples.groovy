job('DSL-Tutorial-1-Test') {
    description('Builds the app')
    scm {
       git(git('git://github.com/quidryan/aws-sdk-test.git')
    )
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
job('DSL-Tutorial-1-Test4') {
    description('Builds the app2')
    scm {
        git('git://github.com/quidryan/aws-sdk-test.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}