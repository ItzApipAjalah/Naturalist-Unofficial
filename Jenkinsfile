pipeline {
    agent any

    tools {
        // Defines the JDK to use. Make sure you have a JDK configured in your Jenkins Global Tool Configuration named 'jdk21' (or change this name to match yours)
        // Minecraft 1.21.x requires Java 21.
        jdk 'jdk21'
    }

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
