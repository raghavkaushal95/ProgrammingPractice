import java.io.*;
import java.util.*;

//This code is used for running unigram,bigram and trigram
public class ngram_lab2 {

	
	public static void main(String[] args )
	{
		
		/*String kit = "abc";
		String k = kit.substring(2,3);
		
		
		System.out.println(kit);
		
		System.out.println("\nThe substring is "+ k);
		
		*/
		
		int greatestValue = 0;
		String targetKey ="";
		
		
		int num_lines ; 
		Scanner scan = new Scanner(System.in);
		ArrayList<String> StoreData = new ArrayList<>();
		
		HashMap<String,Integer> hashy = new HashMap<>();
		
		num_lines = Integer.parseInt(scan.nextLine());

		
		for(int i=0 ; i<num_lines; i++)
		{
			
		  String tempString = scan.nextLine();
		  StoreData.add(tempString);
		  
			
		}
		
		int ngram_num = Integer.parseInt(scan.nextLine());
		
		for(int i =0 ; i<num_lines;i++)
		{
			
			String inputString = StoreData.get(i).replaceAll("\\s{2,}", " ");
			
			
			    for(int j =0; j<inputString.length()-ngram_num+1;j++) 
			    {
			    	
			    	String part_input = inputString.substring(j,j+ngram_num);
			    	
			    	if(part_input.trim().length()==2) 
			    	{
			    		   if( (part_input.charAt(0)>='a' &&  part_input.charAt(0)<='z') &&  (part_input.charAt(1)>='a' &&  part_input.charAt(1)<='z') )                 
			    		   		{
			    			   			if(hashy.containsKey(part_input))
			    			   				hashy.put(part_input, hashy.get(part_input)+1);
			    			        
			    			   			else
			    			   				hashy.put(part_input, 1);	
			    			    }
			    	}
			    	
			    	else if (part_input.trim().length()==3)
                        {
			    					if( (part_input.charAt(0)>='a' &&  part_input.charAt(0)<='z') &&  (part_input.charAt(1)>='a' &&  part_input.charAt(1)<='z') &&  (part_input.charAt(2)>='a' &&  part_input.charAt(2)<='z')                  )                 
			    						{
			    												if(hashy.containsKey(part_input))
			    													hashy.put(part_input, hashy.get(part_input)+1);
	    			        
			    												else
			    													hashy.put(part_input, 1);	
	    			                     }
			    		
			    		 }
			    	
			    	
			    	
			    	else if (part_input.trim().length()==1)
			    	{
			    	         	 if( (part_input.charAt(0)>='a' &&  part_input.charAt(0)<='z') )                 
			    	         	 			{
			    			 
			    			 						if(hashy.containsKey(part_input))
			    			 								hashy.put(part_input, hashy.get(part_input)+1);

			    			 						else
			    			 								hashy.put(part_input, 1);	
			    			 
			    			 
			    	         	 			}
			    		
			    	}
			    		
			    	
			    	
			    		
			 /*   	{
			    		 if(part_input.matches("^[a-zA-Z]*$"))
			    		 {
			    			 if(!hashy.containsKey(part_input))
			    				 hashy.put(part_input, 1);
			    			 
			    			 else
			    				hashy.put(part_input, hashy.get(part_input)+1);			    			 			    			 
			    		 }			    		
			    	}  */
			    				    	
			    }
	
		}
		
		
		  for(Map.Entry<String,Integer>entry:hashy.entrySet() )
		  {
			   int tempVal = entry.getValue();
			   String key = entry.getKey();
			   
			   if(tempVal>greatestValue )
			   {
				   greatestValue = tempVal;
				   targetKey = key;
				   
			   }
			   
			  
			  
		  }
		  
		      if(ngram_num ==1)
	         	System.out.println("Unigram  "+ targetKey  );
		      
		      else if(ngram_num ==2)
		    	  System.out.println("Bigram  "+ targetKey  );
		      
		      else if(ngram_num ==3)
		    	  System.out.println("Trigram  "+ targetKey  );
		
		
		
		
		
		
		
		
	}
	
	
	
}
