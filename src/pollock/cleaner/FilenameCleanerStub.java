package src.pollock.cleaner;
import src.pollock.data.*;

public class FilenameCleanerStub implements FilenameCleanerStrategy
{
	public FilenameData cleanCommits(String Filename){
		System.out.println("Hello "+Filename);
		FilenameData dat = new FilenameData();
		dat.populateTestData();
		return dat;
	}
}
