

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AServer {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.out.println("Server Side : ");

		// Create Socket at Server Side..
		ServerSocket serverSocket = new ServerSocket(8003);

		// Accept the Socket and It's Data
		Socket socket = serverSocket.accept();

		// You can Use any Type of Input Stream here for Read Data
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

		// Store Receive Data
		String receiveData = dataInputStream.readLine();

		System.out.println(receiveData);

		// Close all Socket and Stream
		serverSocket.close();
		socket.close();

	}

}
