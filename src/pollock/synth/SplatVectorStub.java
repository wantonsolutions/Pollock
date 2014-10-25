package src.pollock.synth;
import src.pollock.data.*;
import java.util.ArrayList;

public class SplatVectorStub implements SplatVectorStrategy
{
	
	public void vectorizeCommits(ArrayList<Splatter> splatters, FilenameData filename, ContributorCommitData commiters){
		System.out.println("Adding vectors to the splatters");
		Splatter spt = new Splatter();
		splatters.add(spt);
		return;
	}
}
