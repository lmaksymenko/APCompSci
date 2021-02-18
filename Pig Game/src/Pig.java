
import java.util.Scanner;

public class Pig {
	
	private boolean pigDamage=false;
	private boolean change;
	Scanner keyboard = new Scanner(System.in);
	Player player1 = new Player();
	Player player2 = new Player();
	
	Pig(){	
	}
	
	public void bigBoy() {//runs game
		player1.setTotalScore();
		player2.setTotalScore();
		setPlayers();
		assignFirstPlayer();
		play();
	}
	
	public void setPlayers() {
		System.out.println("Player 1: Enter Name");
		player1.setName(keyboard.next());
		
		System.out.println("Player 2: Enter Name");
		player2.setName(keyboard.next());
	}
	
	public void assignFirstPlayer() {
		int player1Roll = player1.roll();
		int player2Roll = player2.roll();
		
		if(player1Roll == player2Roll) {
			System.out.println("Same roll, rolling again.");
			assignFirstPlayer();
		}
		
		if((player1Roll > player2Roll) && (player1Roll != player2Roll)){
			System.out.println(player1.getName() + " rolls first");
			change = true;
			firstPlayer();
		
		}
		else if(player1Roll != player2Roll) {
			System.out.println(player2.getName() + " rolls first");
			change = false;
			secondPlayer();
		}
		
	}
	
	public void firstPlayer() {
		System.out.println();
		System.out.println("*");
		System.out.println(player1.getName() + " Press 1 to roll or Press any other number key to hold");
		System.out.println();
		if(keyboard.nextInt() == 1) {
			player1.takeTurn();
			if(player1.getRollResult() == 1) {
				change = !change;
				checkDamage();
			}
			checkDamage();
			
		}
			else {
				player1.hold();
				change = !change;
				checkDamage();
			}
			
	}

	public void secondPlayer() {
		System.out.println();
		System.out.println("**");
		System.out.println(player2.getName() + " Press 1 to roll or Press any other number key to hold");
		if(keyboard.nextInt() == 1) {
			player2.takeTurn();
			if(player2.getRollResult() == 1) {
				change = !change;
				checkDamage();
			}
			checkDamage();
		}
		else {
			player2.hold();
			change = !change;
			checkDamage();
		}
		
	}
	
	public void checkDamage() {
		scoreCheck();
		if(!pigDamage) {
			play();
		}
	}
	public void play() {
		if(change) {
			firstPlayer();
		}
		if(!change) {
			secondPlayer();
		}
	}
	
	public void scoreCheck() {//calls final second and first
		if(player1.getScore() >= 100) { 
			finalSecondPlayer();	
		}
		if(player2.getScore() >= 100) {
			finalFirstPlayer();
		}
	}
	
	public void giveInstructions() {
		System.out.println("Welcome to Pig. Your goal is to get a score of 100."); 
		System.out.println("When you press 1 you will roll and the running score will be added to your score. If a 1 is rolled the running score is set to zero.");
		System.out.println();
	}
	
	public void finalFirstPlayer() {
		System.out.println(player1.getName()+ ", last chance continues until you bust! Press 1 to roll");
		if(keyboard.nextInt() == 1) {
			
			if(player1.getRollResult() != 1) {
				finalFirstPlayer();
				checkFinalScore();
			}
		}
		else {
			player1.hold();
			checkFinalScore();
		}
	}
	
	public void finalSecondPlayer() {
		System.out.println(player2.getName()+ ", last chance continues until you bust! Press 1 to roll");
		if(keyboard.nextInt() == 1) {
			player2.takeTurn();
			
			if(player2.getRollResult() != 1) {
				checkFinalScore();
			}
		}
		else {
			player2.hold();
			checkFinalScore();
		}

	}
	
	
	public void checkFinalScore() {
		System.out.println("Checking score...");
		if(player1.getScore() > player2.getScore()) {
			player1.win();
		}else if(player2.getScore() > player1.getScore()) {
			player2.win();
		}
		
		System.out.println("Press 1 to play again, or any other number key to stop");//restarts game
		if(keyboard.nextInt() == 1) {
			bigBoy();
		}
		else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		Pig game = new Pig();
		game.giveInstructions();
		game.bigBoy();
		
	}
}





