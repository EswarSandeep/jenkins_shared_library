def call(){
    sh 'docker stop youtube'
    sh 'docker rm youtube'
}