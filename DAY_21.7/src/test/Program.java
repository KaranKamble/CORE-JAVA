package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pojo.Book;
import utils.DBUtil;

public class Program {
	
	public static void main(String[] args) {

		try (Connection connection = DBUtil.getConnection(); 
			Statement statement = connection.createStatement()) {
			String sql = "select * from books";
			try (ResultSet rs = statement.executeQuery(sql);) {
			//	List<Book> bookList = new ArrayList<>();
				while (rs.next()) {
					Book book = new Book(rs.getInt("book_id"),rs.getString("subject_name"),rs.getString("book_name"),rs.getString("author_name"),rs.getFloat("price"));
					System.out.println(book.toString());
			//		bookList.add(book);
				}
			//		bookList.forEach(System.out::println);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
