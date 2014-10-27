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
		//TODO replace with vectors corresponding to each contributor
				//This is just to test that the thickness is correctly calculated - the x and y directions of the vector are set to zero to make the tests simpler
				int xDirection = 0;
				int yDirection = 0;
				int size = 0;
				HashMap<String, Splatter> map = new HashMap<String, Splatter>();
				HashMap<String, Integer> xMap = new HashMap<String, Integer>();
				HashMap<String, Integer> yMap = new HashMap<String, Integer>();
				for(FileCommit fc : commiters.getCommits()){
					Splatter sp = map.get(fc.getFilename());
					if(sp == null){
						sp = new Splatter();
						map.put(fc.getFilename(), sp);
					}
					Integer x = xMap.get(fc.getFilename());
					Integer y = yMap.get(fc.getFilename());
					if(x == null){ x = 0;}
					if(y == null){ y = 0;}
					x += xDirection;
					y += yDirection;
					size = fc.getCommitWork();
					sp.addDrawInst(new DrawingInstruction(x, y, size, size));
				}
				for(Splatter spt : map.values()){
					splatters.add(spt);
				}
	}
}
