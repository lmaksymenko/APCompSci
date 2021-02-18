
public class Ship {
	private int length;
	private int xCoor;
	private int yCoor;
	private boolean vert;
	
	
	
	
//	public Ship(){
//		length = 1;
//		xCoor = 0;
//		yCoor = 0;
//		vert = true;
//	}
	
	public Ship(int len, boolean ver, int xCor, int yCor){
		System.out.println("Ship constructor called." + ver);
		length = len;
		//System.out.println("Ship constructor called.");
		xCoor = xCor;
		//System.out.println("Ship constructor called.");
		yCoor = yCor;
		//System.out.println("Ship constructor called.");
		vert = ver;
		//System.out.println("Ship constructor called.");
	
	
	}
	
	
	
	
	public int getLength() {
		return length;
	}
	
	public int getXCoor() {
		return xCoor;
	}
	
	public int getYCoor() {
		return yCoor;
	}
	
	public boolean getOrient() {
		return vert;
	}
	
}
