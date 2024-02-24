package test;

import java.io.File;
import java.io.IOException;

public class Program {

	public static void main4(String[] args) {
		File file = new File("Sunbeam");
		file.delete();
	}

	public static void main3(String[] args) {
		File file = new File("Sunbeam");
		file.mkdir();
	}

	public static void main2(String[] args) {
		File file = new File("File.text");
		file.delete();
	}

	public static void main(String[] args) {
		
		try {
			File file = new File("File.text");
			file.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
