package test;

import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Program {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
			Properties p = new Properties();
			InputStream inputstream = Program.class.getClassLoader().getResourceAsStream("config.properties");
			p.load(inputstream);
			
			
			
			Class.forName(p.getProperty("DRIVER")); // JDK 1.8 AND ONWARDS forName is optional

			connection = DriverManager.getConnection(p.getProperty("URL"),p.getProperty("USER"),p.getProperty("PASSWORD"));

			statement = connection.createStatement();

			String sql = "select * from books";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");

				System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);
				
			}
			rs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
