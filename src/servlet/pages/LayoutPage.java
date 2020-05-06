package servlet.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class LayoutPage extends HttpServlet {
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
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<body>");
		
		Object errors = req.getAttribute("errorMessages");
		if(errors != null) {
			writer.write("<ul style='color:red;'>");
			for(String error : (List<String>)errors) {
				writer.write("<li>" + error + "</li>");
			}
			writer.write("</ul>");
		}
		
		writer.write(buildBodyContent(req));
		
		writer.write("</body>");
		writer.write("<footer>");
		writer.write("<div>");
		writer.write("<p>Hit count for this page: " + ++hitCount + "</p>");
		writer.write("</div>");
		writer.write("<div>");
		writer.write("<p>Hit count for entire App: " + req.getServletContext().getAttribute("appHitCount")  + "</p>");
		writer.write("</div>");
		writer.write("</footer>");
		writer.write("</html>");
	}
	
	public abstract String buildBodyContent(HttpServletRequest req);

}
