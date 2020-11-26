

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputStream {

	static String message = null;

	public static void main(String[] args) {

		try {

			// Write the Data in File
			FileOutputStream outputStream = new FileOutputStream(new File("G:/myfile.txt"));

			String content = "Write In the File";

			outputStream.write(content.getBytes());

			outputStream.close();

			// Read the Data in File
			FileInputStream inputStream = new FileInputStream(new File("G:/myfile.txt"));

			int readStatus = 1;

			while ((readStatus = inputStream.read()) != -1) {

				System.out.print((char) readStatus);

			}

			inputStream.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
