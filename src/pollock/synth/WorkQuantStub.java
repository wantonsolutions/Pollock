package src.pollock.synth;
import src.pollock.data.*;
import java.util.ArrayList;

public class WorkQuantStub implements WorkQuantStrategy
{
	
	public void QuantifyWork(ArrayList<Splatter> splatters, FilenameData filename, FileCommitData fileCommits){
		Splatter spt = new Splatter();
		splatters.add(spt);
		return;
	}
}
