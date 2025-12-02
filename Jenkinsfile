pipeline {
    agent any
    
    tools {
        maven 'M3'  
    }
    
    options {
        timeout(time: 30, unit: 'MINUTES')
        // Ajout pour suivre les builds déclenchés par webhook
        disableConcurrentBuilds()
    }
    
    environment {
        APP_ENV = "DEV"
        BUILD_TRIGGER = "UNKNOWN"
    }
    
    triggers {
        // Déclencheur GitHub pour webhook
        githubPush()
    }
    
    stages {
        stage('Détection du déclencheur') {
            steps {
                script {
                    // Détermine ce qui a déclenché le build
                    if (currentBuild.getBuildCauses('com.cloudbees.jenkins.GitHubPushCause').size() > 0) {
                        env.BUILD_TRIGGER = "GITHUB_WEBHOOK"
                        echo "🚀 Build déclenché par Webhook GitHub"
                    } else {
                        env.BUILD_TRIGGER = "MANUAL"
                        echo "👤 Build déclenché manuellement"
                    }
                }
            }
        }
        
        stage('Checkout du Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Ahmeddhib/test_spring_boot.git',
                credentialsId: 'ahmeddhib',
                poll: false  // Désactive le polling, utilise seulement le webhook
            }
        }
        
        stage('Build avec Maven') {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true'
            }
        }
        
        stage('Test Webhook') {
            steps {
                script {
                    echo "=== INFORMATIONS WEBHOOK ==="
                    echo "Déclencheur: ${env.BUILD_TRIGGER}"
                    echo "Branch: ${env.GIT_BRANCH}"
                    echo "Commit: ${env.GIT_COMMIT}"
                    echo "URL: ${env.GIT_URL}"
                    
                    // Log supplémentaire pour le débogage
                    if (env.BUILD_TRIGGER == "GITHUB_WEBHOOK") {
                        echo "✅ WEBHOOK FONCTIONNEL - Build automatique activé"
                    }
                }
            }
        }
    }
    
    post {
        always {
            echo "====== Étape toujours exécutée ======"
            echo "Déclencheur: ${env.BUILD_TRIGGER}"
            echo "Durée: ${currentBuild.durationString}"
        }
        success {
            echo "===== Pipeline exécuté avec succès ====="
            script {
                if (env.BUILD_TRIGGER == "GITHUB_WEBHOOK") {
                    echo "🎉 Webhook GitHub fonctionne parfaitement !"
                }
            }
        }
        failure {
            echo "====== Échec de l'exécution du pipeline ======"
        }
        changed {
            echo "=== Statut du build changé ==="
        }
    }
}
