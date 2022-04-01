package jdbc;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class MyFirstJDBC {
	public static void update(Connection con) throws Exception{
//		Statement stmt;
//		ResultSet res;
		PreparedStatement pstmt;
		try {
			con.setAutoCommit(false);
			
			Scanner scan = new Scanner(System.in);
			pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=? WHERE ID=?");
			System.out.println("Enter the marks to be updated: ");
			int temp1 = scan.nextInt();
			System.out.println("Enter the ID: ");
			int temp2 = scan.nextInt();
			pstmt.setInt(1, temp1);
			pstmt.setInt(2, temp2);
			int rows1 = pstmt.executeUpdate();
			System.out.println(rows1);
			pstmt.close();
			pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=? WHERE ID=?");
			System.out.println("Enter the marks to be updated: ");
			int temp3 = scan.nextInt();
			System.out.println("Enter the ID: ");
			int temp4 = scan.nextInt();
			pstmt.setInt(1, temp3);
			pstmt.setInt(2, temp4);
			int rows2 = pstmt.executeUpdate();
			System.out.println(rows2);

			if(rows1>0 && rows2>0) {
				con.commit();
			}else {
				con.rollback();
			}
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException.");
		}catch(SQLException e) {
			System.out.println("All the changes are undone.");
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	public static void batchUpdate(Connection con) throws Exception{
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.addBatch("UPDATE STUDENT SET MARKS3=33 WHERE ID=1");
			stmt.addBatch("UPDATE STUDENT SET MARKS3=44 WHERE ID=2");
			stmt.addBatch("UPDATE STUDENT SET MARKS3=55 WHERE ID=3");
			stmt.executeBatch();
			System.out.println("Batch update successfully");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException.");
		}catch(SQLException e) {
			System.out.println("All the changes are undone.");
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	public static void main(String[] args) {
		Connection con;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
			System.out.println("Connection Established");
			
//			update(con);
			batchUpdate(con);
			
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException.");
		}catch(SQLException e) {
			System.out.println("All the changes are undone.");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
//	public static void main(String[] args) {
//		Connection con;
//		Statement stmt;
//		ResultSet res;
//		PreparedStatement pstmt;
//		try {
//			DriverManager.registerDriver(new OracleDriver());
//			System.out.println("Driver is registered successfully");
//			
//			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","4dm1n007");
//			System.out.println("Connection Established");
//			
////			con.setAutoCommit(false);
//			
//			stmt = con.createStatement();
////			res = stmt.executeQuery("SELECT * FROM STUDENT");
////			
////			ResultSetMetaData rsmd = res.getMetaData();
////			
////			for(int i=1; i<=rsmd.getColumnCount(); i++) {
////				System.out.println(rsmd.getColumnName(i));
////				System.out.println(rsmd.getColumnTypeName(i));
////			}
////			pstmt = con.prepareStatement("SELECT * FROM STUDENT WHERE ID=?");
////			Scanner scan = new Scanner(System.in);
////			System.out.println("Enter the ID of the student: ");
////			int temp = scan.nextInt();
////			pstmt.setInt(1, temp);
////			res = pstmt.executeQuery();
////			while(res.next()) {
////				int id = res.getInt(1);
////				String name = res.getString(2);
////				int marks1 = res.getInt(3);
////				int marks2 = res.getInt(4);
////				int marks3 = res.getInt(5);
////				
////				System.out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3+" ");
////			}
////			Scanner scan = new Scanner(System.in);
////			System.out.println("Enter the number of rows to be updated: ");
////			int rows = scan.nextInt();
////			for(int i=0; i<rows; i++) {
////				pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=? WHERE ID=?");
////				System.out.println("Enter the marks to be updated: ");
////				int temp1 = scan.nextInt();
////				System.out.println("Enter the ID: ");
////				int temp2 = scan.nextInt();
////				pstmt.setInt(1, temp1);
////				pstmt.setInt(2, temp2);
////				int rowsUpdated = pstmt.executeUpdate();
////				System.out.println(rowsUpdated);
////			}
////			con.commit();
//			pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=10 WHERE ID=1");
//			pstmt.addBatch();
//			pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=20 WHERE ID=2");
//			pstmt.addBatch();
//			pstmt = con.prepareStatement("UPDATE STUDENT SET MARKS1=30 WHERE ID=3");
//			pstmt.addBatch();
//			pstmt.executeBatch();
////			con.commit();
////			pstmt = con.prepareStatement("DELETE FROM STUDENT WHERE ID=?");
////			Scanner scan = new Scanner(System.in);
////			System.out.println("Enter the ID to be deleted: ");
////			int tempD = scan.nextInt();
////			pstmt.setInt(1, tempD);
////			
////			int rowsUpdated = pstmt.executeUpdate();
////			System.out.println(rowsUpdated);
//			
////			pstmt = con.prepareStatement("INSERT INTO STUDENT VALUES(?, ?, ?, ?, ?)");
////			Scanner scan = new Scanner(System.in);
////			System.out.println("Enter the ID to be inserted: ");
////			int id = scan.nextInt();
////			pstmt.setInt(1, id);
////			System.out.println("Enter the Name to be inserted: ");
////			String name = scan.next();
////			pstmt.setString(2, name);
////			System.out.println("Enter the Marks1 to be inserted: ");
////			int m1 = scan.nextInt();
////			pstmt.setInt(3, m1);
////			System.out.println("Enter the Marks2 to be inserted: ");
////			int m2 = scan.nextInt();
////			pstmt.setInt(4, m2);
////			System.out.println("Enter the Marks3 to be inserted: ");
////			int m3 = scan.nextInt();
////			pstmt.setInt(5, m3);
////			
////			int rowsUpdated = pstmt.executeUpdate();
////			System.out.println(rowsUpdated);
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

}
