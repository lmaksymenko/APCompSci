import java.io.Serializable;

public class Manager extends Associate implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6470413025826900220L;


	Manager(String nam, int I, String user, String pass){
		name = nam;
		ID = I;
		username = user;
		password = pass;
		schedule[0] = "off";
		schedule[1] = "off";
		schedule[2] = "off";
		schedule[3] = "off";
		schedule[4] = "off";
		schedule[5] = "off";
		schedule[6] = "off";
	}
	
	public String returnSchedule(int day) {
		return schedule[day];
	}

	public void editSchedule(int day, String edit) {
		schedule[day] = edit;
	}

	public String returnOccupation() {
		return "manager";
	}


	public int returnID() {
		return ID;
	}

	
	public String getUsername() {
		return username;
	}

	
	public String getPassword() {
		return password;
	}

	
	public String getName() {
		return name;
	}

	

}
