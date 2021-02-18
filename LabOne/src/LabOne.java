

public class LabOne {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
   	 //starPyramid(17);
    	//printChart(30);
    	//armstrongNumbers(1000,100000);
    }
 
    
    public static void starPyramid(int rows) {
    	int counter=0;
    	
    	for(int x=0; x<rows; x++) {
    		counter++;
    		
    		for(int y=0; y<rows-counter; y++) {
    			System.out.print("  ");
    		}
    		
    		for(int j=0; j<counter;j++) {
    			System.out.print("* ");
    		}
    	
    		for(int g=0; g<x; g++) {
    			System.out.print("* ");
    		}
    		
    		System.out.println();
    	}
    }
    
    
    public static void printChart (int input) {
	
    	int num=0;
    	int row=0;
    	 while(num<input) {
    		 row++;
    		
    		 for(int x=0; x<row; x++) {
    			 num++;
    			 System.out.print(num + " "); 
    		 if(num==input) {
    			 break;
    		 }
    		
    		 }
    		 System.out.println();
    	 }
    }


    public static int numDigits(int x) {
    	
    	int numNums=0;
    	while(x>0) {
    		x=x/10;
    		numNums++;
    	}
    	return numNums;
    }
    
    
    public static int power(int base, int exp) {
    	
    	int output=base;
    	for(int x=1; x<exp; x++) {
    		output=output*base;
    	}
    	return output;
    }

    
    public static boolean isArmstrong(int x) {
    	boolean armNum=false;
    	int y=x;
    	int tempx=0;
    	int armstrong=0;
    	int exponents=numDigits(x);
   
    	for(int j=0;j<exponents;j++) {
    		tempx=y%10;
    		armstrong=armstrong+power(tempx,exponents);
    		y=y-tempx;
    		y=y/10;
    	}
    	
    	if(armstrong==x) {
    		armNum=true;
    		
    		}
    	return armNum;
    }

    public static void armstrongNumbers(int min, int max) {
        for(int x=min;x<=max;x++) {
        	if(isArmstrong(x)) {
        		System.out.println(x);
        	}
        }
    
    }
    



}



