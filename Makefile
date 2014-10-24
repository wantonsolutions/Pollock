.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
COBJ = ContributorCleaner.class ContributorCleanerStrategy.class ContributorCleanerStub.class FileCommitCleaner.class FileCommitCleanerStrategy.class FileCommitCleanerStub.class FilenameCleaner.class FilenameCleanerStrategy.class FilenameCleanerStub.class
DOBJ = ContributorCommitData.class FileCommitData.class FilenameData.class Splatter.class
SOBJ = SplatVector.class SplatVectorStrategy.class SplatVectorStub.class WorkQuant.class WorkQuantStrategy.class WorkQuantStub.class
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
