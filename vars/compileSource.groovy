import com.santhi.*
def call(String mvngoals,String mvnparameters){
//	sh """
//		mvn $mvngoals $mvnparameters # (goals - clean,install,deploy,release:prepare,release:perform)(parameters- -Darguments="-Dmaven.test.skip=false,-Dmaven.test.failure.ignore=true")
//	"""
       def mvnHome = tool 'Maven'
               bat "\"${mvnHome}\"\\bin\\mvn --version"
               bat "\"${mvnHome}\"\\bin\\mvn $mvngoals $mvnparameters"
}
