package service;

import java.util.List;

import model.ContactMessage;
import model.SearchCriteria;

public interface IContactMessageService {
	public List<ContactMessage> search(SearchCriteria searchCriteria);
	public List<ContactMessage> loadContactMessages();
	public void addNewContactMessage(ContactMessage contactMessage);

}
