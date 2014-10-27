# This code grabs a bunch of user information from github

require 'octokit'

repository = 'StewartGrant/Pollock'
output1 = File.open("UserCommits.txt","w")
output2 = File.open("FileCommits.txt","w")

#get user commits
commits = Octokit.commits repository
commits.each do|commit| 
	output1 << commit.sha 
	output1 << ","
	output1 << commit.commit.committer.name
	output1 << "\n"
end
output1.close

#commits.each do|commit|
#	files = commit.files
#	puts commit.files
#	files.each do|file|
#		output2 << commit.sha
#		output2 << ","
#		output2 << file.filename
#		output2 << ","
#		output2 << file.additions
#		output2 << ","
#		output2 << file.deletions
#		output2 << ","
#	end
#end
		
	

#get File Commits
#filename
#sha
#additions
#deletions
