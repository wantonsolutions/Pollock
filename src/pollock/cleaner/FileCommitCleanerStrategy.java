/*
	FileCommitCleanerStrategy is the interface to which the file cleaners must conform
*/

package src.pollock.cleaner;

import src.pollock.data.*;

public interface FileCommitCleanerStrategy
{
	public FileCommitData cleanCommits(String Filename);
}
