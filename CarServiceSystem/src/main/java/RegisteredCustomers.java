

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisteredCustomers
 */
public class RegisteredCustomers extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String cun = (String)session.getAttribute("cun");
		
		Model m = new Model();
		m.setCun(cun);
		
		ArrayList al = m.retrieveCustomers();
		PrintWriter pw = response.getWriter();
		for(int i=0; i<al.size(); i++) {
			pw.println(al.get(i));
		}
		
//		if(rows == 0) {
//			response.sendRedirect("/CarServiceSystem/registeredCustomersFailure.html");
//		}else {
//			response.sendRedirect("/CarServiceSystem/registeredCustomersSuccess.jsp");
//		}
	}

}
