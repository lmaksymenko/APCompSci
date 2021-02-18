
public class Digit {
 
	private static String alpha ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void translator(int base) {
	
		for(int i =Number.remainderList.size()-1; i>=0; i--) {                        
		
			int currentNum = Number.remainderList.get(i);
		
				if(currentNum >= 10) {//works fine and dandy
					//converts the number to its corresponding letter of alphabet and adds it to the list
					Number.numList.add(0, toString(alpha.charAt(currentNum - 10)));
				}else {
					Number.numList.add(0, toString(currentNum));
				}
		}
	
	}

	public static String toString(int x) {//for numbers
		return String.valueOf(x);
	}

	public static String toString(char y) {//for chars
		return String.valueOf(y);
	}

}
