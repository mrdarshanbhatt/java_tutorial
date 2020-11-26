

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutput {

	// Buffered Input Stream Internally use Buffer for Store Data 
	// Make Fast Performance
	public static void main(String[] args) {

		try {

			// Write Using Buffered Stream
			FileOutputStream outputStream = new FileOutputStream("G:/myfile.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
			String content = "Write in File";

			bufferedOutputStream.write(content.getBytes());
			bufferedOutputStream.close();
			outputStream.close();

			// Read Using Buffered Stream
			FileInputStream inputStream = new FileInputStream("G:/myfile.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

			int readStatus = 1;
			while ((readStatus = bufferedInputStream.read()) != -1) {

				System.out.print((char) readStatus);

			}

			inputStream.close();
			bufferedInputStream.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
