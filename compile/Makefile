.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
COBJ = CommitCleaner.class FilenameCleaner.class ContributorCleaner.class 
SOBJ = SplatVector.class WorkQuant.class
GOBJ = gateKeeper.class

all: Makefile ${COBJ} ${SOBJ} ${GOBJ}

${COBJ}:
	${JC} ../src/pollock/cleaner/`basename $@ .class`.java

${SOBJ}:
	${JC} ../src/pollock/synth/`basename $@ .class`.java

${GOBJ}:
	${JC} ../src/pollock/gateKeeper/`basename $@ .class`.java
