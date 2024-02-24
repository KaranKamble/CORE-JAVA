package test;

import java.sql.*;
import utils.DBUtil;

public class Program {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
			connection = DBUtil.getConnection();
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
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
