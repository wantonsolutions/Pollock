/*
	CommitCleaner queries Metior for user commits, and builds a workable commiter structure out of them.

*/
package src.pollock.cleaner;

import src.pollock.data.FileCommitData;
import src.pollock.gateKeeper.GateKeeper;

public class FileCommitCleaner
{

	private FileCommitData data;		//data associated with the File commits
	private FileCommitCleanerStrategy imp; //the particular implementation of the File cleaner
	private String filename;
	
	/* when initalizing File cleaner determine which implementation will be used by asking gatekeeper */
	public FileCommitCleaner(String filename)
	{
		this.filename = filename;
		GateKeeper gate = GateKeeper.getGateKeeper();
		GateKeeper.FileCommitCleanerImp cImp = gate.getFileCommitCleaner();
		switch(cImp){
			case STUB:
				imp = new FileCommitCleanerStub();
				break;
			case V1:
				System.out.println("look its nothing");
				break;
			default:
				System.out.println("strategy not implementable");
				break;
		}
	}
	
	/*clean the raw data into a workable format */
	public FileCommitData clean(){
		return imp.cleanCommits(filename);
	}
}
