.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
COBJ = CommitCleaner.class FilenameCleaner.class ContributorCleaner.class 


all: Makefile ${COBJ}

${COBJ}:
	${JC} `basename $@ .class`.java

CommitCleaner.class: CommitCleaner.java
FilenameClener.class: FilenameCleaner.java
ContributorCleaner.class: ContributorCleaner.java

