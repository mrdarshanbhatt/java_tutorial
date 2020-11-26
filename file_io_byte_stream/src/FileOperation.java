

import java.io.File;

public class FileOperation {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {

		File f = new File("G:\\mydir\\name\\name1\\name2\\file.txt");

		f.createNewFile();

		File d = new File("G:/mydir");
		d.mkdir();

		// Create Directory
		File f1 = new File(d, "1.txt");
		f1.createNewFile();

		System.out.println(f.canRead()); // true

		System.out.println(f.canWrite()); // true

		System.out.println(f.canExecute()); // true

		System.out.println("absolute path :" + f.getAbsolutePath()); // Absolute Path

		System.out.println("canonical path :" + f.getCanonicalPath()); // Canonical Path

		System.out.println(f.getPath()); // File Path

		System.out.println(f.getParent()); // Parent Directory Path

		System.out.println(f.getTotalSpace()); // Return Free Space in Long

		System.out.println(f.isFile()); // true

		System.out.println(f.isDirectory()); // false

		System.out.println(d.isDirectory()); // true

		// List of Roots
		File[] roots = f.listRoots();
		for (File file : roots) {
			System.out.println("Disk : " + file);
		}

		// List of File from Specific Directory
		File[] files = d.listFiles();
		for (File file : files) {
			System.out.println("Disk : " + file);
		}

	}

}
