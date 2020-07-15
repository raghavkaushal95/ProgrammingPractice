package PCT;
import java.io.*;
import java.util.*;



public class SnakesLadders
{
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Integer,Integer> SnakeLadder = new HashMap<>(); //container for snakes and Ladders
		
		int num_snakes_ladders = Integer.parseInt(scanner.nextLine()); //number of ladders and snakes
		   
		
		for(int i=0;i<num_snakes_ladders;i++)
			{
			
			 String[] values = scanner.nextLine().split(" ");    // 27->88 and 97-> 14
			 SnakeLadder.put(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			
			}
		
		int moves_number = Integer.parseInt(scanner.nextLine());   //18
		
		
	     	String[] moves_list =  scanner.nextLine().split(" ");   //storing in string 
		
	    	int[] moves_array = new int[moves_number];
	    	
	    	for(int i=0;i<moves_number;i++)
	    		moves_array[i]= Integer.parseInt(moves_list[0]);// make changes to moves_list{index}
	    	
	    	
	    	int a_start = moves_array[0];
	    	   a_start = a_start+1;
	    	for(int i =2;i<moves_number;i=i+2 )
	    	{
	    		 if(!SnakeLadder.containsKey(a_start))
	    		 {
	    		
	    				a_start= a_start+ moves_array[i];
	    				
	    				//System.out.println("loop Value of a_start is " + a_start);
	    			// if(SnakeLadder.containsKey(a_start))
	    			 {
	    				 while(SnakeLadder.containsKey(a_start))
	    				{
	    					int temp = SnakeLadder.get(a_start);
	    					a_start = temp; 				
	    				}
	    			
	    			
	    			 }
	    		//System.out.println(a_start);
	    		 }
	    		 
	    		 else {
	    			 		while(SnakeLadder.containsKey(a_start))
	    			 			{
	    			 				int temp = SnakeLadder.get(a_start);
	    			 			    a_start = temp; 				
	    			 			}
	    			
	    			 a_start= a_start+ moves_array[i];
	    			 
	    			 
	    			 
	    			 
	    			 
	    		 }
	    		 
	    		 
	    		 
	    		 
	    		 
	    		
	    	}
	    	
	    	System.out.println("                                                           \n");	
	    	
	    	
	    	System.out.println("=======================================================");
	    	
	    	int b_start= moves_array[1]+1;
    		
    		for(int j =3; j<moves_number;j=j+2) 
    		{
    			if(!SnakeLadder.containsKey(b_start))	
    			{
    				b_start = b_start+ moves_array[j];
    				
    				//System.out.println("loop Value of b_start is " + b_start);
    				
    				
    				//	if(SnakeLadder.containsKey(b_start))	
    					{
    						while(SnakeLadder.containsKey(b_start))
    						{
    							int temp1 = SnakeLadder.get(b_start);
    							b_start= temp1;
    						}
    				
    					}
    			//	System.out.println(b_start);	
    			}
    			else
    			{
    				
    				while(SnakeLadder.containsKey(a_start))
		 			{
		 				int tempx = SnakeLadder.get(b_start);
		 			    b_start = tempx; 				
		 			}
		
		             b_start= b_start+ moves_array[j];
    				
    				
    				
    				
    				
    				
    				
    			}
    		
    		
    		
    		
    		
    		
    		}
    			
    				
    	     
    			
    			
    		
	            if(a_start>b_start)
	              System.out.println("A "+ a_start);
	            
	           else if (a_start<b_start)
	              System.out.println("B "+ b_start);	
	
	            
	           else if(a_start==b_start) 
	        	   System.out.println("both are equal "+ b_start);
	            
	              
	              
	              System.out.println("            \n ");
	              
	          	System.out.println("                                                           \n");	
		    	
		    	
		    	System.out.println("=======================================================");
		    	
		    	for(Map.Entry<Integer,Integer>entry: SnakeLadder.entrySet())
		    	{
		    		
		    		 System.out.println("Key  :"+entry.getKey()+ "     Value  :" + entry.getValue()  );
		    		
		    		
		    	}
	
	
	
	
	
	}
    		
    		
    		
	    	
	    		
		
		
		
		
		
	
	

}



