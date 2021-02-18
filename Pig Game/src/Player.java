import java.util.Scanner;

public class Player {
	private int rollResult;
	private int myScore;
	private String myName;
	private int runningScore;
	Scanner keyboard = new Scanner(System.in);
	
	public Player(String x) {
		myScore = 0;
		runningScore = 0;
		String name = x;
	}
	public Player() {
		myScore = 0;
		myName = "Jim";
		runningScore = 0;
	}	
		
	public int getScore() {
		return myScore;
	}
	
	public String getName() {
		return myName;
	}
	
	public int getTempScore() {
		return runningScore;
	}
	public void setName(String name) {
		myName = name;
	}
	
	public int roll() {
		int roll = (int) (Math.random() *6) + 1;
		
		System.out.println(myName + " rolled a " + roll);
		System.out.println();
		return roll;
	}
	
	public void takeTurn() {//takes turn
		rollResult = roll();
		if(rollResult == 1) {
			runningScore = 0;
			System.out.println(myName + " has a total score of: " + myScore);
		}
		else {
			runningScore = runningScore + rollResult;
			System.out.println(myName + " holds a running score of: " + runningScore);
			System.out.println(myName + " holds a total score of: " + myScore);
		
		}
	
		}
	
	public int getRollResult() {//ruslt from roll
		return rollResult;
	}
	
	public void hold() {//holds
		System.out.println(myName + " holds.");
		myScore = myScore + runningScore;
		runningScore = 0;
		System.out.println(myName + "'s total score is now " + myScore);
		
	}
	
	public void win() {
		System.out.println();
		System.out.println(myName + " wins!");
	}

 public void setTotalScore() {
	 myScore=0;
 }

	
}
	

	





