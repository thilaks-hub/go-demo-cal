pipeline{
    agent any
    stages{
        stage(get code){
            git branch:'main', url:'https://github.com/ajilraju/go-demo-cal.git'
        }
        stage('build'){
            steps{
                echo "build stage passed"
            }   
        }

        stage('test'){
            steps{
                echo "test stage passed"
            }
            
        }
        stage('deploy'){
            steps{
                echo "deploy stage passed"
            }
            
        }

    }
}