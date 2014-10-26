/*
FileCommitData is the data wrapper for all of the commits made to every particular file in the repo being analized
*/

package src.pollock.data;
import java.util.ArrayList;
public class FileCommitData 
{
	private ArrayList<FileCommit> fcs;
	public FileCommitData(){
	
	}

	public void add(FileCommit fc){
		fcs.add(fc);
	}

	//add some functionality for getting subsets of information like particular arraylists based on the data
}
