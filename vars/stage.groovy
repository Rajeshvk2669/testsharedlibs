def call (string maven Goal) {
if ("${maven Goal}" == "clean")
   {
    sh "mvn clean"
   }
   else if ("${maven Goal}" == "compile") 
   {
    sh "mvn compile"
   }
   else if ("${maven Goal}" == "test")
   {
   sh "mvn test"
   }
   else if ("${maven Goal}" == "package")
   {
    sh "mvn package"
   }
   else if ("${maven Goal}" == "install")
   {
   sh "mvn install"
   }
   else if ("${maven Goal}" == "sonar")
   {
    sh "mvn sonar:sonar"
    }
    else if ("${maven Goal}" == "deploy")
    {  
     sh "mvn deploy"
   }
}
