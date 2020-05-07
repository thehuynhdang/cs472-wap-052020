package servlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import servlet.forms.ContactForm;

@WebServlet("/submitcontactus")
public class SubmitContactAction extends BaseAction<ContactForm> {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(ContactForm contactForm) throws ServletException, IOException {
		contactForm.getRequest().setAttribute("contact", contactForm);
		return "WEB-INF/pages/thankyou.jsp";
	}

	@Override
	public ContactForm createValidationForm(HttpServletRequest req) {
		return new ContactForm(req);
	}
}
