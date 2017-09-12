#!groovy

node {

	stage('Checkout'){
		checkout scm
	}

	stage('Build'){
		sh "gradle build"
	}

	stage('Archive'){
		def server = Artifactory.server 'myartifactoryserver'
		def uploadSpec = readFile 'artifactory/props-upload.json'
		def buildInfo1 = server.upload spec: uploadSpec
		def downloadSpec = readFile 'artifactory/props-download.json'
		def buildInfo2 = server.download spec: downloadSpec
		buildInfo1.append buildInfo2
		server.publishBuildInfo buildInfo1
	}

}