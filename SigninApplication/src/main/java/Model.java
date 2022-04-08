import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	private String name;
	private String un;
	private String pwd;
	private String email;
	private String nemail;
	
	public String getNemail() {
		return nemail;
	}

	public void setNemail(String nemail) {
		this.nemail = nemail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	int createAccount() {
		try {
			Connection con;
			PreparedStatement pstmt;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection established successfully");
			pstmt = con.prepareStatement("INSERT INTO USERDETAILS (name,un,pwd,email) VALUES (?,?,?,?)");
			
			pstmt.setString(1, name);
			pstmt.setString(2, un);
			pstmt.setString(3, pwd);
			pstmt.setString(4, email);
			
			int rows = pstmt.executeUpdate();
			return rows;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	int verify() {
		ResultSet result;
		try {
			Connection con;
			PreparedStatement pstmt;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Registered");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("connection successful");
			
			pstmt = con.prepareStatement("SELECT * FROM USERDETAILS WHERE UN = ?");
			pstmt.setString(1, un);	
			result = pstmt.executeQuery();
	
			// result valid
			if(result.next()) {
				name = result.getString("Name");
				if(result.getString(3).equals(this.pwd)) {
					return 1;
				}else {
					return 0;
				}
				
			}else {
				return -1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}
	
	int updateEmail() {
		try {
			Connection con;
			PreparedStatement pstmt;
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection established successfully");
			pstmt = con.prepareStatement("UPDATE USERDETAILS SET EMAIL=? WHERE UN = ?");
			
			pstmt.setString(1, nemail);
			pstmt.setString(2, un);
			
			int rows = pstmt.executeUpdate();
			return rows;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
