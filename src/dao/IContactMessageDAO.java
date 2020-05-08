package dao;

import java.util.List;

import model.ContactMessage;

public interface IContactMessageDAO {
	public List<ContactMessage> loadContactMessages();
}
