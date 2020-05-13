package servlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import model.ContactMessage;
import service.ContactMessageServiceImpl;
import service.IContactMessageService;
import servlet.forms.ContactForm;

@WebServlet("/submitcontactus")
public class SubmitContactAction extends BaseAction<ContactForm> {
	private static final long serialVersionUID = 1L;
	private IContactMessageService contactMessageService = new ContactMessageServiceImpl();
	
	@Override
	public String execute(ContactForm contactForm) throws ServletException, IOException {
		contactMessageService.addNewContactMessage(
				new ContactMessage(contactForm.getCustomerName(), contactForm.getGender(), 
						contactForm.getCategory(), contactForm.getMessage()));
		
		contactForm.getRequest().setAttribute("contact", contactForm);
		return "WEB-INF/pages/thankyou.jsp";
	}

	@Override
	public ContactForm createValidationForm(HttpServletRequest req) {
		return new ContactForm(req);
	}
}
