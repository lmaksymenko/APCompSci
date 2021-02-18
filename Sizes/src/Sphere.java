
public class Sphere implements Sizeable
{
	private int radius;
   
	 public Sphere(int r){
    	radius = r;

    }
	 
	
	public double volume(double radius) {//returns volume
		double volume = (4/3) * Math.PI * radius * radius * radius;
		return volume;
	}
	 
	
	public double surfaceArea(double radius) {//returns Sa
		double surfaceArea = 4 * Math.PI * radius * radius;
		return surfaceArea;
	}

	public String toString() {// stringifies output
		
		return "Volume: " + volume(radius) + "   Surface Area: " + surfaceArea(radius) + "   Radius: " + radius;
		
	}
	
    
    
}

