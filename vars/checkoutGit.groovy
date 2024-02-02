def call(String gitUrl, String gitBranch){
checkout([
    $class: 'scmGit'
    branches: [[name: 'gitBranch']],
    extensions: [],
    userRemoteConfigs: [[url: 'gitUrl']]
    ])
}