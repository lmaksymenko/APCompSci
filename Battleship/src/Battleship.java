import java.util.Random;

public class Battleship {
	
	private int gameBoard [] [];
	private int rows;
	private int columns;
	private int numShips;
	Ship[] shipArray = new Ship[5];
	Random rand = new Random();
	
	public Battleship(int row, int col, int ships) {
		//Ship[] shipArray = new Ship[5];
		
		System.out.println("Battleship constructor called. \n");
		
		numShips = ships;
		gameBoard = new int [row][col];
		rows=row;
		columns=col;
		
		//initializes the array of ships
		for(int v=0; v < numShips; v++) {
			System.out.println("Putting ship in slot: " + v);
			
			int xC = rand.nextInt(columns);
			int yC = rand.nextInt(rows);
			System.out.println("xC " + yC);
			System.out.println("yC " + xC);
			
			
			//creates the ships
			if(rand.nextInt(1)==1){
					shipArray [v] = new Ship(v+1, false, xC, yC);//horizontal
					System.out.println("Putting ship in slot: " + v);
				}else {
					shipArray [v] = new Ship(v+1, true, xC, yC);//vertical
			}
			System.out.println();
		}
		
		
		for(int i = 0; i<rows; i++) {
			for(int g =0; g<col; g++){
				gameBoard [i][g] = 0;
			}
		}
		System.out.println("Ships filled and gameboard created.\n");
	}

	
	public void insertShip() {
		
		for(int i = 0; i<numShips; i++) {
			int yMod =0;
			int xMod =0;
				
			System.out.println();
			System.out.println("Ship " + (i+1) + " inserted.");
			
			
			if(shipArray[i].getLength()>1) {
				
				if(shipArray[i].getOrient()){//if the ship is vertical
					System.out.println("vert ship");
					//ship error checker
					do {
						yMod--;
						
					}while(shipArray[i].getYCoor() + yMod + shipArray[i].getLength() > rows-1);// && shipArray[i].getYCoor() + yMod + shipArray[i].getLength()<0);
					
					if(shipArray[i].getYCoor() + yMod + shipArray[i].getLength()<0) {
						yMod++;
					}
					
					for(int h =0; h<shipArray[i].getLength(); h++) {
						if(gameBoard[shipArray[i].getYCoor()+yMod+h][shipArray[i].getXCoor()+xMod] != 0 ) {
							xMod++;
						}
					}
					
					//insert ship
					for(int q =0; q<shipArray[i].getLength();q++){
						gameBoard[shipArray[i].getYCoor()+q+yMod][shipArray[i].getXCoor()+xMod] = shipArray[i].getLength();
					}
				
				}else{//ship is horizontal
					//ship error code checker
					do {
						xMod--;
						
					}while(shipArray[i].getXCoor() + xMod + shipArray[i].getLength() > columns-1);
					
					if(shipArray[i].getXCoor() + xMod<0) {
						xMod++;
					}
					
					for(int h =0; h<shipArray[i].getLength(); h++) {
						if(gameBoard[shipArray[i].getYCoor()][shipArray[i].getXCoor()+xMod+h] != 0 ) {
							yMod++;
						}
					}
					//insert ship
					for(int u =0; u<shipArray[i].getLength();u++){
					
						gameBoard[shipArray[i].getYCoor()+yMod][shipArray[i].getXCoor()+u+xMod] = shipArray[i].getLength();
					}
				}
			}else{
				gameBoard[shipArray[i].getYCoor()][shipArray[i].getXCoor()] = shipArray[i].getLength();
			}
			
		}	
			
	}
	
	
	//print the board
	public void printBoard() {
		System.out.println();
		System.out.println("Player ship board:");
		System.out.print("   ");
		
		for(int v =0; v<columns; v++) {
			System.out.print(" " + v);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0; i<rows; i++) {
			System.out.print(i + "   ");
			for(int g =0; g<columns; g++) {
				
				///System.out.print(g);
				System.out.print(gameBoard[i][g] + " ");	
			}
			System.out.println();
		}
	}


}

