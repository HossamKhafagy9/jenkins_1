@Library('sprints') _
pipeline {
	agent any
	stages {
		stage('build') {
			steps {
				build()
			}
		}
	}

	stages {
		stage('Deploy') {
			steps {
				deploy()
			}
		}
	}

	stages {
		stage('Good') {
			steps {
				good()
			}
		}
	}

}
