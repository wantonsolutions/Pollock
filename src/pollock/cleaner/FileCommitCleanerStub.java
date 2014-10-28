package src.pollock.cleaner;
import src.pollock.data.*;

public class FileCommitCleanerStub implements FileCommitCleanerStrategy 
{
	public FileCommitData cleanCommits(String Filename){
		System.out.println("Hello "+ Filename);
		FileCommitData dat = new FileCommitData();
		//This is where we need to fill in stub file commit data
		dat.add(new FileCommit("ContributorCommit.java",
				"Test commit message 001", 1, 2));
		dat.add(new FileCommit("ContributorCommit.java",
				"Test commit message 002", 10, 20));
		dat.add(new FileCommit("ContributorCommitData.java",
				"Test commit message 003", 0, 3));
		dat.add(new FileCommit("DrawingInstruction.java",
				"Test commit message 004", 7, 7));
		dat.add(new FileCommit("FileCommit.java",
				"Test commit message 005", 5, 12));
		dat.add(new FileCommit("FileCommitData.java",
				"Test commit message 006", 1, 2));
		dat.add(new FileCommit("Filename.java",
				"Test commit message 007", 5, 0));
		dat.add(new FileCommit("FileData.java",
				"Test commit message 008", 20, 2));
		dat.add(new FileCommit("Splatter.java",
				"Test commit message 009", 8, 0));
		dat.add(new FileCommit("Pollock.java",
				"Test commit message 010", 3, 2));
		return dat;
	}	

}
