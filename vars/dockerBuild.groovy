// jenkins_shared_library/src/vars/dockerBuild.groovy

def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=9f7fecd8b3msh12fd2beea8d39abp1261e8jsnaed898b77c1c -t ${imageName} ."
    
    // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
    sh "docker push ${dockerHubUsername}/${imageName}:latest"
}
    }
