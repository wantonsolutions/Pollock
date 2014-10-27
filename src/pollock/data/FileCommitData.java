/*
FileCommitData is the data wrapper for all of the commits made to every particular file in the repo being analized
 */

package src.pollock.data;


import java.util.ArrayList;

public class FileCommitData {
	private ArrayList<FileCommit> fcs;

	public FileCommitData() {
		fcs = new ArrayList<FileCommit>();
	}

	public void add(FileCommit fc) {
		fcs.add(fc);
	}

	public ArrayList<FileCommit> get() {
		return fcs;
	}

	// add some functionality for getting subsets of information like particular
	// arraylists based on the data
	public void populateTestData() {
		FileCommit testFileCommit = new FileCommit("ContributorCommit.java",
				"Test commit message 001", 1, 2);
		fcs.add(testFileCommit);
		FileCommit testFileCommit1 = new FileCommit("ContributorCommit.java",
				"Test commit message 002", 10, 20);
		fcs.add(testFileCommit1);
		FileCommit testFileCommit2 = new FileCommit(
				"ContributorCommitData.java", "Test commit message 003", 0, 3);
		fcs.add(testFileCommit2);
		FileCommit testFileCommit3 = new FileCommit("DrawingInstruction.java",
				"Test commit message 004", 7, 7);
		fcs.add(testFileCommit3);
		FileCommit testFileCommit4 = new FileCommit("FileCommit.java",
				"Test commit message 005", 5, 12);
		fcs.add(testFileCommit4);
		FileCommit testFileCommit9 = new FileCommit("FileCommitData.java",
				"Test commit message 006", 1, 2);
		fcs.add(testFileCommit9);
		FileCommit testFileCommit5 = new FileCommit("Filename.java",
				"Test commit message 007", 5, 0);
		fcs.add(testFileCommit5);
		FileCommit testFileCommit6 = new FileCommit("FileData.java",
				"Test commit message 008", 20, 2);
		fcs.add(testFileCommit6);
		FileCommit testFileCommit7 = new FileCommit("Splatter.java",
				"Test commit message 009", 8, 0);
		fcs.add(testFileCommit7);
		FileCommit testFileCommit8 = new FileCommit("Pollock.java",
				"Test commit message 010", 3, 2);
		fcs.add(testFileCommit8);
	}
}
