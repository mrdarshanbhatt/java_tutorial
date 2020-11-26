

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

// Character Array ReadWrite In Multiple file Using one Character Stream
public class CharArrayReadWrite {

	public static void main(String[] args) {

		try {
			
			FileWriter writer = new FileWriter("G:/1.txt");
			writer.write("by Using 1st Character Array Writter.");
			// If writer close here then Occurs Exception Stream Close...

			FileWriter writer1 = new FileWriter("G:/12.txt");
			writer1.write("by Using 2nd Character Array Writter.");

			// Write in Both File At a Time
			CharArrayWriter charArrayWriter = new CharArrayWriter();
			charArrayWriter.writeTo(writer);
			charArrayWriter.writeTo(writer1);

			// Close All Stream
			writer.close();
			writer1.close();
			charArrayWriter.close();

			// Now, Read using CharArrayreader
			char[] content = "Data read Using Character Array Rader".toCharArray();

			CharArrayReader charArrayReader = new CharArrayReader(content);

			// Read Using this Status
			int readStatus = 1;

			while ((readStatus = charArrayReader.read()) != -1) {

				System.out.print((char) readStatus);

			}

			charArrayReader.close();

		} catch (IOException e) {

		}

	}

}
