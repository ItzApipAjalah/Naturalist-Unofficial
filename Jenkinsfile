pipeline {
    agent any



    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Prepare') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'chmod +x ./gradlew'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh './gradlew build'
                    } else {
                        bat 'gradlew.bat build'
                    }
                }
            }
        }
    }

    post {
        success {
            // Archive the compiled mod jar files so you can download them from the Jenkins UI
            archiveArtifacts artifacts: 'build/libs/**/*.jar, fabric/build/libs/**/*.jar, forge/build/libs/**/*.jar', allowEmptyArchive: true
            echo 'Build completed successfully! Artifacts have been archived.'
        }
        failure {
            echo 'Build failed. Please check the console output for details.'
        }
    }
}
