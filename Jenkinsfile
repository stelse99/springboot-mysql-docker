pipeline{
    agent any
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
