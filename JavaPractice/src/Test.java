
import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		
		/* String x = "ab";
		String y  = "aaaaaaaaaaaaaaaaaaab";
		
		int Comparison_Value = x.compareTo(y);
		
		if(Comparison_Value>0)
			System.out.println(" The first string is bigger");
		
		else if (Comparison_Value ==0)
			System.out.println("Both the Strings are equal");
		
		else
			System.out.println(" The second string is bigger");
		
		   */
		
	/*	
		String kill ="federick";
		
		String[] arr = kill.split(" ");
		
		for(int i =0;i<arr.length;i++)
			System.out.println("\n " + arr[i]);
		
		
		System.out.println("\n The size of the array is "+ arr.length);
		*/
		
		
		
		String temp  = " b";
		char o = temp.charAt(0);
		char p = temp.charAt(1);
		
			//if(temp.trim().length() ==2)
			{
				if( (o>='a' && o<='z') && ( (p>='a' && p<='z')   )         )
						System.out.println("Both the elements are letters");
		
				else
					System.out.println("Only one of the elements is a letter");
		
			}
			
		/*	else
				System.out.println("There is only 1 character in the resultant string  and the orignal string has  "+ temp.length()+ " characters");
	
	*/
			}
	
}
