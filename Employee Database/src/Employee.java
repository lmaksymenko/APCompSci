import java.io.Serializable;

public class Employee extends Associate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644045015247851498L;

	Employee(String nam, int I, String occ, String user, String pass){
		name = nam;
		ID = I;
		username = user;
		password = pass;
		occupation =occ;
		schedule[0] = "off";
		schedule[1] = "9am-5pm";
		schedule[2] = "9am-5pm";
		schedule[3] = "9am-5pm";
		schedule[4] = "9am-5pm";
		schedule[5] = "9am-5pm";
		schedule[6] = "off";
	}
	
	public String returnSchedule(int day) {
		return schedule[day];
	}

	public void editSchedule(int day, String edit) {
		schedule[day] = edit;
	}

	public void changeOccupation(String x) {
		occupation =x;
	}
	
	public String returnOccupation() {
		return occupation;
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
