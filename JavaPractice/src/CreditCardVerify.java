import java.io.*;
import java.util.*;
public class CreditCardVerify 
{

	
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
   if(xa.length <=20)
        {
				System.out.println("\nThe reversed Lopop for credit card number is ");
				for(int j =xa.length-2;j>=0; j=j-2)
				{
	
					System.out.print(xa[j]);	
	
					int pox  = xa[j]*2;;
				
					if(pox/10 ==0) 
					{
						xa[j]= pox ;
			
					}
					else 
					{
						int temp =0;
						int num = pox;
						while(num>0) 
						{
							temp = temp + num%10;
							num = num/10;
						}
			
					//xa[j]= (pox)/10+ (pox)%10 ; 
						xa[j]= temp;
					}	

			}
			
			int digitSum =0;
			
			System.out.println("\n  The final card data is " );
			for(int j=0; j<xa.length;j++)
				{
				  System.out.print(xa[j]);
				 digitSum = digitSum+ xa[j];
				}
		
		System.out.println("\n the sum of the digits is " +digitSum );
		
				if(digitSum%10==0)
             	{
					System.out.println("VALID");
             	}
				
				else 
				{
					
				  int rem = digitSum%10;
				    	
				        if(rem<=5)
				    	{
				    		System.out.println("INVALID "+rem );
				    	}
				        
				        else 
				        System.out.println("INVALID " +(10-rem) );	
						
					
				}
				
				
	        }	
   
   
   
   
   else if (xa.length>20)
    {System.out.println("Sorry Cannot process this data");
    }
				
				
				
				
				
				
				
	}
}
