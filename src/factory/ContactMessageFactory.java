package factory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.ContactMessage;

public class ContactMessageFactory {
	private static ContactMessageFactory instance;
	
	private final List<ContactMessage> contactMessages;
	
	private ContactMessageFactory() {
		this.contactMessages = Arrays.asList(
            	new ContactMessage("John H. Smith", "Male", "Feedback", "This is a feedback"),
            	new ContactMessage("Anna Jones", "Female", "Inquiry", "This is an inquiry"),
            	new ContactMessage("Bob W. Adamson", "Male", "Complaint", "This is a compliant"),
            	new ContactMessage("Zacary Najib Ali", "Male", "Inquiry", "This is an inquiry"),
            	new ContactMessage("Carlos Hernandez", "Male", "Inquiry", "This is an inquiry"),
            	new ContactMessage("Tuyen Le Nguyen", "Female", "Feedback", "This is an feedback")
            );
		
		this.contactMessages.stream()
	        	.sorted(Comparator.comparing(ContactMessage::getCustomerName))
	        	.collect(Collectors.toList());
	}
	
	public static ContactMessageFactory getInstance() {
		if(instance == null) { // check for the first time (first Thread)
			synchronized (ContactMessageFactory.class) { // check for the second time (second Thread)
				if(instance == null) instance = new ContactMessageFactory();
			}
		}
		
		return instance;
	}
	
	public List<ContactMessage> getContactMessages() {
		return this.contactMessages;
	}

}
