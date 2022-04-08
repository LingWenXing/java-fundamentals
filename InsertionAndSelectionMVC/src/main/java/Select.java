

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class Select
 */
public class Select extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Model m = new Model();
		m.setId(id);
		
		m.select();
		Integer temp1 = Integer.valueOf(m.getId());
		String temp2 = m.getName();
		Integer temp3 = Integer.valueOf(m.getMarks1());
		Integer temp4 = Integer.valueOf(m.getMarks2());
		Integer temp5 = Integer.valueOf(m.getMarks3());
		
		HttpSession session = request.getSession(true);
		session.setAttribute("id", temp1);
		session.setAttribute("name", temp2);
		session.setAttribute("marks1", temp3);
		session.setAttribute("marks2", temp4);
		session.setAttribute("marks3", temp5);
		
		response.sendRedirect("/InsertionAndSelectionMVC/result.jsp");
		
	}

}
