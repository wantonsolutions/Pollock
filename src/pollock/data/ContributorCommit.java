package src.pollock.data;
/*Contributor commit is a data wrapper for a commit made by a particular person to a particular file*/

public class ContributorCommit
{
	private String contributor;
	private String commit;
	//private String date;
	//private String filename;

	public ContributorCommit(String contributor, String commit)
	{
		this.contributor = contributor;
		this.commit = commit;
		//this.date = date;
		//this.filename = filename;
	}
	
}
