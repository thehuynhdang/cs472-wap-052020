package servlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.forms.BaseValidationForm;

public abstract class BaseAction<T extends BaseValidationForm> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int hitCount;
	
	@Override
	public void init() throws ServletException {
		super.init();
		hitCount = 0;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("hitCount", ++hitCount);
		
		T form = createValidationForm(req);
		if(form != null && !form.validate()) {
			req.setAttribute("formBean", form);
			req.getRequestDispatcher(form.getInputPage()).forward(req, resp);
			return;
		}
		
		String result = execute(form);
		if(result != null) {
			if(result.startsWith("redirect:")) {
				resp.sendRedirect(result.replace("redirect:", "").trim());
			} else {
				req.getRequestDispatcher(result).forward(req, resp);
			}
		}
	}
	
	public abstract String execute(T validationForm) throws ServletException, IOException;
	public abstract T createValidationForm(HttpServletRequest req);
}
