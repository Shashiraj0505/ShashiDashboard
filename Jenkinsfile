 pipeline{
    agent any
    
    stages {
        stage ('Build'){
           steps {  
               withMaven(maven:'MAVEN_HOME'){  
                   sh 'mvn clean'
               }
           }
        }
 		stage ('Test'){
           steps {            
               withMaven(maven:'MAVEN_HOME'){                 
                   sh 'mvn test'
               }
           }
        }
         stage ('Deploy'){   
           steps {              
               withMaven(maven:'MAVEN_HOME'){              
                   sh 'mvn deploy'
               }
           }
        }
    }
}
