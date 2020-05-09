package servlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import servlet.forms.BaseValidationForm;

@WebServlet("/viewbooks")
public class ViewBooksList extends BaseAction<BaseValidationForm> {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(BaseValidationForm input) throws ServletException, IOException {
		return "WEB-INF/pages/elibrary/books-list.jsp";
	}

	@Override
	public BaseValidationForm createValidationForm(HttpServletRequest req) {
		return null;
	}
}
