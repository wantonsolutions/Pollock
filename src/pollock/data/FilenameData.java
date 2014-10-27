package src.pollock.data;

/*
 FilenameData is the data wrapper for all of the filenames pulled from the repo under examination
 */

import java.util.ArrayList;

public class FilenameData {
	private ArrayList<Filename> fns;

	public FilenameData() {
		fns = new ArrayList<Filename>();

	}

	// a wraper for the add functionality of an arraylist
	public void add(Filename fn) {
		fns.add(fn);
	}

	// get
	public ArrayList<Filename> getFns() {
		return fns;
	}

	// set
	public void setFns(ArrayList<Filename> fns) {
		this.fns = fns;
	}
	public void populateTestData() {
		Filename testFilename = new Filename("ContributorCommit.java","12.10.2014",
				"Test commit message 001");
		fns.add(testFilename);
		Filename testFilename1 = new Filename("fileCommit.java","12.10.2014",
				"Test commit message 002");
		fns.add(testFilename1);
		Filename testFilename2 = new Filename("ContributorCommitData.java","12.11.2014",
				"Test commit message 003");
		fns.add(testFilename2);
		Filename testFilename3 = new Filename("DrawingInstruction.java","12.11.2014",
				"Test commit message 004");
		fns.add(testFilename3);
		Filename testFilename4 = new Filename("FileCommit.java","17.10.2014",
				"Test commit message 005");
		fns.add(testFilename4);
		Filename testFilename5 = new Filename("FileCommitData.java","02.10.2014",
				"Test commit message 006");
		fns.add(testFilename5);
		Filename testFilename6 = new Filename("Filename.java","15.10.2014",
				"Test commit message 007");
		fns.add(testFilename6);
		Filename testFilename7 = new Filename("FileData.java","12.09.2014",
				"Test commit message 008");
		fns.add(testFilename7);
		Filename testFilename8 = new Filename("Splatter.java","22.10.2014",
				"Test commit message 009");
		fns.add(testFilename8);
		Filename testFilename9 = new Filename("Pollock.java","28.10.2014",
				"Test commit message 010");
		fns.add(testFilename9);
	}
	
	// Add filename specific query functions for returning arraylists of subses
	// of the data stored in the filenames

	// Add functionality based on sorting on all of the data within filenames
}
