package src.pollock;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;
import src.pollock.data.*;
import src.pollock.cleaner.*;
import src.pollock.synth.*;

public class Pollock
{
	public static void main(String []args){
		//start by making some fake filenames eventually read from the command line
		String f1 = "UserCommits.txt";
		String f2 = "FileCommits.txt";
		String of = "DrawableOutput.txt";
		
		//Clean the contributor commits
		ContributorCleaner cc = new ContributorCleaner(f1);
		ContributorCommitData cd = cc.clean();
		FileCommitCleaner fcc = new FileCommitCleaner(f2);
		FileCommitData fcd = fcc.clean();
		
		//build the splatters using the cleaned data
		ArrayList<Splatter> splatters = new ArrayList<Splatter>();
		nameSplatters(splatters,fcd);
		SplatVector sv = new SplatVector(splatters,fcd,cd);
		sv.vectorize();
		WorkQuant wq = new WorkQuant(splatters,fcd,cd);
		wq.quantify();
		
		//output splatters into some sort of drawable format
		outputToFile(splatters,of);
	}

	private static void outputToFile(ArrayList<Splatter> splatters, String filename)
	{	try{
			PrintWriter w = new PrintWriter(filename, "UTF-8");
			for(int i = 0;i<splatters.size();i++){
				w.print(splatters.get(i).draw());
			}
			w.close();
			
		}
		catch(IOException e){
			System.out.println("what is this some kind of joke, you are suppoed to be making the file!!!");
			System.out.println(e.getMessage());
		}
	}
	
	/**
		gives each of the splatters a unique name based on the names of each of the files in the given repository
	
	@param splatters an empty list of splatters, will be filled with named splatters.
	@param fcd a full list of the file commit data from a repository
	*/
	private static void nameSplatters(ArrayList<Splatter> splatters, FileCommitData fcd)
	{
		//generate the unique list of name
		ArrayList<String> names = new ArrayList<String>();
		for(int i =0;i<fcd.get().size();i++){
			String fname=fcd.get().get(i).getFilename();
			if(!names.contains(fname))
				names.add(fname);
		}
		//create a new splatter for each name
		for(int i=0; i<names.size();i++){
			splatters.add(new Splatter(names.get(i)));
		}	
	}

}
