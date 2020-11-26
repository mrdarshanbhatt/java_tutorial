

import java.io.IOException;
import java.io.StringWriter;

//No need to close the StringWriter and StringReader Class
public class StringReaderWriter {

	public static void main(String[] args) {

		try {

			// Below Both Case are Also called as..
			// Also We can say that , Java String convert to String buffer

			// Data in String..
			String content = "String In ";

			StringWriter stringWriter = new StringWriter();
			stringWriter.write(content);
			System.out.println(stringWriter.append("Java"));

			// Data in Character Array
			char[] charContent = "String in ".toCharArray();

			StringWriter stringWriter2 = new StringWriter();
			stringWriter2.write(charContent);
			System.out.println(stringWriter2.append("Python"));

			// String Buffer to Java String
			System.out.println("Java String : " + stringWriter.toString());
			System.out.println("Java String 2 : " + stringWriter2.toString());

		} catch (IOException e) {

		}

	}

}
