package src.pollock.synth;
import src.pollock.data.*;

import java.util.ArrayList;

import src.pollock.data.DrawingInstruction;
import src.pollock.data.Splatter;

public class WorkQuantStub implements WorkQuantStrategy
{
	
	public void quantifyCommits(ArrayList<Splatter> splatters, FileCommitData fileCommits, ContributorCommitData contributorCommits ){
		System.out.println("Adding width to the splatters");
		Splatter spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(0, 0, 10, 10));
		spt.addDrawInst(new DrawingInstruction(0, 1, 5, 5));
		spt.addDrawInst(new DrawingInstruction(1, 1, 3, 3));
		spt.addDrawInst(new DrawingInstruction(3, 2, 5, 5));
		splatters.add(spt);
		
		spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(10, 10, 3, 3));
		spt.addDrawInst(new DrawingInstruction(10, 11, 7, 7));
		spt.addDrawInst(new DrawingInstruction(11, 11, 6, 6));
		spt.addDrawInst(new DrawingInstruction(13, 12, 8, 8));
		splatters.add(spt);
		
		spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(20, 20, 3, 3));
		spt.addDrawInst(new DrawingInstruction(20, 21, 7, 7));
		spt.addDrawInst(new DrawingInstruction(21, 21, 6, 6));
		spt.addDrawInst(new DrawingInstruction(23, 22, 8, 8));
		splatters.add(spt);
		return;
	}
}
