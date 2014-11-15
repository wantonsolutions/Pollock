# This code grabs a bunch of user information from github

require 'octokit'

client = Octokit::Client.new (:access_token =>"11a1d0e1ab571cd2404dac0adc3f408e1547df2d")

user = client.user
user.login

repository = 'wantonsolutions/Pollock'
output1 = File.open("UserCommits.txt","w")
output2 = File.open("FileCommits.txt","w")
sha = 0
#get user commits

Octokit.auto_paginate = true;
commits = Octokit.commits repository
commits.each do|commit| 
	output1 << commit.sha 
	output1 << ","
	output1 << commit.commit.committer.name
	output1 << ","
	output1 << commit.commit.committer.date
	output1 << "\n"
	
	icommit = Octokit.commit(repository, commit.sha)
	files = icommit.files
	files.each do|file|
		output2 << icommit.sha
		output2 << ","
		output2 << file.filename
		output2 << ","
		output2 << file.additions
		output2 << ","
		output2 << file.deletions
		output2 << "\n"
	end
	output2 << "\n"

#commits = Octokit.commits repository

end
output1.close
output2.close
		
	

#get File Commits
#filename
#sha
#additions
#deletions
