

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		Model m = new Model();
		m.setUn(un);
		m.setPwd(pwd);
		
		int x = m.verify();
		if(x==-1) {
			response.sendRedirect("/SigninApplication/InvalidUserName.html");
		}else if(x==0) {
			response.sendRedirect("/SigninApplication/InvalidPassword.html");
		}else {
			HttpSession session = request.getSession(true);
			session.setAttribute("name", m.getName());
			session.setAttribute("un", un);
			response.sendRedirect("/SigninApplication/loginSuccess.jsp");
		}
		
		
	}

}
