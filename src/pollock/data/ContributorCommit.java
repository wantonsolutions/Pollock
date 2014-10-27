package src.pollock.data;
/*Contributor commit is a data wrapper for a commit made by a particular person to a particular file*/

public class ContributorCommit
{
	private String contributor;
	private String commit;
	private String date;
	private String filename;

	public ContributorCommit(String contributor, String commit, String date, String filename)
	{
		this.contributor = contributor;
		this.commit = commit;
		this.date = date;
		this.filename = filename;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}

	public String getCommit() {
		return commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
