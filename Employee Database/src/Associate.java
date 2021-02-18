
public abstract class Associate {	
	protected String name;
	protected int ID;
	protected String[] schedule = new String [7];
	protected String occupation;
	protected String username;
	protected String password;
	//add constructor
	
	public abstract String getUsername();
	public abstract String getPassword();
	
	public abstract String getName();
	
	public abstract String returnSchedule(int day); 
	public abstract void editSchedule(int day, String edit); 
	
	public abstract String returnOccupation();
	public abstract int returnID();
	
	
	
	


}
