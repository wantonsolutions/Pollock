package src.pollock.gateKeeper;

import src.pollock.cleaner.*;
import src.pollock.synth.*;

public class GateKeeper {
	private static GateKeeper gateKeeper = null;

	public static enum ContributorCleanerImp {
		STUB, V1
	}

	public static enum FileCommitCleanerImp {
		STUB, V1
	}

	public static enum FilenameCleanerImp {
		STUB, V1
	}

	public static enum SplatVectorImp {
		STUB, V1
	}

	public static enum WorkQuantImp {
		STUB, V1
	}

	private static ContributorCleanerImp ContributorCleanerSelection;
	private static FileCommitCleanerImp FileCommitCleanerSelection;
	private static FilenameCleanerImp FilenameCleanerSelection;
	private static SplatVectorImp SplatVectorSelection;
	private static WorkQuantImp WorkQuantSelection;

	// to prevent instantiation from a global reference
	protected GateKeeper() {
		setContributorCleaner(ContributorCleanerImp.V1);
		setFileCommitCleaner(FileCommitCleanerImp.V1);
		setFilenameCleaner(FilenameCleanerImp.STUB);
		setSplatVector(SplatVectorImp.STUB);
		setWorkQuant(WorkQuantImp.STUB);

	}

	public static GateKeeper getGateKeeper() {
		if (gateKeeper == null) {
			gateKeeper = new GateKeeper();
		}
		return gateKeeper;
	}

	/* Getters and setters for all the components */
	// ContributorCleanerSelection getter and setter
	public ContributorCleanerImp getContributorCleaner() {
		return ContributorCleanerSelection;
	}

	public void setContributorCleaner(ContributorCleanerImp imp) {
		ContributorCleanerSelection = imp;
	}

	// FileCommitCleanerSelection getter and setter
	public FileCommitCleanerImp getFileCommitCleaner() {
		return FileCommitCleanerSelection;
	}

	public void setFileCommitCleaner(FileCommitCleanerImp imp) {
		FileCommitCleanerSelection = imp;
	}

	// FilenameCleanerSelection getter and setter
	public FilenameCleanerImp getFilenameCleaner() {
		return FilenameCleanerSelection;
	}

	public void setFilenameCleaner(FilenameCleanerImp imp) {
		FilenameCleanerSelection = imp;
	}

	// SplatVectorSelection getter and setter
	public SplatVectorImp getSplatVector() {
		return SplatVectorSelection;
	}

	public void setSplatVector(SplatVectorImp imp) {
		SplatVectorSelection = imp;
	}

	// WorkQuantSelection getter and setter
	public WorkQuantImp getWorkQuant() {
		return WorkQuantSelection;
	}

	public void setWorkQuant(WorkQuantImp imp) {
		WorkQuantSelection = imp;
	}
}
