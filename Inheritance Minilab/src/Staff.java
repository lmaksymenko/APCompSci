
public class Staff extends Person{
	private String roll;
	
	
	Staff(String y, String x) {
		super(y);
		roll = x;
	}
	
	public void setRoll(String z) {
		roll = z;
	}
	
	public String getRoll() {
		return roll;
	}

	public String toString(){
		return super.getName() + ": " + roll;
	}
	
}
