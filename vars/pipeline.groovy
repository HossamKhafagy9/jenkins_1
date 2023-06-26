def call() {
    pipeline {
        agent any
        parameters {
            booleanParam(name: 'project', defaultValue: true, description: 'This parameter helps you to know the project name')
            choice(name: 'namespace', choices: ['dev', 'prod', 'stage'], description: 'Choose the namespace')
        }

        stages {
            stage('check') {
                steps {
                    echo "Checking your code"
                    echo "Namespace: ${params.namespace}"
                }
            }

            stage('test') {
                when {
                    expression {
                        params.project == true
                    }
                }
                steps {
                    echo "Testing your app"
                }
            }

            stage('deployment') {
                steps {
                    echo "Your code is being deployed right now"
                    echo "This build number: $BUILD_NUMBER"
                }
            }
        }
    }
}
