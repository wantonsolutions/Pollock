package src.pollock.cleaner;
import src.pollock.data.*;

public class ContributorCleanerStub implements ContributorCleanerStrategy
{
	public ContributorCommitData cleanCommits(String Filename){
		System.out.println("Hello World");
		ContributorCommitData dat = new ContributorCommitData();
		return dat;
	}
}
