pipeline {
   stages{
     stage('SonarQube analysis') {
    withSonarQubeEnv('GTE3-sonar') { // You can override the credential to be used
      //sh 'mvn clean install -DskipTests'
      sh 'mvn sonar:sonar -Dsonar.java.binaries=target/classes'
    }
  }
    }
}
