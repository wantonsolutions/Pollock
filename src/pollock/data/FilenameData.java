/*
FilenameData is the data wrapper for all of the filenames pulled from the repo under examination
*/

package src.pollock.data;

import java.util.ArrayList;
public class FilenameData 
{
	private ArrayList<Filename> fns;

	public FilenameData(){
	
	}
	
	//a wraper for the add functionality of an arraylist
	public void add(Filename fn){
		fns.add(fn);
	}

	//Add filename specific query functions for returning arraylists of subses of the data stored in the filenames

	//Add functionality based on sorting on all of the data within filenames
}
