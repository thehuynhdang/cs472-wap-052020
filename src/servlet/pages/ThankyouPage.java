package servlet.pages;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/thankyou")
public class ThankyouPage extends LayoutPage {
	private static final long serialVersionUID = 1L;

	@Override
	public String buildBodyContent(HttpServletRequest req) {
		StringBuilder page = new StringBuilder();
		page.append("<h1>Thank you. Your message has been received as follows:</h1>");
		page.append("Name: " + req.getParameter("customerName") + "<br>");
		page.append("Gender: " + req.getParameter("gender") + "<br>");
		page.append("Category: " + req.getParameter("category") + "<br>");
		page.append("Message: " + req.getParameter("message") + "<br>");

		page.append("<br><br>");
		page.append("Please feel free to contact us again");
		return page.toString();
	}
}
