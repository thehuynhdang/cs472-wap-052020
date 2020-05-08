package servlet.forms;

import javax.servlet.http.HttpServletRequest;

public class DefaultNonValidationForm extends BaseValidationForm{
	private static final long serialVersionUID = 1L;

	public DefaultNonValidationForm(HttpServletRequest request) {
		super(request, "");
	}

	@Override
	public boolean validate() {
		return true;
	}

}
