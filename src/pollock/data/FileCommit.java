package src.pollock.data;

/* File commit is the data wraper for information about a particular commit to a file */
public class FileCommit{
	
	private String filename;
	private String commit;
	private int commitWork;	//The sum of the additions and deletions made in the commit
	private int additions;
	private int deletions;

	public FileCommit (String filename, String commit, int additions, int deletions)
	{
		this.filename = filename;
		this.commit = commit;
		this.additions = additions;
		this.deletions = deletions;
		this.commitWork = additions + deletions;
	}

	public String getFilename(){
		return this.filename;
	}
	
	public String getCommit(){
		return this.commit;
	}
	
	public int getAdditions(){
		return this.additions;
	}

	public int getDeletions(){
		return this.deletions;
	}

	public int getCommitWork(){
		return this.commitWork;
	}
} 
