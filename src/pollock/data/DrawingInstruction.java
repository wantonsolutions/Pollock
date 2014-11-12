package src.pollock.data;

public class DrawingInstruction
{
	private int x;
	private int y;
	private int width;
	private int height;
	private double direction;
	//drawing information about an elipse
	public DrawingInstruction(){
	
	}
	public DrawingInstruction(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.direction = 0.0;
	}
	
	//outputs the drawing information in a way processing 2 can understand
	public String draw(){
		//stub
		return "" + x +" " + y + " " + width + " " + height;
	}
		
	public String toString(){
		return "x:"+this.x+"\ty:"+this.y+"\tw:"+this.width+"\th:"+this.height+"d:"+this.direction;
	}
		
	public void setx(int x){
		this.x = x;
	}

	public int getx(){
		return this.x;
	}

	public void sety(int y){
		this.y = y;
	}

	public int gety(){
		return this.y;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return this.width;
	}

	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}

	public void setDirection(double dir){
		this.direction = dir;
	}

	public double getDirection(){
		return this.direction;
	}
}
