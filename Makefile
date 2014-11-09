.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
POBJ = Pollock.class
COBJ = ContributorCleaner.class ContributorCleanerStrategy.class ContributorCleanerStrategyImpl.class ContributorCleanerStub.class FileCommitCleaner.class FileCommitCleanerStrategy.class FileCommitCleanerStrategyImpl.class FileCommitCleanerStub.class FilenameCleaner.class FilenameCleanerStrategy.class FilenameCleanerStub.class 
DOBJ = ContributorCommitData.class FileCommitData.class FilenameData.class Splatter.class
SOBJ = SplatVector.class SplatVectorStrategy.class SplatVectorStub.class WorkQuant.class WorkQuantStrategy.class WorkQuantStub.class
GOBJ = GateKeeper.class

all: Makefile ${POBJ} ${GOBJ} ${DOBJ} ${COBJ} ${SOBJ} 
${DOBJ}:
	${JC} src/pollock/data/`basename $@ .class`.java

${COBJ}:
	${JC} src/pollock/cleaner/`basename $@ .class`.java

${SOBJ}:
	${JC} src/pollock/synth/`basename $@ .class`.java

${GOBJ}:
	${JC} src/pollock/gateKeeper/`basename $@ .class`.java

${POBJ}:
	${JC} src/pollock/`basename $@ .class`.java


clean: 
	find . -name "*.class"|xargs rm -rf

run: all
	java src/pollock/Pollock
