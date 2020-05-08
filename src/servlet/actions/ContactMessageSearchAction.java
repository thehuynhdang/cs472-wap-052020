package servlet.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import model.ContactMessage;
import model.SearchCriteria;
import service.ContactMessageServiceImpl;
import service.IContactMessageService;
import servlet.forms.BaseValidationForm;
import servlet.forms.DefaultNonValidationForm;

/**
 * Servlet implementation class ContactMessageController
 */
@WebServlet(description = "ContactMessageSearchAction", urlPatterns = { "/contact-messages-search" })
public class ContactMessageSearchAction extends BaseAction<BaseValidationForm> {
	private static final long serialVersionUID = 1L;
	
	private IContactMessageService contactMessageService = new ContactMessageServiceImpl();
	   
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
    }

	@Override
	public String execute(BaseValidationForm validationForm) throws ServletException, IOException {
		HttpServletRequest request = validationForm.getRequest();
		SearchCriteria searchCriteria = new SearchCriteria(String.valueOf(request.getParameter("queryString")));
        List<ContactMessage> contactMessages = contactMessageService.search(searchCriteria);
        request.setAttribute("contactMessages", contactMessages);
        request.setAttribute("queryString", searchCriteria.getQueryString());
		return "/contact-messages-list";
	}

	@Override
	public BaseValidationForm createValidationForm(HttpServletRequest request) {
		return new DefaultNonValidationForm(request);
	}

}
