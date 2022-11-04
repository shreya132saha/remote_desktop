package java_io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			File file = new File("src/java_io/acc.txt");

			
			if (file.createNewFile()) {
				System.out.println("file exists");

			} else {
				System.out.println("file not exists");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
