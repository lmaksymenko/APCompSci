import java.util.Random;

public class LoadedDice extends Random{
	
	LoadedDice(){
		super();
	}
	
	public int nextInt(int num) {//num == MAX_VALUE
		
		if(super.nextInt(2) == 0) {//5-% chance boolean - true return 6 else random 
			return 6;
		}else {
			return super.nextInt(num)+1;//returns a random num for the loaded die
		}
	}
	
}
