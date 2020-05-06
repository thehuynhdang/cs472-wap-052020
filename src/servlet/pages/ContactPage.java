package servlet.pages;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import servlet.forms.ContactForm;

@WebServlet("/contactusview")
public class ContactPage extends LayoutPage {
	private static final long serialVersionUID = 1L;
	
	@Override
	public String buildBodyContent(HttpServletRequest req) {
		String name = "";
		String gender = "";
		String category = "";
		String message = "";
		
		ContactForm bean = (ContactForm)req.getAttribute("formBean");
		if(bean != null) {
			name = bean.getCustomerName();
			gender = bean.getGender();
			category = bean.getCategory();
			message = bean.getMessage();
		}
		
		StringBuilder page = new StringBuilder();
		page.append("<h1>Customer Contact Form</h1>");
		page.append("<form action='contactussubmit' method='POST'>");
		page.append("*Name: <input type='text' name='customerName' value='" + name + "'> <br><br>");
		if(gender.equals("Male")) {
			page.append("*Gender:  <input type='radio' name='gender' value='Male' checked> Male  <input type='radio' name='gender' value='Female'> Female <br><br>");
		} else {
			page.append("*Gender:  <input type='radio' name='gender' value='Male'> Male  <input type='radio' name='gender' value='Female' checked> Female <br><br>");
		}
			page.append("*Category: <input type='text' name='category' value='" + category + "'> <br><br>");
		page.append("*Message: <textarea name='message' rows='4' cols='30' value='" + message + "'></textarea> <br><br>");
		page.append("\n");
		page.append("<button type='submit' name='btnSubmit'>Submit</button>");
		page.append("</form>");
		
		return page.toString();
	}

}
