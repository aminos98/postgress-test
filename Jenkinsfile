pipeline {
    agent any

    stages {
        stage('SonarQube analysis') {
            steps {
                script {
                    withSonarQubeEnv('GTE3-sonar') {
                        // Use the correct syntax for Maven
                        sh 'mvn clean install -DskipTests'
                        sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
                    }
                }
            }
        }
    }
}
