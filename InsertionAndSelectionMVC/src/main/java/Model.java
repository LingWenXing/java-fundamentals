import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	int insert() {
		try {
			Connection con;
			PreparedStatement pstmt;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver registered successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection Established");
			
			pstmt = con.prepareStatement("INSERT INTO STUDENT (id,name,marks1,marks2,marks3) VALUES (?,?,?,?,?)");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks1);
			pstmt.setInt(4, marks2);
			pstmt.setInt(5, marks3);
			
			int rows = pstmt.executeUpdate();
			return rows;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	void select() {
		Connection con;
		PreparedStatement pstmt;
		ResultSet result;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Registered");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("connection successful");
			pstmt = con.prepareStatement("SELECT * FROM STUDENT where id = ?");
			pstmt.setInt(1, id);	
			result = pstmt.executeQuery();
			
			while(result.next()) {
				int id = result.getInt(1);
				name = result.getString(2);
				marks1 = result.getInt(3);
				marks2 = result.getInt(4);
				marks3 = result.getInt(5);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
