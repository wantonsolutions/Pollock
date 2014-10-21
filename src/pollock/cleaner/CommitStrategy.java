/*
	Commit Strategy is the interface for the concrete commiters to follow
*/

public interface CommitStrategy {

	public Commits cleanCommits(String Filename);

}
