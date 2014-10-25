/*
	WorkQuantStrategy is the interface to which the work Quantifiers must conform to
*/
package src.pollock.synth;
import src.pollock.data.*;
import java.util.ArrayList;

public interface WorkQuantStrategy
{
	public void quantifyCommits(ArrayList<Splatter> splatters, FilenameData filename, FileCommitData fileCommits);
}
