package test;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	private static void printFileInfo(File file) {
		System.out.println("Name 		  : " + file.getName());
		System.out.println("Parent		  : " + file.getParent());
		System.out.println("Lenght		  : " + file.length());
		System.out.println("Last Modified : " + new SimpleDateFormat("dd-MM-yy").format(new Date(file.lastModified())));

	}

	private static void printDirectoryInfo(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (!f.isHidden())
				System.out.println(f.getName());
		}
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("F.Q Name : ");
			String pathName = sc.nextLine();

			File file = new File(pathName);
			if (file.exists()) {
				if (file.isDirectory())
					Program.printDirectoryInfo(file);
				else
					Program.printFileInfo(file);
			} else {
				System.out.println(pathName + " does not exists ");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
