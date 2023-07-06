@Library('sprints') _

pipeline {
  agent any
  stages {
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
