

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequInputStream {

	// Read Content from 1 or more file at a time...
	public static void main(String[] args) {

		try {

			FileInputStream inputStream = new FileInputStream("G:/myfile.txt");

			FileInputStream inputStream2 = new FileInputStream("G:/myfile.txt");

			SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream, inputStream2);

			int readStatus = 1;

			while ((readStatus = sequenceInputStream.read()) != -1) {

				System.out.println("\n");

				System.out.print((char) readStatus);

			}

			inputStream.close();
			inputStream2.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
