/**
 * LoadFile 1
 * 
 * Loads a text file that contains two numbers separated by a tab ('\t').
 * A new pair of numbers is loaded each frame and used to draw a point on the screen.
 */

String[] lines;
int index = 0;

void setup() {
  size(1000, 1000);
  background(0);
  stroke(55,55,0);
  frameRate(25);
  lines = loadStrings("out.txt");
}

void draw() {
  if (index < lines.length) {
    String[] pieces = split(lines[index], '\t');
    if (pieces.length == 2) {
      int x = int(pieces[0]) * 2;
      int y = int(pieces[1]) * 2;
      point(x, y);
    }
    else if(pieces.length == 4 && pieces[2] == "0"){
      int x = int(pieces[0]) * 2;
      int y = int(pieces[1]) * 2;
      point(x, y);
    }
    else if(pieces.length == 3){
	stroke(int(pieces[0]),int(pieces[1]),int(pieces[2]));
	fill(int(pieces[0]),int(pieces[1]),int(pieces[2]));
    }
    else if(pieces.length == 4){
      int x = int(pieces[0]) * 2;
      int y = int(pieces[1]) * 2;
      int w = int(pieces[2]) * 2;
      int h = int(pieces[3]) * 2;
      ellipse(x,y,w,h);
    }
	//change the color
    // Go to the next line for the next run through draw()
    index = index + 1;
  }
}
