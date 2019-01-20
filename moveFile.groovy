pipeline {
	agent any
	stages {
	    stage('createFile') {
	        steps {
	              bat """
	                cd c:/users/nivmi/PycharmProjects/github-test
                    move myapp.py c:/users/nivmi/desktop/
	              """
	        }
	    }
	}
}