def call(){ 

	def BranchName=branchName()

	if (isFeature(BranchName) || isDev(BranchName)){
		return 'feature-pipeline.groovy'
	}
	else if (isPR()){
		return 'pr-pipeline.groovy'	
	}
	else if (isRelease(BranchName) || isMaster(BranchName)){
		return 'release-pipeline.groovy'
	}
	else{
		println "please check the branch Naming Convention.. It should be either feature/dev/devlopment/release/master/hotfix "
	}
}
def branchName(){
	return env.BRANCH_NAME
}

def isPR(){
	if(env.BRANCH_NAME ==~ /PR-\d+/){ return true }
}

def isRelease(String BranchName){
	if(BranchName.toLowerCase() ==~ /^release\//){ return true }
}

def isFeature(String BranchName){
	if(BranchName.toLowerCase() ==~ /^feature\//){ return true}
}

def isDev(String BranchName){
	if(BranchName.toLowerCase() ==~ /^develop$/ || BranchName.toLowerCase() ==~ /^dev$/){ return true }	
}

def ismaster(String BranchName){
	if(BranchName.toLowerCase() ==~ /^master$/ || BranchName.toLowerCase() ==~ /^hotfix$/){return true}	
}