

import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class FileDesceipterJava {

	public static void main(String[] args) {
		try {

			FileOutputStream outputStream = new FileOutputStream("G:/1.txt");

			// When Call getFD then Remove All the Content of File
			FileDescriptor descriptor = outputStream.getFD();

			// Now Write the Content in File
			outputStream.write("Java IO Package".getBytes());

			// sync All Socket and File Content...
			descriptor.sync();

			outputStream.close();
		
		} catch (Exception e) {

		}

	}

}
