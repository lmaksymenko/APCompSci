
public class Driver {

	public static void main(String[] args) {
		Staff teacher1 = new Staff("Dufford","Science Coordinator");
		Student student1 = new Student("Mike",107);
		teacher1.setRoll("retired");
		student1.setStudentNumber(200);
		System.out.println(teacher1.toString());
		System.out.println(student1.toString());
	}

}
