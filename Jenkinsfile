pipeline{
    agent any
    tools{
        maven 'apache-maven-3.9.8'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bhanus-git/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t springboot/devops-integration:latest .'
                }
            }

        }
        stage('push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker', variable: 'vardockerpassword')]) {
                        bat 'docker login -u bhanusbc -p ${vardockerpassword}'
                        bat 'docker push bhanusbc/devops-integration:latest'
                    }
                }
            }
        }
    }
}