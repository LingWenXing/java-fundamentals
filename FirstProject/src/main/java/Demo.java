import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	protected void service(HttpServletResponse request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("/SecondProject/display.html");
	}

}
