package servlet.forms;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ContactForm extends BaseValidationForm {
	private static final long serialVersionUID = 1L;

	private String customerName;
	private String gender;
	private String category;
	private String message;
	
	public ContactForm(HttpServletRequest request) {
		super(request, "/viewcontactus");
		this.customerName = request.getParameter("customerName");
		this.gender = request.getParameter("gender");
		this.category = request.getParameter("category");
		this.message = request.getParameter("message");
	}
	
	@Override
	public boolean validate() {
		List<String> errors = new ArrayList<String>();
		if(customerName == null || "".equals(customerName)) {
			errors.add("Customer Name is required.");
		}
		if(gender == null || "".equals(gender)) {
			errors.add("Gender is required.");
		}
		if(category == null || "".equals(category)) {
			errors.add("Category is required.");
		}
		if(message == null || "".equals(message)) {
			errors.add("Message is required.");
		}
		
		if(errors.size() > 0) {
			this.getRequest().setAttribute("errorMessages", errors);
			return false;
		}
		return true;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
