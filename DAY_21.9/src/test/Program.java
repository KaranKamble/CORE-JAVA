package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import utils.DBUtil;

public class Program {
	public static void main(String[] args) {
		String sql = "insert into books(book_id, subject_name, book_name, author_name, price)values(?,?,?,?,?)";	//Parameterized Query
		try (Connection connection = DBUtil.getConnection(); 
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setInt(1,1025);
			statement.setString(2,"OS");
			statement.setString(3,"OS Concepts");
			statement.setString(4,"Galvin");
			statement.setDouble(5,650);
			
			
			int count = statement.executeUpdate();
			System.out.println(count+" row(s) inserted ");
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
