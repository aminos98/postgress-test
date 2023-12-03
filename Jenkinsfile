pipeline {
   stages{
     stage('SonarQube analysis') {
    withSonarQubeEnv('GTE3-sonar') { // You can override the credential to be used
      //sh 'mvn clean install -DskipTests'
      sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:2.16.1:sonar'
    }
  }
    }
}
