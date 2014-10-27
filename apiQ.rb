# This code grabs a bunch of user information from github

require 'octokit'

output1 = File.open("UserCommits.txt","w")
output2 = File.open("FileCommits.txt","w")

#get user commits
commits = Octokit.commits 'StewartGrant/Pollock'
commits.each do|commit| 
	output1 << commit.sha 
	output1 << ","
	output1 << commit.commit.committer.name
	output1 << "\n"
end
output1.close

#get File Commits






