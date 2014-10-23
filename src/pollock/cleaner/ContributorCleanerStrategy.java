/* 
	ContributorCleanerStrategy is the interface to which contributor cleaners must conform
*/
package pollock.cleaner;

import pollock.data;

public interface ContributorCleanerStrategy
{
	public ContributorCommitData cleanCommits(String Filename);
}
