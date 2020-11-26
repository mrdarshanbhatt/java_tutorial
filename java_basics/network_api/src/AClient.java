

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AClient {
	public static void main(String[] args) {

		try {

			System.out.println("Client Side : ");

			// Create Socket
			Socket socket = new Socket("127.0.0.1", 8003);

			// Write Data in Socket
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

			// Get Data from User
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			// UserMessage convert in Byte Array and Write in Socket
			printWriter.write("Hi! Client, Have a good day.");	

			// Close all Socket and Stream
			printWriter.close();

			bufferedReader.close();

			socket.close();

			printWriter.flush();

		} catch (Exception e) {

		}

	}

}
