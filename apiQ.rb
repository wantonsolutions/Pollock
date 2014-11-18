# This code grabs a bunch of user information from github

require 'octokit'
require 'thread/pool'
require 'thread'

usage = "Usage: \truby apiQ.rb <repo name> <github username> <github password>\nex)\truby apiQ.rb wantonsolutions/Pollock username password\n\n"

#determine repo
if ARGV.length < 1
	puts "please specify a repository\n"
	puts usage
	puts "using default repo wantonsolutions/Pollock"
	repository = 'wantonsolutions/Pollock'
else
	puts "attempting to use repo:\t" + ARGV[0]
	repository = ARGV[0]
end

#setup user login
if ARGV.length == 3
	puts "logging in"
	@client = Octokit::Client.new \
		:login =>ARGV[1],
		:password =>ARGV[2]
	user = @client.user
	user.login
else
	puts "Insufficiant login info using limited requester"
	puts usage
	@client = Octokit
end


@output1 = File.open("UserCommits.txt","w")
@output2 = File.open("FileCommits.txt","w")

@lockf1 = Mutex.new
@lockf2 = Mutex.new
sha = 0 
#get user commits

threads = []
#gets #otherwise the program ends without doing anything

@client.auto_paginate = true;
commits = @client.commits repository
pool = Thread.pool(commits.length)
commits.each do|commit| 
	pool.process{
	puts commit.commit.committer.date, commit.sha, "\n"
	#@lockf1.synchronize{
	@output1 << commit.sha 
	@output1 << ","
	@output1 << commit.commit.committer.name
	@output1 << ","
	@output1 << commit.commit.committer.date
	@output1 << "\n"
	#}
	
	puts "infile1"
	#@lockf2.synchronize{
	icommit = @client.commit(repository, commit.sha)
	files = icommit.files
	files.each do|file|
		puts icommit.sha
		@output2 << icommit.sha
		@output2 << ","
		@output2 << file.filename
		@output2 << ","
		@output2 << file.additions
		@output2 << ","
		@output2 << file.deletions
		@output2 << "\n"
	end
	@output2 << "\n"
	#}
	sleep(1);
}

	pool.shutdown
end
@output1.close
@output2.close
		
	

#get File Commits
#filename
#sha
#additions
#deletions
