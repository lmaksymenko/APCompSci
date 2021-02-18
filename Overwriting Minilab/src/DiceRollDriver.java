import java.util.Random;
import java.util.ArrayList;

public class DiceRollDriver {
	
	public static void main(String[] args) {
		
		
		Random ranGen1 = new Random();
		Random ranGen2 = new LoadedDice();
		
		diceRolls(ranGen1,1);
		diceRolls(ranGen2,2);
		
		for(int i = 0; i<randList.size(); i++) {//"compares" the results
			System.out.println("Random: " + (randList.get(i)+1) + "   Loaded: " + loadList.get(i));
		}
		
//		for(int i = 0; i<10; i++) { //for testing
//			System.out.println("Random: " + (ranGen1.nextInt(MAX_VALUE)+1) + "Loaded: " + ranGen2.nextInt(MAX_VALUE));
//		}
	}
	
	private static int MAX_VALUE = 6; // change to change die size
	static ArrayList<Integer> randList= new ArrayList<>();
	static ArrayList<Integer> loadList= new ArrayList<>();
	
	public static void diceRolls(Random rand, int num) {//roles die for a specific rand object, the second param indicated the storage location
		
		
		if(num == 1) {
			for(int i = 0; i<10; i++) {
				randList.add(rand.nextInt(MAX_VALUE));
			}
		}
		
		if(num == 2) {
			for(int i = 0; i<10; i++) {
				loadList.add(rand.nextInt(MAX_VALUE));
			}
		}
	}
	
}
