package src.pollock.data;

public class Filename {
	private String filename;
	private String dateCreated;
	private String firstCommit;

	public Filename(String filename, String date, String commit) {
		this.filename = filename;
		this.dateCreated = date;
		this.firstCommit = commit;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFirstCommit() {
		return firstCommit;
	}

	public void setFirstCommit(String firstCommit) {
		this.firstCommit = firstCommit;
	}
	
}
