package src.pollock.data;

public class DrawingInstruction
{
	private int x;
	private int y;
	private int width;
	private int height;
	//drawing information about an elipse
	public DrawingInstruction(){
	
	}
	public DrawingInstruction(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//outputs the drawing information in a way processing 2 can understand
	public String draw(){
		//stub
		return "" + x +" " + y + " " + width + " " + height;
	}
}
