#!/bin/bash
args=("$@")
repo=${args[0]}
uname=${args[1]}
pword=${args[2]}
pDir="../processing-2.2.1"

tempdir=`fgrep pdir .conf`

#OIFS="$IFS"
#IFS=':' 
#read -ra ADDR <<< "$tempdir"
#IFS="$OIFS"
#for i in "${ADDR[@]}"; do
#	echo "${ADDR[i]}"
#	pDir="${ADDR[i]}"
#done


#ruby apiQ.rb $repo $uname $pword
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
mv out.txt $pDir/draw/draw/data
cp src/pollock/draw.pde $pDir/draw/draw/
cd $pDir
./processing-java --run --force --sketch=draw/draw --output=r

#this line will have to take the output of pollock and throw it at processing
#sleep 10

cd ../pollock

#ant distclean
#yes | rm -r sgout
#yes | rm -r tempDir
#yes | rm *.txt
