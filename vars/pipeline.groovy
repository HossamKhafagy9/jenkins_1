def call() {
    stage('Test') {
        steps {
            echo "Testing your app"
        }
    }

    stage('Deploy') {
        steps {
            echo "Your code is being deployed right now"
            echo "This build number: $BUILD_NUMBER"
        }
    }
}
