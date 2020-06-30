import java.io.*;
import java.util.*;
public class matchingBrackets {

	public static void main(String[] args)
	{
		ArrayList<String>InputList = new ArrayList<String>() ;
		ArrayList<String>BooleanList =   new ArrayList<String>() ;
		
		
		
		
		Scanner scan  = new Scanner(System.in);
		int  input_number  =Integer.parseInt (scan.nextLine());

		for(int i=0;i<input_number;i++)
		{
			
			InputList.add(scan.nextLine());
			
		}
		
		int t=0;
	//	Stack<Character>stacker= new Stack<>(); ;
		for(int i =0 ;i< InputList.size(); i++)
		{
			
			String temporary = InputList.get(i);
			char[] temp = temporary.toCharArray();
			Stack<Character>stacker= new Stack<>(); ;
			
			for(int j =0;j< temp.length;j++)
			{
				t=j;
				//stacker = new Stack<>(); 
				if(temp[j]=='{'||  temp[j]=='('||  temp[j]=='[' )
				
				{
				     stacker.push(temp[j]);
				
				
			    }
				
				else 
				{
					
					 if(stacker.empty() ) 
					 {
						  t=j;
				         
						 BooleanList.add("FALSE");
						break;
				        }
					
					
					
					
					
					
					
					
					
					
		
				    	
				    	char top = (Character)stacker.peek();
						
						
						if(( temp[j]==')'  &&  top == '(')||( temp[j]=='}'  &&  top == '{')||( temp[j]==']'  &&  top == '['))
						{
							
							stacker.pop();
							
						}
				    	
				    	
				    	
				    	
				   					
				 
				
				
				}
				
			}
			
		//	System.out.println("Size of List is " + BooleanList.size());
			if(BooleanList.size()<t+1)
			{
			//	System.out.println("Size of List is " + BooleanList.size());
				if(stacker.empty()) {
				 
				 BooleanList.add("TRUE");
			     
			    }
			    else{
			    	BooleanList.add(" FALSE");
			    }
			
				System.out.println("Size of List is " + BooleanList.size());
			
		  }
			//else if(BooleanList.size()==t+1)
			//	 BooleanList.remove(t);
			
		}
		
		System.out.println("");
		
		for(int k =0;k<BooleanList.size();k++)
			System.out.println(BooleanList.get(k));
		
		
		
		
	}
	
	
	
	
}
