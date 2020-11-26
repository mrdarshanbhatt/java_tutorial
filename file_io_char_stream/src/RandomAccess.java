

import java.io.IOException;
import java.io.RandomAccessFile;

// In Random Access file RW(Read-Write) Both operation Perform using RandomAccessFile Class
// Also called Long Array of Bytes
public class RandomAccess {

	public static void main(String[] args) throws IOException {

		// RW (Read-Write Mode)
		RandomAccessFile randomAccessFile = new RandomAccessFile("G:/1.txt", "rw");

		// Start Writing index
		randomAccessFile.seek(10);

		randomAccessFile.writeBytes("Write using ");

		randomAccessFile.writeBytes("RandomAccessFile.");

		// First at Seek from 0 to 10 index then Reading
		randomAccessFile.seek(10);

		System.out.println(randomAccessFile.readLine());

		randomAccessFile.close();

	}

}
