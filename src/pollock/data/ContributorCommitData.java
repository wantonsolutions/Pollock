/*
	ContributorCommitData is the data wrapper for all of the commits made by particular users from the repo under examination
 */
package src.pollock.data;

import java.util.ArrayList;

public class ContributorCommitData {

	private ArrayList<ContributorCommit> ccs;

	public ContributorCommitData() {
		ccs = new ArrayList<ContributorCommit>();
	}

	public void add(ContributorCommit cc) {
		ccs.add(cc);
	}

	public ArrayList<ContributorCommit> getContributorCommits() {
		return ccs;
	}

	public void populateTestData() {
		ContributorCommit testContributorCommit = new ContributorCommit(
				"contributor1", "Test commit message 1");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor2",
				"Test commit message 2");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor3",
				"Test commit message 3");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor1",
				"Test commit message 4");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor1",
				"Test commit message 5");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor1",
				"Test commit message 6");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor2",
				"Test commit message 7");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor3",
				"Test commit message 8");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor3",
				"Test commit message 9");
		ccs.add(testContributorCommit);
		testContributorCommit = new ContributorCommit("contributor2",
				"Test commit message 10");
		ccs.add(testContributorCommit);
	}

}
