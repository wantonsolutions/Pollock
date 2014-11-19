#!/bin/bash
args=("$@")
repo=${args[0]}
uname=${args[1]}
pword=${args[2]}
pDir=${args[3]}

#pDir="../processing-2.2.1"

#tempdir=`fgrep pdir .conf`

#OIFS="$IFS"
#IFS=':' 
#read -ra ADDR <<< "$tempdir"
#IFS="$OIFS"
#for i in "${ADDR[@]}"; do
#	echo "${ADDR[i]}"
#	pDir="${ADDR[i]}"
#done


ruby apiQ.rb $repo $uname $pword
#make a repo to clone into

ant run

tac FileCommits.txt > FileCommits.txt
tac UserCommits.txt > UserCommits.txt

#move the drawable output to processing
mv out.txt $pDir/draw/draw/data
cp src/pollock/draw.pde $pDir/draw/draw/
cur=`pwd`
cd $pDir
./processing-java --run --force --sketch=draw/draw --output=r

#this line will have to take the output of pollock and throw it at processing
#sleep 10

cd $cur

ant distclean
yes | rm FileCommits.txt
yes | rm UserCommits.txt
yes | rm -r sgout
yes | rm -r tempDir
yes | rm *.txt
