#!/bin/bash
args=("$@")
repo=${args[0]}
ruby apiQ.rb
#make a repo to clone into
mkdir tempDir
cd tempDir
git clone $repo
repoName=`ls`
cd ..
echo $repoName

mkdir sgout
gitstats tempDir/$repoName ./sgout

ant run

#this line will have to take the output of pollock and throw it at processing

#yes | rm -r sgout
#yes | rm -r tempDir

