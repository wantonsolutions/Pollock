/*

	FilenameCleanerStrategy is the interface to which the filename cleaners must conform
*/
package src.pollock.cleaner;

import src.pollock.data.*;

public interface FilenameCleanerStrategy
{
	public FilenameData cleanCommits(String Filename);
}
