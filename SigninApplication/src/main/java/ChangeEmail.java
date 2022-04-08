

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangeEmail
 */
public class ChangeEmail extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nemail = request.getParameter("nemail");
		
		HttpSession session = request.getSession();
		String un = (String)session.getAttribute("un");
		
		Model m = new Model();
		m.setNemail(nemail);
		m.setUn(un);
		
		int rows = m.updateEmail();
		if(rows==0) {
			response.sendRedirect("/SigninApplication/emailUpdateFailure.html");
		}else {
			response.sendRedirect("/SigninApplication/emailUpdateSuccess.html");
		}
		
		
		
	}

}
