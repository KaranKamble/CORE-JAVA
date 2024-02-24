package dao;

import java.io.Closeable;
import java.sql.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DBUtil;

public class BookDao implements Closeable{
	private Connection connection;
	private Statement statement;
	
	public BookDao() throws Exception {
		this.connection = DBUtil.getConnection();
		this.statement = this.connection.createStatement();
	}
	
	
	//insert
	public int insert(Book book)throws Exception {
		String sql = "insert into books values("+book.getBookId()+",'"+book.getSubjectName()+"','"+book.getBookName()+"','"+book.getAuthorName()+"',"+book.getPrice()+")";
		return statement.executeUpdate(sql);
		
	}
	
	
	
	
	
	//update
	public int update(int bookId ,float price) throws Exception {
		String sql = "update books set price ='"+price+"' where id = "+bookId+" ";
		return statement.executeUpdate(sql);
	}
	
	
	
	
	//delete
	public int delete(int bookId) throws Exception {
		String sql = "delete from books where id= "+bookId+" ";
		return statement.executeUpdate(sql);
	}
	
	
	
	
	
	//getbooks (all books)
	public List<Book> getDacBooks() throws Exception{
		List<Book> bookList = new ArrayList<>();
		String sql = "select * from books";
		try (ResultSet rs = statement.executeQuery(sql);) {
			
			while (rs.next()) {
				//Book book = new Book(rs.getInt("book_id"),rs.getString("subject_name"),rs.getString("book_name"),rs.getString("author_name"),rs.getFloat("price"));
				//bookList.add(book);
			   bookList.add(new Book(rs.getInt("book_id"),rs.getString("subject_name"),rs.getString("book_name"),rs.getString("author_name"),rs.getFloat("price")));
			}
				bookList.forEach(System.out::println);
		}
		return bookList;
	}
	
	
	
	
	@Override
	public void close() throws IOException {
		try {
			this.statement.close();
			this.connection.close();
		} catch (SQLException cause) {
			throw new IOException(cause);	//Exception chaining
		}
	}
	
	
}
