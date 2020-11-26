

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterJava {

	// PrintWriter Using Formatted Representation...
	public static void main(String[] args) {

		try {
			FileOutputStream outputStream = new FileOutputStream("G:/1.txt");

			PrintWriter writer = new PrintWriter(outputStream);

			writer.write("Write Using Print Writer Class..");

			char[] dataInCharArray = "Data in Character Array...".toCharArray();

			writer.write(dataInCharArray);

			// Many Data type Available for Write the Data, but here Use Object...
			writer.print(" Write Using Print Method");

			// Many Data type Available for Write the Data, but here Use Object...
			writer.println("Write Using printLn Method");

			writer.close();

		} catch (FileNotFoundException e) {

		}

	}

}
