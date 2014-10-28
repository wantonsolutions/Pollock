/*
FilenameData is the data wrapper for all of the filenames pulled from the repo under examination
*/

package src.pollock.data;

import java.util.ArrayList;
public class FilenameData 
{
	private ArrayList<Filename> fns;

	public FilenameData(){
		fns = new ArrayList<Filename>();
	
	}
	
	//a wraper for the add functionality of an arraylist
	public void add(Filename fn){
		fns.add(fn);
	}

	//Add filename specific query functions for returning arraylists of subses of the data stored in the filenames


	public ArrayList<Filename> getFileNames(){
		return fns;
	}

	public void populateTestData(){
		Filename testFile = new Filename("Filename.java", 
			"10/1/2014", "Commit message 1");
		fns.add(testFile);
		testFile = new Filename("FilenameData.java", 
			"10/2/2014", "Commit message 2");
		fns.add(testFile);
		testFile = new Filename("FilenameCleanerStub.java", 
			"10/3/2014", "Commit message 3");
		fns.add(testFile);
		testFile = new Filename("FilenameCleaner.java", 
			"10/4/2014", "Commit message 4");
		fns.add(testFile);
		testFile = new Filename("Filename.java", 
			"10/5/2014", "Commit message 5");
		fns.add(testFile);
		testFile = new Filename("ContributorCleaner.java", 
			"10/6/2014", "Commit message 6");
		fns.add(testFile);
		testFile = new Filename("FilenameCleanerStrategy.java", 
			"10/7/2014", "Commit message 7");
		fns.add(testFile);
		testFile = new Filename("Filename.java", 
			"10/8/2014", "Commit message 8");
		fns.add(testFile);
		testFile = new Filename("Filename.java", 
			"10/9/2014", "Commit message 9");
		fns.add(testFile);
		testFile = new Filename("Filename.java", 
			"10/10/2014", "Commit message 10");
		fns.add(testFile);
	}

	//Add functionality based on sorting on all of the data within filenames
}
