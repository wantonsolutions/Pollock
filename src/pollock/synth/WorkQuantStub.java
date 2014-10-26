package src.pollock.synth;
import src.pollock.data.*;

import java.util.ArrayList;

public class WorkQuantStub implements WorkQuantStrategy
{
	
	public void quantifyCommits(ArrayList<Splatter> splatters, FilenameData filename, FileCommitData fileCommits){
		System.out.println("Adding width to the splatters");
		Splatter spt = new Splatter();
		//intial stub
		DrawingInstruction di = new DrawingInstruction();
		spt.addDrawInst(di);
		splatters.add(spt);
		return;
	}
}
