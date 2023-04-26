pipeline {
    agent any

    stages {
        stage('repo') {
            steps {
                git branch: 'master', url: 'https://github.com/luisaque/pps2.git'
            }
        }

        stage('contruirTrabajo') {
            steps {
                sh './mvnw clean package'
            }
        }
        stage('Desplegar') {
            steps {
                sh './mvnw spring-boot:run'
            }
        }
    }
}
