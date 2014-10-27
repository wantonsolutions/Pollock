/*
	ContributorCommitData is the data wrapper for all of the commits made by particular users from the repo under examination
*/
package src.pollock.data;

import java.util.ArrayList;

import pac.ContributorCommit;

public class ContributorCommitData {
	private ArrayList<ContributorCommit> cc;

	public ContributorCommitData() {
		cc = new ArrayList<ContributorCommit>();

	}
	public void add(ContributorCommit c) {
		cc.add(c);
	}
	public ArrayList<ContributorCommit> get() {
		return cc;
	}
	public void populateTestData() {
		//(String contributor, String commit, String date, String filename
		ContributorCommit testContributorCommit = new ContributorCommit("Stew",
				"Test commit message 001","11.03.2014","DrawingInstruction.java");
		cc.add(testContributorCommit);
		ContributorCommit testContributorCommit1 = new ContributorCommit("Stew",
				"Test commit message 002","12.03.2014","DrawingInstruction.java");
		cc.add(testContributorCommit1);
		ContributorCommit testContributorCommit2 = new ContributorCommit("Dan",
				"Test commit message 003","12.03.2014","ContributorCleaner.java");
		cc.add(testContributorCommit2);
		ContributorCommit testContributorCommit3 = new ContributorCommit("Dan",
				"Test commit message 004","12.11.2014","Drawing.java");
		cc.add(testContributorCommit3);
		ContributorCommit testContributorCommit4 = new ContributorCommit("Jelena",
				"Test commit message 005","12.12.2014","Instruction.java");
		cc.add(testContributorCommit4);
		ContributorCommit testContributorCommit5 = new ContributorCommit("Jalena",
				"Test commit message 006","15.03.2014","FileName.java");
		cc.add(testContributorCommit5);
		ContributorCommit testContributorCommit6 = new ContributorCommit("Stew",
				"Test commit message 007","21.03.2014","Name.java");
		cc.add(testContributorCommit6);
		ContributorCommit testContributorCommit7 = new ContributorCommit("Stew",
				"Test commit message 008","21.03.2014","DrawingInstruction.java");
		cc.add(testContributorCommit7);
		ContributorCommit testContributorCommit8 = new ContributorCommit("Stew",
				"Test commit message 008","2.03.2014","DrawingInstruction.java");
		cc.add(testContributorCommit8);
		ContributorCommit testContributorCommit9 = new ContributorCommit("Stew",
				"Test commit message 009","18.03.2014","DrawingInstruction.java");
		cc.add(testContributorCommit9);
	}
}
