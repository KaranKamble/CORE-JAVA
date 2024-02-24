package test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

import utils.DBUtil;

public class Program {
	public static void main4(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
				Statement statement = connection.createStatement()) {
				String sql = "update books set price=574.50 where book_id=1025";
				int count = statement.executeUpdate(sql);
				System.out.println(count+" row(s) updated");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	
	
	public static void main3(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
				Statement statement = connection.createStatement()) {
				String sql = "insert into books(book_id,subject_name,book_name,author_name,price)values(1025,'OS','Operating System Concept','Galvin',575);";
				int count = statement.executeUpdate(sql);
				System.out.println(count+" row(s) updated");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	
	
	
	public static void main2(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
				Statement statement = connection.createStatement()) {
				String sql = "delete from books where book_id = 1025";
				int count = statement.executeUpdate(sql);
				System.out.println(count+"  row(s) updated");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	
	
	
	
	public static void main1(String[] args) {

		try (Connection connection = DBUtil.getConnection(); 
			Statement statement = connection.createStatement()) {
			String sql = "select * from books";
			try (ResultSet rs = statement.executeQuery(sql);) {

				while (rs.next()) 
					Program.processRow( rs );
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void processRow(ResultSet rs) throws Exception {
			int bookId = rs.getInt("book_id");
			String subjectName = rs.getString("subject_name");
			String bookName = rs.getString("book_name");
			String authorName = rs.getString("author_name");
			float price = rs.getFloat("price");
			System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);
			
	}

}
