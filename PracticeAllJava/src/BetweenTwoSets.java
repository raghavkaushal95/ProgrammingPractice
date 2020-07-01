import java.io.*;
import java.util.*;



public class BetweenTwoSets {

	public static void main(String[] args) {
		
		
		Scanner scan  = new Scanner(System.in);
		
		String[] stringArr  = scan.nextLine().split(" ");
		
	    //String[] stringArr = SizeArr.split(" ");
	    
	    int[] firstArr = new int[Integer.parseInt(stringArr[0])];
	    int [] secondArr =  new int[Integer.parseInt(stringArr[1])];
	    
	    
	    String[] tempString = scan.nextLine().split(" ");
	    
	    for(int  i=0; i< firstArr.length;i++)
	    	firstArr[i] = Integer.parseInt(tempString[i]);
		
		
	tempString = scan.nextLine().split(" ");
			
	
	 for(int  i=0; i< secondArr.length;i++)
	    	secondArr[i] = Integer.parseInt(tempString[i]);
	
	 System.out.println("\n");
	 
	 System.out.println(Arrays.toString(firstArr));
	 
	 System.out.println("\n");
	 
	 System.out.println(Arrays.toString(secondArr));
	 
	 //Logic to Follow
	}
	
	
	
	
	
}
