#!/bin/bash
args=("$@")
repo=${args[0]}
#ruby apiQ.rb
#make a repo to clone into

#mkdir tempDir
#cd tempDir
#git clone $repo
#repoName=`ls`
#cd ..
#echo $repoName

#mkdir sgout
#gitstats tempDir/$repoName ./sgout

ant run

#move the drawable output to processing
mv DrawableOutput.txt ../processing-2.2.1/draw/draw/data
cd ../processing-2.2.1
./processing-java --run --force --sketch=draw/draw --output=r #DrawableOutput.txt

#this line will have to take the output of pollock and throw it at processing
#sleep 10

cd ../pollock

#ant distclean
#yes | rm -r sgout
#yes | rm -r tempDir
#yes | rm *.txt
