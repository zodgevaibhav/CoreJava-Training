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
			

			//********************** Register driver with DriverManager ******************
			Class.forName("com.mysql.jdbc.Driver");
			
			//System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
			
			// java -Djdbc.drivers=com.mysql.jdbc.Driver <<<ClassFileName>>>
			
			//*******************************************************************************
			
			
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		Statement stmt = conn.createStatement();
		
		String query = "update users set first_name = 'Vaibhav' where first_name = 'admin'";
		
		//************** One connection can use to execute multiple statements
		int countOfRowUpdated = stmt.executeUpdate(query);		  
		System.out.println(countOfRowUpdated+" row updated...");
		
		countOfRowUpdated = stmt.executeUpdate("insert into users values ('swara','swara','swara','swara')");		
		System.out.println(countOfRowUpdated+" row inserted...");
		
		countOfRowUpdated = stmt.executeUpdate("delete from users where first_name = 'swara'");		
		System.out.println(countOfRowUpdated+" row deleted...");
		
		countOfRowUpdated = stmt.executeUpdate("update users set first_name = 'admin' where first_name = 'Vaibhav'");		
		System.out.println(countOfRowUpdated+" row updated...");
		
		System.out.println("**** Previously updated record counts are "+stmt.getUpdateCount());
		System.out.println("**** Is statement closed -  "+stmt.isClosed());

		
		stmt.close();
		conn.close();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
