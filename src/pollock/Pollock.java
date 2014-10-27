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
		String f1 = "Contributors.txt";
		String f2 = "FileCommits.txt";
		String f3 = "Filenames.txt";
		String of = "DrawableOutput.txt";
		
		//Clean the contributor commits
		ContributorCleaner cc = new ContributorCleaner(f1);
		ContributorCommitData cd = cc.clean();
		FileCommitCleaner fcc = new FileCommitCleaner(f2);
		FileCommitData fcd = fcc.clean();
		FilenameCleaner fnc = new FilenameCleaner(f3);
		FilenameData fnd = fnc.clean();
		
		//build the splatters using the cleaned data
		ArrayList<Splatter> splatters = new ArrayList<Splatter>();
		SplatVector sv = new SplatVector(splatters,fnd,cd);
		sv.vectorize();
		WorkQuant wq = new WorkQuant(splatters,fnd,fcd);
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
}
