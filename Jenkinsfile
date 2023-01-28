pipeline {
  agent any
  stages {
    stage('Get Source Code') {
      steps {
        git(url: 'https://github.com/avnred666/ExploreDockerSeleniumGrid', branch: 'main')
      }
    }

    stage('Run maven command') {
      steps {
        bat 'mvn clean test -Dbrowser="Chrome"'
      }
    }

  }
}