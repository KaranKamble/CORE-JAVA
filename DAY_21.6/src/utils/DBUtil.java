package utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import test.Program;

public class DBUtil {
	private static Properties p;
	static {
		try {
		p=new Properties();
		InputStream inputstream = Program.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(inputstream);
		Class.forName(p.getProperty("DRIVER")); // JDK 1.8 AND ONWARDS forName is optional
		}catch (Exception cause) {
			throw new RuntimeException(cause);
		}
	}
	
	
	public static Connection getConnection()throws Exception {
		return DriverManager.getConnection(p.getProperty("URL"),p.getProperty("USER"),p.getProperty("PASSWORD"));
	
	}
}
