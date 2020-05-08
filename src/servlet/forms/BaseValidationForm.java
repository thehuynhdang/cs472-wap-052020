package servlet.forms;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseValidationForm implements Serializable {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private String inputPage;
	
	public BaseValidationForm(HttpServletRequest request, String inputPage) {
		this.request = request;
		this.inputPage = inputPage;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public String getInputPage() {
		return inputPage;
	}

	public abstract boolean validate();
	
}
