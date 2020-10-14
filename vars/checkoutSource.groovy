import com.santhi.*
def  call(String scmurl ,String brancName){
     checkout([$class: 'GitSCM',branches: [[name:$branchName]],doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'LocalBranch',localBranch: "**"]],submoduleCfg: [], userRemoteConfigs: [[credentialsId: Constants.github_Creds, url:"$scmurl"]]])	
}
def  call(String scmurl,String dir ,String brancName){
     checkout([$class: 'GitSCM',branches: [[name:$branchName]],doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'LocalBranch',localBranch: "**"]],extensions: [[$class: 'RelativeTargetDirectory', 
            relativeTargetDir: "dir"]],submoduleCfg: [], userRemoteConfigs: [[credentialsId: Constants.github_Creds, url:"$scmurl"]]])	
}