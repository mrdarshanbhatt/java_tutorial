

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

// Using ByteArray Write Content in multiple Stream/File
public class ByteArrayInputOutput {

	public static void main(String[] args) {

		try {
			// Take 2 Stream
			FileOutputStream outputStream = new FileOutputStream("G:/1.txt");

			FileOutputStream outputStream2 = new FileOutputStream("G:/12.txt");

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			String content = "Write in File";

			// Write in Multiple File
			byteArrayOutputStream.write(content.getBytes());
			byteArrayOutputStream.writeTo(outputStream);
			byteArrayOutputStream.writeTo(outputStream2);

			byteArrayOutputStream.close();

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(content.getBytes());

			int readStatus = 0;

			// Read From Multiple File
			while ((readStatus = byteArrayInputStream.read()) != -1) {

				System.out.print((char) readStatus);

			}

			byteArrayInputStream.close();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
