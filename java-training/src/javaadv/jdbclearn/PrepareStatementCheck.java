package javaadv.jdbclearn;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class PrepareStatementCheck {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("src/javaadv/jdbclearn/db.property");
			Properties p = new Properties();
			p.load(fr);

			System.out.println(p.getProperty("url"));

			String url = p.getProperty("url");
			String userName = p.getProperty("userName");
			String password = p.getProperty("password");

			// ********************** Register driver with DriverManager ******************
			Class.forName("com.mysql.jdbc.Driver");

			// System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");

			// java -Djdbc.drivers=com.mysql.jdbc.Driver <<<ClassFileName>>>

			// *******************************************************************************

			Connection conn = DriverManager.getConnection(url, userName, password);

			String query = "select * from users where user_id = ?";

			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, "admin");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			stmt.close();
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
