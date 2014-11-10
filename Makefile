.SUFFIXES: .java .class

#compiler
JC	= javac

#classObjects
POBJ = Pollock.class
COBJ = ContributorCleaner.class ContributorCleanerStrategy.class ContributorCleanerStrategyImpl.class ContributorCleanerStub.class FileCommitCleaner.class FileCommitCleanerStrategy.class FileCommitCleanerStrategyImpl.class FileCommitCleanerStub.class FilenameCleaner.class FilenameCleanerStrategy.class FilenameCleanerStub.class 
DOBJ = ContributorCommitData.class FileCommitData.class FilenameData.class Splatter.class
SOBJ = SplatVector.class SplatVectorStrategy.class SplatVectorStub.class WorkQuant.class WorkQuantStrategy.class WorkQuantStub.class
GOBJ = GateKeeper.class
TOBJ = TestContributorCleanerStrategyImpl.class TestDrawingInstruction.class TestSplatVectorStub.class TestWorkQuantStub.class

all: Makefile ${POBJ} ${GOBJ} ${DOBJ} ${COBJ} ${SOBJ} ${TOBJ}

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

${TOBJ}:
	${JC} src/pollock/test/`basename $@ .class`.java -cp "./src;./junit/junit.jar"

clean: 
	find . -name "*.class"|xargs rm -rf

run: all
	java src/pollock/Pollock
