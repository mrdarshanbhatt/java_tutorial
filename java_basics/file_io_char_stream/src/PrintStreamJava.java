

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

// It Use for Write the Data not for Read the Data....
public class PrintStreamJava {

	public static void main(String[] args) {

		try {
			// File Choose for Write the Data...
			FileOutputStream outputStream = new FileOutputStream("G:/1.txt");

			// Print Stream take Reference of any type of OutputStream
			PrintStream printStream = new PrintStream(outputStream);

			// Many Data type Available for Write the Data, but here Use Object...
			printStream.print("Write Using Print Stream Class");

			// We can Edit the Data Using Append
			printStream.append(" in java 8.");

			printStream.close();

		} catch (FileNotFoundException e) {

		}

	}

}
// Print Stream is Auto Flush and No Throw the IOException
