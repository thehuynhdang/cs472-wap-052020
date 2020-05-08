package service;

import java.util.List;
import java.util.stream.Collectors;

import dao.ContactMessageDAOImpl;
import dao.IContactMessageDAO;
import model.ContactMessage;
import model.SearchCriteria;

public class ContactMessageServiceImpl implements IContactMessageService {
	private IContactMessageDAO contactMessageDAO = new ContactMessageDAOImpl();

	@Override
	public List<ContactMessage> search(SearchCriteria searchCriteria) {
		List<ContactMessage> messages = this.loadContactMessages();
		if(!"".equals(searchCriteria.getQueryString())) {
			return messages.stream().filter(t -> t.getCustomerName().contains(searchCriteria.getQueryString())
					|| t.getCategory().contains(searchCriteria.getQueryString())
					|| t.getGender().contains(searchCriteria.getQueryString())
					|| t.getMessage().contains(searchCriteria.getQueryString()))
					.collect(Collectors.toList());
		}
		return messages;
	}

	@Override
	public List<ContactMessage> loadContactMessages() {
		return contactMessageDAO.loadContactMessages();
	}

}
