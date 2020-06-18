import java.io.*;
import java.util.*;

public class UniqueWordCount {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string whose unique world count you wish to obtain");
		String inputString = scan.nextLine();
		
		String[] inputStringArr = inputString.split(" ");
		
		 HashSet<String> hset = new HashSet<String>();
		 
		 
		 for(int i=0; i<inputStringArr.length;i++ ) 
		 {
			   if(inputStringArr[i]!= null)
			   hset.add(inputStringArr[i].toLowerCase());
		 }
		
	System.out.println("The total number of unique words is "+ hset.size());
	
	}

}
