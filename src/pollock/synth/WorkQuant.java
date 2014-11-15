/*
WorkQuant gives all of the splatters a width based on how much work was done to them at a particular time
*/
package src.pollock.synth;

import java.util.ArrayList;

import src.pollock.data.FileCommitData;
import src.pollock.data.ContributorCommitData;
import src.pollock.data.Splatter;
import src.pollock.gateKeeper.GateKeeper;

public class WorkQuant
{
private ArrayList<Splatter> splatters;
private FileCommitData fileCommits;
private ContributorCommitData contributorCommits;
private WorkQuantStrategy imp; //the particular implementation of the File cleaner

public WorkQuant(ArrayList<Splatter> splatters, FileCommitData fileCommits, ContributorCommitData contributorCommits)
{
	this.splatters = splatters;
	this.fileCommits = fileCommits;
	this.contributorCommits = contributorCommits;
	GateKeeper gate = GateKeeper.getGateKeeper();
	GateKeeper.WorkQuantImp cImp = gate.getWorkQuant();
	switch(cImp){
		case STUB:
			imp = new WorkQuantStub();
			break;
		case V1:
			imp = new WorkQuantV1();
			break;
		default:
			System.out.println("strategy not implementable");
			break;
	}
}

/*clean the raw data into a workable format */
public void quantify(){
	imp.quantifyCommits(splatters,fileCommits,contributorCommits);
}

}
