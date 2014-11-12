/*
	SplatVector is responsable for computing a vector based on the commiters to a particular file
*/
package src.pollock.synth;

import java.util.ArrayList;

import src.pollock.data.ContributorCommitData;
import src.pollock.data.FileCommitData;
import src.pollock.data.Splatter;
import src.pollock.gateKeeper.GateKeeper;

public class SplatVector
{
	private ArrayList<Splatter> splatters;
	private FileCommitData fileCommits;
	private ContributorCommitData commiters;
	private SplatVectorStrategy imp; //the particular implementation of the File cleaner
	
	public SplatVector(ArrayList<Splatter> splatters, FileCommitData fileCommits, ContributorCommitData commiters)
	{
		this.splatters = splatters;
		this.fileCommits = fileCommits;
		this.commiters = commiters;
		GateKeeper gate = GateKeeper.getGateKeeper();
		GateKeeper.SplatVectorImp cImp = gate.getSplatVector();
		switch(cImp){
			case STUB:
				imp = new SplatVectorStub();
				break;
			case V1:
				imp = new SplatVectorV1();
				break;
			default:
				System.out.println("strategy not implementable");
				break;
		}
	}
	
	/*clean the raw data into a workable format */
	public void vectorize(){
		imp.vectorizeCommits(splatters,fileCommits,commiters);
	}
	
}
