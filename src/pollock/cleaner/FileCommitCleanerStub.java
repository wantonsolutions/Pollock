package src.pollock.cleaner;
import src.pollock.data.*;

public class FileCommitCleanerStub implements FileCommitCleanerStrategy 
{
	public FileCommitData cleanCommits(String Filename){
		System.out.println("Hello "+ Filename);
		FileCommitData dat = new FileCommitData();
		//This is where we need to fill in stub file commit data
		return dat;
	}	

}
