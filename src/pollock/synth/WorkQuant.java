/*
WorkQuant gives all of the splatters a width based on how much work was done to them at a particular time
*/
package src.pollock.synth;

import java.util.ArrayList;

import src.pollock.data.FileCommitData;
import src.pollock.data.FilenameData;
import src.pollock.data.Splatter;
import src.pollock.gateKeeper.GateKeeper;

public class WorkQuant
{
private ArrayList<Splatter> splatters;
private FilenameData filename;
private FileCommitData fileCommits;
private WorkQuantStrategy imp; //the particular implementation of the File cleaner

public WorkQuant(ArrayList<Splatter> splatters, FilenameData filename, FileCommitData fileCommits)
{
	this.splatters = splatters;
	this.filename = filename;
	this.fileCommits = fileCommits;
	GateKeeper gate = GateKeeper.getGateKeeper();
	GateKeeper.WorkQuantImp cImp = gate.getWorkQuant();
	switch(cImp){
		case STUB:
			imp = new WorkQuantStub();
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
public void quantify(){
	imp.quantifyCommits(splatters,filename,fileCommits);
}

}