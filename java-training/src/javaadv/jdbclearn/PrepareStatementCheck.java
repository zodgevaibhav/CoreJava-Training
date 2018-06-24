package javaadv.jdbclearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareStatementCheck {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/advancedjava";
		String userName = "root";
		String password= "root";
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		String query="select * from users where user_id = ?";
		 
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, "admin");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		
		stmt.close();
		rs.close();
		conn.close();
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
