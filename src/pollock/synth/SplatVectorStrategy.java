/*
	SplatVectorStratey is the interface to which the splatVectorizers must conform
*/
package src.pollock.synth;
import src.pollock.data.*;
import java.util.ArrayList;
public interface SplatVectorStrategy
{
	public void vectorizeCommits(ArrayList<Splatter> splatters, FileCommitData fileCommits, ContributorCommitData commiters);
}
