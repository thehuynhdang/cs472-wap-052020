package tags;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LocalDateTimeDecorationTag extends SimpleTagSupport {
	private String color;
	private String size;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		
		LocalDateTime dtNow = LocalDateTime.now();
		String dateFormatted = dtNow.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy hh:mm:ss a"));
		System.out.println("Current Date: " + dateFormatted);
		
		JspWriter out = getJspContext().getOut();
		String show = String.format("<span style='color: %s; "
				+ "font-size: %s;'>%s</span>", color, size, dateFormatted);
		out.print(show);
	}
}
