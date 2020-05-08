package servlet.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getAttribute("contactMessages") == null) {
        	 List<ContactMessage> contactMessages = contactMessageService.loadContactMessages();
        	 request.setAttribute("contactMessages", contactMessages);
        }

		request.getRequestDispatcher("/WEB-INF/pages/contact-messages-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
    }

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
