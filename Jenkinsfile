pipeline {
    agent any
    tools {
        maven 'M3' 
    }
    stages {
        stage('Clone Project') {
            steps{
            echo 'Cloning Project from Github'
            git 'https://github.com/SudhaSanthakumar/Jenkins_CICD.git'
            }
        }
        stage('Build Project') {
             steps{
             echo 'building Project'
             bat 'mvn package'
             }
        
        }
        stage('Build Docker Image') {
             steps{
             echo 'building docker image'
             bat 'docker build -t sudhasantha/movie-app .'
             }
        
        }
        stage('Push Docker Image') {
             steps{
              withCredentials([string(credentialsId: 'docker-hub', variable: 'dockerHubPwd')]) {
                bat "docker login -u sudhasantha -p ${dockerHubPwd}"
             }
             echo 'Pushing docker image to DockerHub'
             bat 'docker push sudhasantha/movie-app'
             }
        }
       stage('Create Docker Container') {
             steps{
             echo 'Creating docker container from image'
             bat 'docker run -d -p 8083:8083 --name mymovieapp1  sudhasantha/movie-app .'
             }
        
        }
    }
}