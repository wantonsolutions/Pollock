package src.pollock.synth;
import src.pollock.data.*;

import java.util.ArrayList;

public class SplatVectorV1 implements SplatVectorStrategy
{
	
	private class userVec
	{
		String username;
		double radians;
		
		public userVec(){
			username = "";
			radians = 0.0;
		}
		
		public userVec(String uname, double radian){
			this.username = uname;
			this.radians = radian;
		}
	}
	
	private ArrayList<userVec> uv = new ArrayList<userVec>();
	private FileCommitData fcd;
	private ContributorCommitData ccd;
	private ArrayList<Splatter> splatters;
	

	
	public void vectorizeCommits(ArrayList<Splatter> splatters, FileCommitData fileCommit, ContributorCommitData commiters){
		this.splatters = splatters;
		this.fcd = fileCommit;
		this.ccd = commiters;
		
		vectorizeUsers();
	}

	private void vectorizeUsers()
	{
		ArrayList<String> names = new ArrayList<String>();
		for(int i =0;i<ccd.getCC().size();i++){
			String uname=ccd.getCC().get(i).getContributor();
			if(!names.contains(uname)){
				names.add(uname);
			}
		}
		
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
	}
}
