

import java.io.FileReader;
import java.io.FileWriter;

// File Reader And Writer take Data As a Character Stream
public class ReaderWriter {

	public static void main(String[] args) {
		try {

			// Write Using Character Stream...
			FileWriter writer = new FileWriter("G:/1.txt");

			writer.write("Write Content in 1.txt");

			writer.close();

			// Read Using Character Stream...
			FileReader reader = new FileReader("G:/1.txt");

			int readStatus = 1;

			while ((readStatus = reader.read()) != -1) {

				System.out.print((char) readStatus);

			}

			reader.close();

		} catch (Exception e) {

		}

	}

}
