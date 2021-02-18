import gpdraw.*;

public class drawPractice {
	public static void main(String[] args) {
		SketchPad myPaper = new SketchPad(800,800);
		DrawingTool myPencil = new DrawingTool(myPaper);
		//square
		myPencil.forward(200);
		myPencil.turn(90);
		
		myPencil.forward(200);
		myPencil.turn(90);
		
		myPencil.forward(200);
		myPencil.turn(90);
		
		myPencil.forward(200);
		myPencil.turn(90);
		
		myPencil.turn(-45);
		myPencil.forward(50);
		
		myPencil.turn(45);
		myPencil.move(190);
		
		myPencil.turn(126);
		myPencil.move(45);
		
		myPencil.turn(180);
		myPencil.forward(45);
		
		myPencil.turn(120);
		myPencil.forward(220);
		
		myPencil.turn(60);
		myPencil.move(45);
		
		myPencil.turn(120);
		myPencil.forward(220);
		
		myPencil.turn(-156);
		myPencil.forward(200);
		
		myPencil.turn(-90);
		myPencil.forward(89);
		
		myPencil.up();
		myPencil.turn(180);
		myPencil.forward(289);
		myPencil.turn(90);
		myPencil.down();
		myPencil.forward(45);
		
		myPencil.turn(90);
		myPencil.forward(75);
		
		myPencil.turn(-90);
		myPencil.forward(40);
		
		myPencil.turn(-90);
		myPencil.forward(75);
		
		myPencil.turn(90);
		myPencil.forward(115);
		
		//benzene
		
		myPencil.up();
		myPencil. forward(100);
		myPencil.down();
		
		myPencil.turn(30);
		myPencil.forward(70);
		
		myPencil.turn(-60);
		myPencil.forward(70);
		
		myPencil.turn(-60);
		myPencil.forward(70);
		
		myPencil.turn(-60);
		myPencil.forward(70);
		
		myPencil.turn(-60);
		myPencil.forward(70);
		
		myPencil.turn(-60);
		myPencil.forward(70);
		
		myPencil.turn(180);
		myPencil.forward(35);
		myPencil.turn(90);
		
		myPencil.up();
		myPencil.forward(60);
		myPencil.down();
		myPencil.drawCircle(40);
		//myPencil.forward(70);
		
		
		
	}
}
