/* 
	ContributorCleanerStrategy is the interface to which contributor cleaners must conform
*/
package src.pollock.cleaner;
import src.pollock.data.*;

public interface ContributorCleanerStrategy
{
	public ContributorCommitData cleanCommits(String Filename);
}
