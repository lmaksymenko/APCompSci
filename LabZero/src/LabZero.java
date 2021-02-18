
public class LabZero {

	public int sumOdds(int j)
	{
		int sum = 0;
		
		for(int x = 1; x<=j; x++)
		{
			if(x%2==1) 
			{
				sum+=x;
				
			}
		}
			return sum;
		
	}

	public double piApprox(int y){
	
		double pie=1;
		boolean count = true;
		
		for(double j = 3; j<=y ; j++){
			
			if((j%2==1)&& count){
				
				pie =pie -(1/j);
				count=false;
				
				
			}else {
				
				pie = pie +(1/j); 
				count=true;
				
			}
		
		}
		
		return pie*4;
	
	}

	
	

	public int numTails(int numFlips) {
		
		int tails=0;
		
			for(int x =0; x<numFlips;x++) {
				int n = (int) (Math.random() *2 +1);
				
				if(n==2) {
					tails++;
				}
			
			}
				
			return tails;
	
	}
		
	public int countRolls(int numDies, int dieNums ) {
		int numRolls=0;
		int goodDies =0;
		
		
		if(dieNums<1||dieNums>6) {
			System.out.println("Six sided die cannot roll" + dieNums);
		}
		
		while(goodDies!=numDies) {
			numRolls++;
			
			int n =(int) (Math.random() *6+1);
			
			if(n==dieNums) {
				goodDies++;
			}
		}
	
		return numRolls;
		}
	
	
	
}

