pipeline {
    agent any

    stages {
        stage('SonarQube analysis') {
            steps {
                script {
                    withSonarQubeEnv('GTE3-sonar') {
                        // Use the correct syntax for Maven
                        sh 'mvn clean org.sonarsource.scanner.maven:sonar-maven-plugin:2.16.1:sonar'
                    }
                }
            }
        }
    }
}
