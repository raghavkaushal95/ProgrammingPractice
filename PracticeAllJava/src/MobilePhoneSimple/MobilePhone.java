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
	
	private int findContact(Contact contact) {
		
		return this.myContacts.indexOf(contact);		
	}
	
}
