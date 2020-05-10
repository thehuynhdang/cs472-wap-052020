package servlet.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import model.ContactMessage;
import service.ContactMessageServiceImpl;
import service.IContactMessageService;
import servlet.forms.BaseValidationForm;
import servlet.forms.DefaultNonValidationForm;

/**
 * Servlet implementation class ContactMessageController
 */
@WebServlet(description = "ContactMessageAction", urlPatterns = { "/contact-messages-list" })
public class ContactMessageListAction extends BaseAction<BaseValidationForm>  {
	private static final long serialVersionUID = 1L;
	
	private IContactMessageService contactMessageService = new ContactMessageServiceImpl();

	@Override
	public String execute(BaseValidationForm validationForm) throws ServletException, IOException {
		 if(validationForm.getRequest().getAttribute("contactMessages") == null) {
        	 List<ContactMessage> contactMessages = contactMessageService.loadContactMessages();
        	 validationForm.getRequest().setAttribute("contactMessages", contactMessages);
        }

		return "/WEB-INF/views/contact-messages.jsp";
	}

	@Override
	public BaseValidationForm createValidationForm(HttpServletRequest request) {
		return new DefaultNonValidationForm(request);
	}

}
