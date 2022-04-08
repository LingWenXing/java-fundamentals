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
public class InsertData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con;
			PreparedStatement pstmt;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver registered successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection Established");
			
			pstmt = con.prepareStatement("INSERT INTO STUDENT (id,name,marks1,marks2,marks3) VALUES (?,?,?,?,?)");
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int marks1 = Integer.parseInt(request.getParameter("marks1"));
			int marks2 = Integer.parseInt(request.getParameter("marks2"));
			int marks3 = Integer.parseInt(request.getParameter("marks3"));
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks1);
			pstmt.setInt(4, marks2);
			pstmt.setInt(5, marks3);
			int rows = pstmt.executeUpdate();
			
			if(rows==0) {
				response.sendRedirect("/AddStudentData/failure.html");
			}else {
				response.sendRedirect("/AddStudentData/success.html");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
