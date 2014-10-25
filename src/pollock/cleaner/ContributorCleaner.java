/*
	ContributorCleaner queries Metior for the contributors to a particular repo and builds a workable contributor object based on them

*/
package src.pollock.cleaner;
import src.pollock.gateKeeper.*;
import src.pollock.data.*;

public class ContributorCleaner {
	
	private ContributorCommitData data;		//data associated with the contributor commits
	private ContributorCleanerStrategy imp; //the particular implementation of the contributor cleaner
	private String filename;
	
	/* when initalizing Contributor cleaner determine which implementation will be used by asking gatekeeper */
	public ContributorCleaner(String filename)
	{
		this.filename = filename;
		GateKeeper gate = GateKeeper.getGateKeeper();
		GateKeeper.ContributorCleanerImp cImp = gate.getContributorCleaner();
		switch(cImp){
			case STUB:
				imp = new ContributorCleanerStub();
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
	public ContributorCommitData clean(){
		return imp.cleanCommits(filename);
	}
}
