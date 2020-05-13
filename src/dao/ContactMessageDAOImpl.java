package dao;

import java.util.List;

import factory.ContactMessageFactory;
import model.ContactMessage;

public class ContactMessageDAOImpl implements IContactMessageDAO {

	@Override
	public List<ContactMessage> loadContactMessages() {
		return ContactMessageFactory.getInstance().getContactMessages();
	}

	@Override
	public void addNewContactMessage(ContactMessage contactMessage) {
		ContactMessageFactory.getInstance().getContactMessages().add(contactMessage);
	}

}
