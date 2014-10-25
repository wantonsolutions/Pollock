/*
	FilenameCleaner queries gitstats for the files in a particular repository, and builds a workable filestructure object from them

*/
package src.pollock.cleaner;

import src.pollock.data.FilenameData;
import src.pollock.gateKeeper.GateKeeper;

public class FilenameCleaner
{
	private FilenameData data;		//data associated with the File names
	private FilenameCleanerStrategy imp; //the particular implementation of the File cleaner
	private String filename;
	
	/* when initalizing File cleaner determine which implementation will be used by asking gatekeeper */
	public FilenameCleaner(String filename)
	{
		this.filename = filename;
		GateKeeper gate = GateKeeper.getGateKeeper();
		GateKeeper.FilenameCleanerImp cImp = gate.getFilenameCleaner();
		switch(cImp){
			case STUB:
				imp = new FilenameCleanerStub();
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
	public FilenameData clean(){
		return imp.cleanCommits(filename);
	}
}