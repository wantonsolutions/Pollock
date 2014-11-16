package src.pollock.synth;
import src.pollock.data.*;
import java.util.ArrayList;
import src.pollock.data.DrawingInstruction;
import src.pollock.data.Splatter;

public class WorkQuantV1 implements WorkQuantStrategy
{
	private FileCommitData fcd;
	private ContributorCommitData ccd;
	private ArrayList<Splatter> splatters;
	private final double wcoeff = 0.2;
	
	public void quantifyCommits(ArrayList<Splatter> splatters, FileCommitData fileCommits, ContributorCommitData contributorCommits ){
		System.out.println("WorkQuantV1");
		this.splatters = splatters;
		this.fcd = fileCommits;
		this.ccd = contributorCommits;
		giveWeight();
	}

	/**
	assigns a thickness to a drawing instruction based on how much work was done to that particular splatter on a given commit
	*/
	private void giveWeight(){
		for(int i=0;i<splatters.size();i++)
		{
			//go through all the file commits matching file commits to file
			for(int j=0;j<fcd.get().size();j++)
			{
				//if the commit matches the filename
				if(fcd.get().get(j).getFilename().equals(splatters.get(i).getFilename())){
					String sha;
					int k =0;
					//get the correct drawing instruction
					do{
						sha = splatters.get(i).getDrawInfo().get(k).getSha();
						k++;
					}while(!sha.equals(fcd.get().get(j).getCommit()) && k<splatters.get(i).getDrawInfo().size());
					k--;
					//set width and height
					double width = fcd.get().get(j).getCommitWork() * wcoeff; 
					double height = fcd.get().get(j).getCommitWork() * wcoeff; 
					splatters.get(i).getDrawInfo().get(k).setWidth((int)Math.round(width));
					splatters.get(i).getDrawInfo().get(k).setHeight((int)Math.round(height));
					//System.out.println(splatters.get(i).getDrawInfo().get(k).toString());

				}

			}
		}
	}
}
