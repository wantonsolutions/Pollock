/* Splatter is data associated with a set of particular drawing instructions for an individual Splatter
*/
package src.pollock.data;

import src.pollock.data.*;
import java.util.ArrayList;
public class Splatter
{
	private String filename;		//the name of the file the splatter represents
	private int xStart;			//The starting x coordinate for this splatter
	private int yStart;			//The starting y coordinate for this splatter
	private int[] colour = new int[3];			//the color of the splatter
	private ArrayList<ContributorCommit> cComs;	//an arraylist of all the contirbutor commits to the splatter
	private ArrayList<FileCommit> fComs;	//a list of the commits made to the file represented by the splatter	
	private ArrayList<DrawingInstruction> drawInfo;
	
	/**
		Default constructor for a splatter, initalizes the lists that pertain to it specifically
	@return a new splatter
	*/
	public Splatter(){
		//set some information about the splatters
		cComs = new ArrayList<ContributorCommit>();
		fComs = new ArrayList<FileCommit>();
		drawInfo = new ArrayList<DrawingInstruction>();
	}
	
	/**
		Constructor fo a splatter, initalized the splatter with a filename association
	@param filename a string describing the file the splatter is related to
	@return a new splatter
	*/
	public Splatter(String filename, int x, int y){
		//set some information about the splatters
		cComs = new ArrayList<ContributorCommit>();
		fComs = new ArrayList<FileCommit>();
		drawInfo = new ArrayList<DrawingInstruction>();
		this.filename = filename;
		this.xStart = x;
		this.yStart = y;
	}
	
	//outputs the set of drawing instructions as a set of strings catered to a drawing instruction for processing 2
	public String draw(){
		String output = "";
		//set the color for the splatter
		output = this.colour[0]+"\t"+this.colour[1]+"\t"+this.colour[2]+"\n";
		for(int i =0;i<drawInfo.size();i++){
			output = output + drawInfo.get(i).draw();
		}
		return output;
	}

	public ArrayList<DrawingInstruction> getDrawInfo(){
		return drawInfo;
	}

	public void addDrawInst(DrawingInstruction di){
		drawInfo.add(di);
	}
	
	/**
		Getter for the filename attribute
	@return string of the filename
	*/
	public String getFilename(){
		return this.filename;
	}
	
	/**
		setter for the filename attribute
	@param filename a string denoting the filename
	@return void
	*/
	public void setFilename(String filename){
		this.filename = filename;
	}
		
	public int getXStart(){
		return xStart;
	}

	public int getYStart(){
		return yStart;
	}

	/*colour seting function*/
	public void setColour(int r, int g, int b){
		if(r<0 || r>255){
			this.colour[0] = 0;
		}
		else{
			this.colour[0] = r;
		}
		if(g<0 || g>255){
			this.colour[1] = 0;
		}
		else{
			this.colour[1] = g;
		}
		if(b<0 || b>255){
			this.colour[2] = 0;
		}
		else{
			this.colour[2] = b;
		}
	}

}

