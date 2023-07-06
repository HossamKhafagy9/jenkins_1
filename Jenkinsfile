@Library('sprints') _

pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo "building here"
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
