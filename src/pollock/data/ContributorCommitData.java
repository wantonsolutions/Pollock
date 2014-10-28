/*
	ContributorCommitData is the data wrapper for all of the commits made by particular users from the repo under examination
*/
package src.pollock.data;

import java.util.ArrayList;

public class ContributorCommitData 
{
	
		private ArrayList<ContributorCommit> ccs;

		public ContributorCommitData(){
			ccs = new ArrayList<ContributorCommit>();
		}

		public void add(ContributorCommit cc){
			ccs.add(cc);
		}

		public ArrayList<ContributorCommit> getContributorCommits(){
			return ccs;
		}

		public void populateTestData(){
			ContributorCommit testContributorCommit = new ContributorCommit("contributor1", 
				"Test commit message 1", "10/1/2014", "ContributorCommit.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor2", 
				"Test commit message 2", "10/2/2014", "ContributorCommitData.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor3", 
				"Test commit message 3", "10/3/2014", "FileCommit.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor1", 
				"Test commit message 4", "10/4/2014", "FileCommitData.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor1", 
				"Test commit message 5", "10/5/2014", "ContributorCommit.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor1", 
				"Test commit message 6", "10/6/2014", "ContributorCommit.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor2", 
				"Test commit message 7", "10/7/2014", "Filename.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor3", 
				"Test commit message 8", "10/8/2014", "DrawingInstructions.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor3", 
				"Test commit message 9", "10/9/2014", "ContributorCommit.java" );
			ccs.add(testContributorCommit);
			testContributorCommit = new ContributorCommit("contributor2", 
				"Test commit message 10", "10/10/2014", "ContributorCommit.java" );
			ccs.add(testContributorCommit);
		}
	
	
}
