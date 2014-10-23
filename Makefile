.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
COBJ = FileCommitCleaner.class FilenameCleaner.class ContributorCleaner.class ContributorCleanerStrategy.class ContributorCleanerStub.class
DOBJ = ContributorCommitData.class FileCommitData.class FilenameData.class
SOBJ = SplatVector.class WorkQuant.class
GOBJ = gateKeeper.class

all: Makefile ${DOBJ} ${COBJ} ${SOBJ} ${GOBJ}

${DOBJ}:
	${JC} src/pollock/data/`basename $@ .class`.java

${COBJ}:
	${JC} src/pollock/cleaner/`basename $@ .class`.java

${SOBJ}:
	${JC} src/pollock/synth/`basename $@ .class`.java

${GOBJ}:
	${JC} src/pollock/gateKeeper/`basename $@ .class`.java


clean: 
	find . -name "*.class"|xargs rm -rf
