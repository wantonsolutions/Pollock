package src.pollock;

import src.pollock.data.*;
import src.pollock.cleaner.*;
import src.pollock.synth.*;

public class Pollock
{
	public static void main(String []args){
		//start by making some fake filenames
		String f1 = "Contributors.txt";
		String f2 = "FileCommits.txt";
		String f3 = "Filenames.txt";
		//Clean the contributor commits
		ContributorCleaner cc = new ContributorCleaner(f1);
		ContributorCommitData cd = cc.clean();
		FileCommitCleaner fcc = new FileCommitCleaner(f2);
		FileCommitData fcd = fcc.clean();
		FilenameCleaner fnc = new FilenameCleaner(f3);
		FilenameData fnd = fnc.clean();
	}
}
