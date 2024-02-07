def call() {
    sh 'trivy image eswarsandeepdonkina/youtube:latest > trivyimage.txt'
}