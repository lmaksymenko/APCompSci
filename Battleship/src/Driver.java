
public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Program started");
		
		Battleship playBoard = new Battleship(5,5, 2);//board height, board length, number of ships(recommended number is board/2 truncated)
		playBoard.printBoard();
		playBoard.insertShip();
		playBoard.printBoard();
	
	}
	
	
}
