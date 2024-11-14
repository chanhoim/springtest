pipeline {

    agent any

    stages {

        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Build") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Unit text") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}