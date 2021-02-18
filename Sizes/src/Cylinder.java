
public class Cylinder implements Sizeable
{
    private int radius;
    private int height;
 
    public Cylinder(int rad, int hei) {
    	radius = rad;
    	height = hei;
    }

	
	public double volume() {//returns volume
		return Math.PI*radius*radius*height;
	}


	public double surfaceArea() {//returns Sa
		
		return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	}
    
	public String toString() {// stringifies output
		return "Radius: " + radius + "   Height: " + height + "   Volume: " + volume() + "   Surface area: " + surfaceArea();
	}
	
}


