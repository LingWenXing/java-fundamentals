

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PendingRequests
 */
public class PendingRequests extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String cun = (String)session.getAttribute("cun");
		
		Model m = new Model();
		m.setCun(cun);
		
		ArrayList carsList = m.getPendingRequests();
		PrintWriter pw = response.getWriter();
		for(int i=0; i<carsList.size(); i++) {
			pw.println(carsList.get(i));
		}
		
//		if(rows == 0) {
//			response.sendRedirect("/CarServiceSystem/registeredCustomersFailure.html");
//		}else {
//			response.sendRedirect("/CarServiceSystem/registeredCustomersSuccess.jsp");
//		}
	}

}
