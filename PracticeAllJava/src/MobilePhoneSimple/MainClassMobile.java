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
		 	System.out.println("\n Enter action: (press 6 to show available actions) ");
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
			           
			   
			  case 5: queryContact();
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
	
	
	
	
	
	public static void updateContact() 
	{
		
		System.out.println("Enter existing contact Name");
		String name = scan.nextLine();
		
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact== null)
		{
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Enter new Contact name");
		String newName = scan.nextLine();
		
		System.out.println("Enter new contact phone number");
		
		String newNumber= scan.nextLine();
		Contact newContact = Contact.createContact(newName,newNumber);
		
		if(mobilePhone.updateContact(existingContact,newContact))
			System.out.println("Contact successfully updated");
		else
			System.out.println("Error updating the contact");
		
	}
	
	
	
	static void removeContact() 
	{
		
		System.out.println("Enter existing contact Name");
		String name = scan.nextLine();
		
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact== null)
		{
			System.out.println("Contact not found");
			return;
		}
		
		if(mobilePhone.removeContact(existingContact)) 
		{
	      System.out.println("Successfully deleted contact");						
		}
		else
		{
			System.out.println("Error deleting contact");	
			
			
		}
		
		
		
		
		
	}
	
	static void queryContact() 
	{
		System.out.println("Enter existing contact name ");
		 String name = scan.nextLine();
		 
		 Contact existingContact = mobilePhone.queryContact(name);
		 
		 if(existingContact==null)
		 {
			 System.out.println("Sorry no contact found");
			 return;
			 
			 
		 }
		 
		 System.out.println("Name: "+ name + ", Phone Number is  :"+existingContact.getPhoneNumber() );
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	static void printActions() 
	{
		
		System.out.println("\n  available actions:\npress the corresponding number key ");
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
