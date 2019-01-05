pipeline {
	 agent any
	 triggers {
	 	pollSCM('* * * * *')
	 }
	 stages {
		  stage("Compile") {
			   steps {
					sh "./mvnw compile"
			   }
		  }
		  stage("Unit test") {
			   steps {
					sh "./mvnw test"
			   }
		  }
	 }
}
