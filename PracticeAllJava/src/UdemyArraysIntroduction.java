import java.io.*;
import java.util.*;

public class UdemyArraysIntroduction {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		
		int [] myIntegers = getIntegers(5);
		
		
		for(int i = 0; i<myIntegers.length;i++ )
		{
			
			System.out.println("The value of element "+ (i+1)+" is equal to  "+ myIntegers[i] );
		}
		
		System.out.println("\nThe average of array values is equal to  "+ getAverage(myIntegers)  );
		

	}
	public static int[]  getIntegers(int number) 
	{
		
		System.out.println("Enter  the "+ number+" integer values \n");
		int[] values = new int[number];
		
		
		for(int  i =0; i<number ; i++)
		{
			
			values[i] = Integer.parseInt(scanner.nextLine()); 
		}
		
		
		return values;
		
		
		
		
	}
	
	
	public static double getAverage(int[] array) 
	{
		int sum =0;
		
		for(int i=0;i<array.length;i++)
         	sum = sum + array[i]; 	
		
		double average = (double)sum/array.length;
		
		
		return average;
		
		
		
	}
	
	
	
	
}
