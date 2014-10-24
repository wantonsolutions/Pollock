package src.pollock.cleaner;
import src.pollock.data.*;

public class FileCommitCleanerStub implements FileCommitCleanerStrategy 
{
	public FileCommitData cleanCommits(String Filename){
		System.out.println("Hello World");
		FileCommitData dat = new FileCommitData();
		return dat;
	}	

}
