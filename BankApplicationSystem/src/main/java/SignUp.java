

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		CustomerModel cm = new CustomerModel();
		cm.setCustomerName(name);
		cm.setCustomerUsername(username);
		cm.setCustomerPassword(password);
		cm.setCustomerEmail(email);
		
		int rows = cm.customerSignUp();
		if(rows==0) {
			response.sendRedirect("/BankApplicationSystem/signUpFailure.html");
		}else {
			response.sendRedirect("/BankApplicationSystem/signUpSuccess.html");
		}
		
	}

}
