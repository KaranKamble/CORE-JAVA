//step 1 : include DB connector into build path

package test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//step 2  : import sql package

public class Program {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/dac_db";
	public static final String USER = "root";
	public static final String PASSWORD = "karan";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
			// step 3 : load and register Driver
			Class.forName(DRIVER);

			// step 4 : Establish connection using users credentials
			connection = DriverManager.getConnection(URL, USER, PASSWORD);

			// step 5 : Create statement/PreparedStatement/CallableStatement
			statement = connection.createStatement();

			// step 6 : Prepare and execute query
			String sql = "select * from books"; // (DQL) executeQuery method for DQL
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
			// step 7 : Close the resourse
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
