@Library('sprints') _

pipeline {
  agent any
  
  stages {
    stage('build') {
      steps {
        build()
      }
    }
    
    stage('deploy') {
      steps {
        deploy()
      }
    }
    
    stage('good') {
      steps {
        good()
      }
    }
  }
}
