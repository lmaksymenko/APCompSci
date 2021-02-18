
public class Person {
	private String myName;
	
	Person(String y){
		myName = y;
	}
	

	public void setName(String x) {
		myName = x;
	}
	
	public String getName()  {
		return myName;
	}
	
	public String tostring() {
		return "big gay";
	}
	
	public boolean sameName(Person otherPerson) {
		if(myName.equals(otherPerson.getName())) {
			return true;
		}else {
			return false;
		}
	}


}
