/* Splatter is data associated with a set of particular drawing instructions for an individual Splatter
*/
package src.pollock.data;

import src.pollock.data.*;
import java.util.ArrayList;
public class Splatter
{
	//splatter data
	//array of x and y coordinates
	//potentially an orientation of the elipse

	private Filename filename;		//the name of the file the splatter represents
	private ArrayList<ContributorCommit> cComs;	//an arraylist of all the contirbutor commits to the splatter
	private ArrayList<FileCommit> fComs;	//a list of the commits made to the file represented by the splatter	
	private ArrayList<DrawingInstruction> drawInfo;
	
	public Splatter(){
		//set some information about the splatters
	}
}
