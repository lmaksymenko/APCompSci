
public class RectangularPrism implements Sizeable
{
    private int length;
    private int width;
    private int height;

    public RectangularPrism(int len, int wid, int hei) {
    	length =len;
    	width=wid;
    	height=hei;
    }
    
	public double volume() {//returns volume
		int vol=length*width*height;
		return vol;
	}
	
	public double surfaceArea() {//returns Sa
		int Sa = length*height*2+height*width*2+width*length*2;
		return Sa;
	}
    
	public String toString() {// stringifies output
		return "Length: " + length + "   Width: " + width + "   Height: " + height + "   Volume: " + volume() + "   Surface area: " + surfaceArea();
	}
}

