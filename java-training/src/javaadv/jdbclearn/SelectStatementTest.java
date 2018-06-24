package javaadv.jdbclearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatementTest {

	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/advancedjava";
		
		String userName = "root";
		String password = "root";
		
		Connection conn;
		Statement stmt;
		
		try {
			
			//********************** Register driver with DriverManager ******************
			Class.forName("com.mysql.jdbc.Driver");
			
			//System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
			
			// java -Djdbc.drivers=com.mysql.jdbc.Driver <<<ClassFileName>>>
			
			//*******************************************************************************
			
			
			System.out.println("Connection driver ...");
			
			conn = DriverManager.getConnection(dbUrl,userName,password);
			
			System.out.println("Creating statement ...");
			
			stmt = conn.createStatement();
			
			String query = "Select * from users where user_id = 'admin'";
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String userId = rs.getString("user_id");
				
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(userId);
			}
			
			
			
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
