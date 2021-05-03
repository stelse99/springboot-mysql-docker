pipeline{
    agent any
    tools{
        maven "maven3.8.1"
    }
    stages{
        stage("build"){
            stpes{
                sh "mvn --version"
                sh "mvn clean install"
            }
        }

    }
    post{
        always{
            cleanWs()
        }
    }
}
