import java.util.ArrayList;
import java.util.Scanner;

public class Class {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<String> students = new ArrayList<String>();
	
	public static void numStudents() {
		System.out.println("The class currently has " + students.size()+ " students.");
	}
	
	public static void addStudent() {//adds a student
		System.out.println("Enter student name.");
		students.add(scanner.next());
		System.out.println("Student added.");
	}

	public static void addStudentIndex() {//adds a student to a specified index
		System.out.println(" Enter student location in the list.");
		int x=scanner.nextInt();
		System.out.println("Enter student name.");
		students.add(x, scanner.next());
		
		System.out.println("Student added to spot " + x + " .");
	}

	public static void getStudent() {//prints student name from a certain index
		System.out.println("Enter desired students list number.");
		System.out.println(students.get(scanner.nextInt()));
	}

	public static void removeStudent() {//removes a student name at specified index
		System.out.println("Enter list number of student to be removed.");
		students.remove(scanner.nextInt());
	}

	public static void emptyClass() {//Checks if the class list is empty
		if(students.isEmpty()) {
			System.out.println("The class list is empty.");
		}else {
			System.out.println("The class list is not empty.");
		}
	}


}


