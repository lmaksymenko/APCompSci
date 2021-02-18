
public class Student extends Person{
	private int studentNumber;
	
	Student(String y, int x) {
		super(y);
		studentNumber = x;
	}

	public void set(String newName, int newStudentNumber) {
		super.setName(newName);;
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int c) {
		studentNumber = c;
	}
	
	public String toString() {
		return  super.getName() + ": " + studentNumber;
	}
	
	public boolean equals(Student otherStudent) {
		if( (super.getName().equals(otherStudent.getName())) && studentNumber == otherStudent.getStudentNumber() ) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
