import java.util.Scanner;
import java.util.ArrayList;


public class Number {
	
	private static int num;
	private static int base;
	public static ArrayList<String> numList = new ArrayList<String>();
	public static ArrayList<Integer> remainderList = new ArrayList<Integer>();
	static Scanner scanner = new Scanner(System.in);
	private static int bool;
	
	public Number(){
	}
	
	public static void main(String[] args) {
		userInterface();
	}

	public static void userInterface() {
		System.out.println("Enter a number in base 10.");
		num = scanner.nextInt();
		System.out.println("Enter desired base.");
		base = scanner.nextInt();
		processNum();
		printNum();
		incrementUi();
		//program repeater
		System.out.println("Do you wish to convert another number? 1 for yes. Any ofther num for no");//the previous number isn't wiped form the list
		bool = scanner.nextInt();
			
		if(bool == 1) {
				cleaner();
				userInterface();
			}
	}
	
	
	public static void longDivision(int number, int base) {//divides the number and stores remainder in a list
		int workNum = number;
		Integer remainder;
		
		while(workNum > 0) {
			remainder = workNum % base;
			remainderList.add(0 , remainder ); //adds remainder to array list of integers 
			workNum /= base;
		}
	}
	
	//non calculation methods
	
	public static void processNum() {
		longDivision(num,base);
		Digit.translator(base);
	}
	
	
	public static void printNum() {//print the number works fine
		for(int i =0; i < numList.size(); i++ ) {
			System.out.print(numList.get(i));
			
		}
		System.out.println();
	}
	
	
	public static void incrementUi() {
			System.out.println("Do you want to increment the number?  Press 1 for yes. Any other num for no.");
			bool = scanner.nextInt();
		
				if(bool == 1) {
					increment();//finish this method
					printNum();
					incrementUi();
				}
			
			
	}
	
	
	public static boolean increment() {//this is broken the rest works fine
		num++;
		cleaner();
		processNum();
	
			if(numList.get(numList.size()-1) == String.valueOf(0)) {
				return true;
			}else {
				return false;
			}
	
	}
	
	
	private static void cleaner() {//Clears the array lists
		numList.clear();
		remainderList.clear();
	}
	
	
}
