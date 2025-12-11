#!user/bin/env groovy

def call() {
    echo "Cleaning and Building the .jar application..."
    sh 'mvn clean package'
}