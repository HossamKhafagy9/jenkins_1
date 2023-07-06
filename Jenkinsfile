@Library('sprints') _

pipeline {
  agent any
  stages {
    echo "building here"
    stage('build') {
      steps {
        build()
      }
    }

    stage('Deploy') {
      steps {
        deploy()
      }
    }

    stage('Good') {
      steps {
        good()
      }
    }
  }
}
