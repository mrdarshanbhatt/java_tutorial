

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// Replace The File Content using File Reader and Writer
public class FileReaderWriter {
	public static void main(String[] args) throws Exception {

		// Write on file
		FileWriter fW = new FileWriter("G:/1.txt");
		fW.write("word1 is word1");
		fW.close(); // Here, not close then File Operation not Execute

		// Read From File
		FileReader fR = new FileReader("G:/1.txt");
		BufferedReader br = new BufferedReader(fR);

		// File Content Fetch
		String beforeReplace = br.readLine();

		// Replace the Words
		String afterReplace = beforeReplace.replaceAll("word1", "word2");

		System.out.println("original Content :" + beforeReplace);
		System.out.println("Changable Content :" + afterReplace);

		fR.close();

		FileWriter fW1 = new FileWriter("G:/12.txt");
		fW1.write(beforeReplace);

		fW1.close();

	}
}
