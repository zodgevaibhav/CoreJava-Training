package javaadv.jdbclearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertUpdateDeleteStatement {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/advancedjava";
		
		String userName = "root";
		String password = "root";
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		Statement stmt = conn.createStatement();
		
		String query = "update users set first_name = 'Vaibhav' where first_name = 'admin'";
		
		int countOfRowUpdated = stmt.executeUpdate(query);		
		System.out.println(countOfRowUpdated+" row updated...");
		
		countOfRowUpdated = stmt.executeUpdate("insert into users values ('swara','swara','swara','swara')");		
		System.out.println(countOfRowUpdated+" row inserted...");
		
		countOfRowUpdated = stmt.executeUpdate("delete from users where first_name = 'swara'");		
		System.out.println(countOfRowUpdated+" row deleted...");
		
		countOfRowUpdated = stmt.executeUpdate("update users set first_name = 'admin' where first_name = 'Vaibhav'");		
		System.out.println(countOfRowUpdated+" row updated...");
		
		stmt.close();
		conn.close();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
