

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	protected void service(HttpServletResponse request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter pw = response.getWriter();
		pw.println("Hello everyone. I have written this message directly from a servlet");
	}

}
