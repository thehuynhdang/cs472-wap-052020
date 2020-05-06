package servlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import servlet.forms.ContactForm;

@WebServlet("/contactussubmit")
public class ContactAction extends BaseAction<ContactForm> {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(ContactForm contactForm) throws ServletException, IOException {
		return "redirect:thankyou?customerName=" 
				+ contactForm.getCustomerName() 
				+ "&gender=" + contactForm.getGender()
				+ "&category=" + contactForm.getCategory()
				+ "&message=" + contactForm.getMessage();
	}

	@Override
	public ContactForm createValidationForm(HttpServletRequest req) {
		return new ContactForm(req);
	}
}
