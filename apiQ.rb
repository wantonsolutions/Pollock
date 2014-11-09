# This code grabs a bunch of user information from github

require 'octokit'

repository = 'wantonsolutions/Pollock'
output1 = File.open("UserCommits.txt","w")
output2 = File.open("FileCommits.txt","w")
sha = 0
#get user commits
commits = Octokit.commits repository
commits.each do|commit| 
	output1 << commit.sha 
	output1 << ","
	output1 << commit.commit.committer.name
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
