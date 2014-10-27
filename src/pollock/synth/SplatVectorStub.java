package src.pollock.synth;
import src.pollock.data.*;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;

import data.DrawingInstruction;
import data.FileCommit;
import data.Splatter;
public class SplatVectorStub implements SplatVectorStrategy
{
	
	public void vectorizeCommits(ArrayList<Splatter> splatters, FilenameData filename, ContributorCommitData commiters){
		System.out.println("Adding vectors to the splatters");
		Splatter spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(0, 0, 0, 0));
		spt.addDrawInst(new DrawingInstruction(0, 1, 0, 0));
		spt.addDrawInst(new DrawingInstruction(1, 1, 0, 0));
		spt.addDrawInst(new DrawingInstruction(3, 2, 0, 0));
		splatters.add(spt);
		
		spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(10, 10, 0, 0));
		spt.addDrawInst(new DrawingInstruction(10, 11, 0, 0));
		spt.addDrawInst(new DrawingInstruction(11, 11, 0, 0));
		spt.addDrawInst(new DrawingInstruction(13, 12, 0, 0));
		splatters.add(spt);
		
		spt = new Splatter();
		spt.addDrawInst(new DrawingInstruction(20, 20, 0, 0));
		spt.addDrawInst(new DrawingInstruction(20, 21, 0, 0));
		spt.addDrawInst(new DrawingInstruction(21, 21, 0, 0));
		spt.addDrawInst(new DrawingInstruction(23, 22, 0, 0));
		splatters.add(spt);
		return;
	}
}
