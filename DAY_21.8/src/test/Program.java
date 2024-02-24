package test;

import dao.BookDao;
import pojo.Book;


public class Program {
	//update
	public static void main4(String[] args) {
		try(BookDao dao = new BookDao()){
			dao.update(1025,475);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	//insert
	public static void main3(String[] args) {
		try(BookDao dao = new BookDao()){
			Book book = new Book(1025,"OS","OS Concepts","Galvin",550);
			dao.insert( book );	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	//delete
	public static void main2(String[] args) {
		try(BookDao dao = new BookDao()){
			dao.delete( 6 );
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	//getbooks
	public static void main1(String[] args) {
		try(BookDao dao = new BookDao()){
			dao.getDacBooks().forEach(System.out::println);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	

}
