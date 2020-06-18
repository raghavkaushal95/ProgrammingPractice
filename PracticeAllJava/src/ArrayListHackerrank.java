import java.io.*;
import java.util.*;
public class ArrayListHackerrank 
{

	public static void main(String[] args ) 
	{
		System.out.println(" Enter the 5  elements for the arrayList ");
		
		ArrayList<String[]> harry = new ArrayList<>();

		Scanner scan1 = new Scanner(System.in);
		//String[] storage  = scan1.nextLine().split(" ");
	 
		String[] petter = scan1.nextLine().split(" ");
		
		for(int  i =0; i< petter.length;i++)
			harry.add(0,(petter));
		

// harry.add(Integer.parseInt(storage));
 
    //   for(int i =0;i<storage.length;i++)
	//	harry.add(Integer.parseInt(storage[i]));
 
		

		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		
		
		System.out.println(" \n the elements for the arrayList are ");
		
		for(int i =0;i<harry.size();i++)
		{
			
			System.out.println("The element at position "+ (i+1)+ "  is equal to "+ harry.get(i));
		}
		
		
	}
	
	
}
