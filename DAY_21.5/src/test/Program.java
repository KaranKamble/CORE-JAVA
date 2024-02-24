package test;

import java.sql.*;

import utils.DBUtil;

public class Program {
	public static void main(String[] args) {

		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement()) {
			String sql = "select * from books";
			try (ResultSet rs = statement.executeQuery(sql);) {

				while (rs.next()) {
					int bookId = rs.getInt(1);
				//	int bookId = rs.getInt("book_id");
					
					String subjectName = rs.getString(2);
				//	String subjectName = rs.getString("subject_name");
					
					String bookName = rs.getString(3);
				//	String bookName = rs.getString("book_name");
					
					String authorName = rs.getString(4);
				//	String authorName = rs.getString("author_name");
					
					float price = rs.getFloat(5);
					//float price = rs.getFloat("price");
					

					System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);
					
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
