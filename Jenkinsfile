pipeline {
    agent any
    
    tools {
        maven 'M3'  
    }
    
    options {
        timeout(time: 30, unit: 'MINUTES')  
    }
    
    environment {
        APP_ENV = "DEV"
    }
    
    stages {
        stage('Checkout du Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Ahmeddhib/test_spring_boot.git',
                credentialsId: 'ahmeddhib'
            }
        }
        
        stage('Build avec Maven') {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true'
            }
        }
    }
    
    post {
        always {
            echo "====== Étape toujours exécutée ======"
        }
        success {
            echo "===== Pipeline exécuté avec succès ====="
        }
        failure {
            echo "====== Échec de l'exécution du pipeline ======"
        }
    }
}
