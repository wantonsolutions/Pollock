package src.pollock.synth;
import src.pollock.data.*;
import java.lang.Math;

import java.util.ArrayList;

public class SplatVectorV1 implements SplatVectorStrategy
{
	/**
	UserVec defines a particular user, and is used to synthesize the direction of a splatter at any given commit
	*/	
	private class UserVec
	{
		String username;
		double radians;
		
		public UserVec(){
			username = "";
			radians = 0.0;
		}
		/**
		Constructor sets local variables
		@param uname the username of a particular contributor
		@param radian the direction associated with a particular contributor
		*/
		public UserVec(String uname, double radian){
			this.username = uname;
			this.radians = radian;
		}

		public String getUsername(){
			return this.username;
		}

		public double getRadians(){
			return this.radians;
		}
	}
	/*move coeff imporant*/
	private final double coeff = 6.0;	
	private ArrayList<UserVec> uv = new ArrayList<UserVec>();
	private FileCommitData fcd;
	private ContributorCommitData ccd;
	private ArrayList<Splatter> splatters;
	

	
	public void vectorizeCommits(ArrayList<Splatter> splatters, FileCommitData fileCommit, ContributorCommitData commiters){
		System.out.println("SVV1 vectorizing ...");
		this.splatters = splatters;
		this.fcd = fileCommit;
		this.ccd = commiters;
		
		vectorizeUsers();
		basicStrokes();
	}
	
	/**
		assigns a direction to each of the users based on the date that they first joined the repository, the directions are evenly distributed about a polar coordianate
	*/
	private void vectorizeUsers()
	{
		ArrayList<String> names = new ArrayList<String>();
		for(int i =0;i<ccd.getCC().size();i++){
			String uname=ccd.getCC().get(i).getContributor();
			if(!names.contains(uname)){
				names.add(uname);
			}
		}		
		double slicesize = (2.0 * Math.PI)/((double)names.size());
		//System.out.println(slicesize);
		for(int i=0;i<names.size();i++){
			uv.add(new UserVec(names.get(i),i*slicesize));
			//System.out.println(names.get(i));
		}
	}
	
	/**
		basicStrokes is the implementation of the paint splattering, each commit causes the splatter to move in the direction of the committer, basic Strokes is the most basic of such algorithms simply taking into account a single commit*/
	private void basicStrokes()
	{
		//for each splatter in the system (or for each file)
		for(int i=0;i<splatters.size();i++)
		{
			//go through all the file commits matching file commits to file
			for(int j=0;j<fcd.get().size();j++)
			{
				//if the commit matches the filename
				if(fcd.get().get(j).getFilename().equals(splatters.get(i).getFilename())){
					//System.out.println("name: "+splatters.get(i).getFilename());
					String sha = fcd.get().get(j).getCommit();
					String Usha;
					int k = 0;
					//find the user that commited that file
					do{
						Usha = ccd.getCC().get(k).getCommit();
						k++;
					}while(!Usha.equals(sha) &&  k<ccd.getCC().size());
					k--;//correct for acceptance condition
					//now k is references the user who commited to the file
					String Uname = ccd.getCC().get(k).getContributor();// with the username we can look into userVec and find the name
					
					int l =0;
					String tname;
					//find the vector associated with that user
					do{
						tname = uv.get(l).getUsername();
						l++;
					}while(!tname.equals(Uname) && l<uv.size());
					l--;//correct for the acceptance condition
					double dir = uv.get(l).getRadians();
					//System.out.println("Filename: "+splatters.get(i).getFilename()+"\tsha: "+sha+"\nname: "+Uname+"\tdir: "+dir+"\n"); 
					
					//add this new step as a drawing instruction to the splatter;
					DrawingInstruction di = new DrawingInstruction();
					di.setSha(sha);
					int splatterSize = splatters.get(i).getDrawInfo().size();
					//if the drawing instruction is the first one in the set start it from where the splatter denotes
					if(splatterSize==0){
						di.setx(splatters.get(i).getXStart());
						di.sety(splatters.get(i).getYStart());
						di.setDirection(dir);
						//System.out.print("new:");
					}
					//compute the comement vector
					else{
						//get the last drawing instruction
						DrawingInstruction last = splatters.get(i).getDrawInfo().get(splatterSize -1);
						double dx = Math.sin(dir)*coeff;
						double dy = Math.cos(dir)*coeff;
						di.setx(last.getx()+(int)Math.round(dx)); 
						di.sety(last.gety()+(int)Math.round(dy)); 
						di.setDirection(dir);
						//System.out.print("old:");

					}
					//System.out.println(di.toString());
					splatters.get(i).addDrawInst(di);
				}
			}
			
		}
	}
}
