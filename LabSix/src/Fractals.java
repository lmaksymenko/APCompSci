import gpdraw.*;

public class Fractals {
	static SketchPad myPaper = new SketchPad(1000,1000);
	static DrawingTool myPencil = new DrawingTool(myPaper);
	static int counter=0;
	static int counter2=0;
	static int counter3=0;
	
	public static void main(String[] args) {
		Fractals.drawCircleRec(9, 200);
		//Fractals.drawKochCurve(6,800);
		//Fractals.drawKochSnowflake(6,800);
	}

	public static void drawKochCurve(int level, int length) {
	
	  counter++;
		//sets location and rotation
	  if (counter == 1 && counter2 == 0) {//this is so the Koch curve centering doesn't run when creating snowflake
		  myPencil.turn(-90);
		  myPencil.up();
		  myPencil.backward(length/2);
		  myPencil.down();
	  }else if(counter == 1){//centers the Koch curve
			myPencil.turn(-90);
	  }
		//draws curve
	  if(level<=1) {
			myPencil.forward(length/3);
			myPencil.turn(60);
			myPencil.forward(length/3);
			myPencil.turn(-120);
			myPencil.forward(length/3);
			myPencil.turn(60);
			myPencil.forward(length/3);
	  }else {
			drawKochCurve(level-1,length/3);
			myPencil.turn(60);
			drawKochCurve(level-1,length/3);
			myPencil.turn(-120);
			drawKochCurve(level-1,length/3);
			myPencil.turn(60);
			drawKochCurve(level-1,length/3);
		}
	}
		
	public static void drawKochSnowflake(int level, int length) {
		counter2++;
		//puts snowflake at ~~center
		if (counter2 ==1) {
			myPencil.turn(-90);
			myPencil.up();
			myPencil.backward(length/2);
			myPencil.turn(90);
			myPencil.forward(length/3);
			myPencil.down();
		}//draws three Koch curves as 60 degree angles to eachother
		drawKochCurve(level,length);
		myPencil.turn(-120);
		drawKochCurve(level,length);
		myPencil.turn(-120);
		drawKochCurve(level,length);
		myPencil.turn(-120);
	}
	
	public static void drawCircleRec(int level, int radius) {
			counter3++;
			//for centering
			if(counter3 == 1) {
				myPencil.up();
				myPencil.turn(90);
				myPencil.down();
			}
			
			if(level==1) {
					myPencil.drawCircle(radius);//draws final size circle
			}else{//uses the center point of previous circle to create center points for next two circles... 
				drawCircleRec(1, radius);
				double xPos = myPencil.getXPos();
				double yPos = myPencil.getYPos();
				myPencil.up();
				myPencil.move(xPos-radius, yPos);
				myPencil.down();
				drawCircleRec(level-1, radius/2);
				myPencil.up();
				myPencil.move(xPos+radius, yPos);
				myPencil.down();
				drawCircleRec(level-1, radius/2);
			}
	}
}
