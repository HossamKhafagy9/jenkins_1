@Library('sprints') _

pipeline {
  agent any
  
  stages {
    stage('Build') {
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
