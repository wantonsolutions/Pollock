# This code grabs a bunch of user information from github

require 'metior'
require 'metior/adapter/octokit'


#Metior.report :git, '~/School/410/Pollock', './reports/metior'
#Metior.simple_stats :git, '~/School/410/Pollock'

#Metior.report :github, 'koraktor/metior', './reports/metior'

@repo = Metior::Adapter::Octokit::Repository.new 'koraktor/metior'
commits = @repo.send :load_commits, ''..'master'
puts commits
