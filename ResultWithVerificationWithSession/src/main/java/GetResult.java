import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con;
			PreparedStatement pstmt;
			ResultSet res;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver registered successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection Established");
			
			pstmt = con.prepareStatement("SELECT * FROM STUDENT WHERE ID=?");
			int temp = Integer.parseInt(request.getParameter("id"));
			
			pstmt.setInt(1, temp);
			res = pstmt.executeQuery();
			
			while(res.next()) {
				int id = res.getInt(1);
				String name = res.getString(2);
				int marks1 = res.getInt(3);
				int marks2 = res.getInt(4);
				int marks3 = res.getInt(5);
				
				HttpSession session = request.getSession(true);
				session.setAttribute("id", Integer.valueOf(id));
				session.setAttribute("name", name);
				session.setAttribute("marks1", Integer.valueOf(marks1));
				session.setAttribute("marks2", Integer.valueOf(marks2));
				session.setAttribute("marks3", Integer.valueOf(marks3));
				
				response.sendRedirect("/ResultWithVerificationWithSession/printResult.jsp");
				
//				session.getAttribute("id");
//				session.removeAttribute("id");
				
				
				PrintWriter pw = response.getWriter();
				pw.print(id+" "+name+" "+marks1+" "+marks2+" "+marks3+" ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
