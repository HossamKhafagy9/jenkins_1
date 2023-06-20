pipeline {
    agent any
    parameters {
        string(name: 'GREETING', defaultValue: 'Hello', description: 'Greeting to use')
        string(name: 'NAME', defaultValue: 'World', description: 'Name to greet')
    }
    environment {
        HOMEDIR = "${env.WORKSPACE}"
    }
    stages {
        stage('Example') {
            steps {
                echo "${params.GREETING}, ${params.NAME} from ${env.HOMEDIR}"
            }
        }
    }
}

