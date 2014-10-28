package src.pollock.cleaner;
import src.pollock.data.*;

public class ContributorCleanerStub implements ContributorCleanerStrategy
{
	public ContributorCommitData cleanCommits(String filename){
		System.out.println("Hello "+filename);
		ContributorCommitData dat = new ContributorCommitData();
		dat.populateTestData();
		return dat;
	}
}
