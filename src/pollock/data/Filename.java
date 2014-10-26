package src.pollock.data;

public class Filename
{
	private String filename;
	private String dateCreated;
	private String firstCommit;
	
	public Filename (String filename, String date, String commit)
	{
		this.filename = filename;
		this.dateCreated = date;
		this.firstCommit = commit;
	}
}
