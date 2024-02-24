//step 1 : include DB connector into build path

package test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

//step 2  : import sql package

public class Program {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
			// step 3 : load and register Driver
			Driver driver = new com.mysql.cj.jdbc.Driver();// upcasting
			DriverManager.registerDriver(driver);

			// step 4 : Establish connection using users credentials
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "karan");	//localhost or 127.0.0.1

			// step 5 : Create statement/PreparedStatement/CallableStatement
			statement = connection.createStatement();

			// step 6 : Prepare and execute query
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
			// step 7 : Close the resourses
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
