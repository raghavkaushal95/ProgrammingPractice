package Comparitive_Java_project;
import java.util.*;
import java.io.*;


public class exchange12 
{
	
   public static LinkedHashMap<String,ArrayList<String>> hasher = new LinkedHashMap<>();
	
	public static ArrayList<String> Lister = new ArrayList<>();
   
   
	public static void main(String[] args)

	{ 
		
		
		
		
	
	
           try
           		{
	    			Scanner scan1 = new Scanner(new File("C:\\Users\\super\\git\\ProgrammingPractice\\PracticeAllJava\\src\\Comparitive_Java_project\\calls.txt"));
	    			while(scan1.hasNextLine()) 
	    			{
	    				Lister.add(scan1.nextLine());
		   
	    			}
	    			scan1.close();
	
           		}
           catch(Exception e)
           {
        	   
        	   e.printStackTrace();
          
           }
           
       	                                     	
	StoreData(Lister);
	
	//System.out.println("\n");
	
	System.out.println("** Calls to be made ** ");
	
	
	for (Map.Entry<String, ArrayList<String>> entry : hasher.entrySet()) {
       //   start(entry.getKey(),entry.getValue());
		 System.out.println(entry.getKey() + ":  " + entry.getValue().toString());
	
	
	}
	
	
System.out.print("\n");
	
	
	
	for (Map.Entry<String, ArrayList<String>> entry : hasher.entrySet()) 
	{
		  String caller = entry.getKey();
		  
		  for(String str: entry.getValue())
		      makeCalls(caller,str,System.nanoTime());                             //makeCalls(caller,receiver);
	
	 }
	
  }
	
	public static void makeCalls(String sender, String receiver, long l)
	{
		
		System.out.println(receiver + " received intro message from "+ sender +" ["+l+ "]");
		
		
		getreply(receiver,sender,l);
		
		
		
	}
	public static void getreply (String reply_sender,String reply_receiver, long l)
	{
		System.out.println(reply_receiver + " received reply message from "+ reply_sender+" ["+l+"]");
						
	}
	
	
	
	
	
	public static void StoreData(ArrayList<String> list) 
	{
		ArrayList<String> tempList = new ArrayList<>();
		
		
		String temporary;
		for(int i =0;i<list.size();i++)
		{
			temporary = list.get(i);
		    temporary = temporary.replaceAll("\\{","").replaceAll("\\}","").replaceAll("\\[", "").replaceAll("\\]","").replaceAll(" ", "").replaceAll("\\.","");
		  
		   // System.out.println(temporary);
		    
		    tempList.add(temporary);
		    
		 //   System.out.println(tempList.toString());
		   
		
		}
	
		for(int j =0;j<tempList.size();j++) 
		{ 
			String[] tempArray = tempList.get(j).split(",");
			
			ArrayList <String> finalList = new ArrayList<>();
			 Collections.addAll(finalList, tempArray);
			//finalList = Arrays.asList(tempArray);
		//	finalList.add(tempArray);
			
			String key = finalList.get(0);
			finalList.remove(0);
			
			hasher.put(key,finalList);
			
			
		}
		  
		
	}
	
	  
	
	
	
	
	
	
	
     
	
}
