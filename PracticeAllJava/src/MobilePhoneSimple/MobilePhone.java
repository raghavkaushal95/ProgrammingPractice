package MobilePhoneSimple;
import java.io.*;

import java.util.*;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact>myContacts;

	
	
	public MobilePhone(String myNumber) 
	{
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	
	public boolean addNewContact(Contact contact)
	{
		if(findContact(contact.getName())>=0)
		{
			System.out.println("Contact already exists");
			return false;
		}
		
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		
		int k =-1;
		Integer K = new Integer(k);
		int position= findContact(oldContact);
		
		if(position<0)
			{System.out.println(" The"+oldContact.getName()+" cannot be found");
			return false;
			}
		
		else if(findContact(newContact.getName())!=-1) 
		{ 
			System.out.println("Contact with name "+ newContact.getName()+ " already exists. Update was not successful");
			return false;
			
		}
		myContacts.set(position,newContact);
		System.out.println(" The "+oldContact.getName()+" was replaced by "+ newContact.getName()); 
		return true;
	}
	
	
	
	
	
	
	
	private int findContact(Contact contact) {
		
		return this.myContacts.indexOf(contact);		
	}
	
	private int findContact(String contactName) 
	{
		for(int i=0;i<this.myContacts.size();i++)
		{
			Contact contact1 = myContacts.get(i);
			if(contact1.getName().equals(contactName))
			{
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public boolean removeContact(Contact contact) {
		
		int position = findContact(contact);
		if(position<0)
		{	
			System.out.println(contact.getName()+", was not found");
		       return false;
		
		}
		
		this.myContacts.remove(position);
		System.out.println(contact.getName()+", was deleted");
		return true;
		
		
	}
	
	
	
	
	
	
	public void printContacts() 
	{
		
		System.out.println("\nThe stored contacts are: \n");
			for(int i =0;i<myContacts.size();i++ )
				System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+ myContacts.get(i).getPhoneNumber() );
		
		
	}
	
	
	
	public String queryContact(Contact contact) {
		
		if(findContact(contact)>=0)
			return contact.getName();
		
		return null;
		
	}
	
	
	public Contact queryContact(String name)
    {
		int position = findContact(name);
			if(position>=0)
			{	
				return myContacts.get(position);
            }
		return null;
    }
	
	
	
}
