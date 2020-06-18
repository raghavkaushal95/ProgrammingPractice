import java.io.*;
import java.util.*;

public class CreditCard {
	
	public static void main(String[] args) 
	{
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Credit Card Number");
		String CardData =  scan2.nextLine();
		
		
		String[] CardDataDigits = CardData.split("");
		int[] xa = new int[CardDataDigits.length];
		
for(int i=0;i< CardData.length();i++)
{
	xa[i]= Integer.parseInt(CardDataDigits[i]);

}

System.out.println("\n The credit card number entered is ");
for(int i=0;i<xa.length;i++)
{
System.out.print(xa[i]);	

}
int digitCount = xa.length;

int SumOfDigits;
int pos;

	pos = digitCount-2;
	for(; pos>=0;pos-=2);
	{
		//tempsum =0;
		int zox  = xa[pos];
		if((zox*2)/10==0) 
		
		{
			
			
			zox = zox*2;
		}
		else if ((zox*2)/10 !=0)
		{
			int tempsum =0;
			int num = zox*2;
			while (num>0)
			{
				tempsum = tempsum +num%10;
				num = num/10;
			}
			
			zox = tempsum;
			
		}
		
		
		
	}
	
	
	SumOfDigits =0;
	
	for(int j=0;j<digitCount;j++)
		SumOfDigits =  SumOfDigits + xa[j];


	
	
	
	
	if(SumOfDigits%10==0) 
	{
		System.out.println("\n VALID");
		
	}
	else {
		
		int rem = SumOfDigits%10;
		
		if(rem<=5)
			System.out.println("INVALID "+rem);
		
		else if(rem>5)
		{
			System.out.println("INVALID "+(10-rem));
			
		}
		
		
	}
	
	






		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
