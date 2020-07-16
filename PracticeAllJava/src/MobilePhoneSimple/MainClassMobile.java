package MobilePhoneSimple;

import java.io.*;

import java.util.*;

public class MainClassMobile 
{
	
	static Scanner scan = new Scanner(System.in);
	  
	static  MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
	  	
	public static void main(String args[])
	  {
		
		 boolean quit = false;
		 startPhone();
		 printActions();
		 
	 while(!quit) 
		 { 
		 	System.out.println("\n Enter action: ( press 6 to show available actions ");
			 int action = Integer.parseInt(scan.nextLine());
			 
			 
			 switch(action) 
			 {
			  case 0: 
				   System.out.println("\n The phone is shutting down");
				    quit = true;
				    break;
				    
				    
			  case 1: 
				    printContacts();
				    break;
			 
			 
			  case 2: 
				    addNewContact();
				    break;
			 
			 
				    
			  case 3: updateContact();
			  		break;
			  		
			  		
			  case 4: removeContact();
			           break;
			           
			   
			  case 5: queryContacts();
			          break;
			          
			  case 6: printActions();
			          break;
			          
			          
			           
			 
			 }
			 
			 
		 }
		
		
		
		
		
		
		
		  
		
		  
		  
	  }

	static void startPhone() 
	{
		
		
		System.out.println("Phone is starting............");
	}
	
	static void addNewContact() 
	{
		System.out.println("Enter a new Contact Name");
		String name = scan.nextLine();
		
		System.out.println("Enter Phone number");
		
		String phone= scan.nextLine();
		
		Contact newContact = Contact.createContact(name, phone);
		
		if(mobilePhone.addNewContact(newContact))
			System.out.println("new Contact added: "+ name+", phone =  "+phone);
		
		else
			System.out.println("Cannot add "+ name+" as contact already exists" );	
	}
	
	
	static void printActions() 
	{
		
		System.out.println("\n  available actions:\n press ");
		System.out.println("0 - to shutdown phone\n"+
			               "1 - to print contacts\n"+
				           "2 - to add a new contact\n"+
                           "3 - to update an existing contact\n"+
			               "4 - to remove an existing contact\n"+
                           "5 - to query if a contact exists\n"+
			               "6 - to print a list of available actions.");
		
                           
			System.out.println("Choose an available action");
		
		
		
	}
	
	static void printContacts() 
	{
		
		////for(int i =0;i<myContacts.size();i++ )
		//System.out.println(myContacts.get(i).getName()):
		
		 mobilePhone.printContacts();
		
		
		
	}
	





}
