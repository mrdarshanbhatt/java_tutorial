

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstClient {

	public static void main(String[] args) {

		try {

			// create Server Socket ...
			ServerSocket serverSocket = new ServerSocket(8003);

			// Establish Connection...
			Socket socket = serverSocket.accept();

			// For Read The Data from Socket...
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

			// For Write the Data in Socket...
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

			// Read Value from the user...
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String sendingMsg = "", receiveMsg = "";

			// if Message is By then Chat is terminate
			while (!sendingMsg.equals("by")) {

				receiveMsg = dataInputStream.readUTF();

				System.out.println("Msg Sent By Client : " + receiveMsg);

				sendingMsg = bufferedReader.readLine();

				dataOutputStream.writeUTF(sendingMsg);

				dataOutputStream.flush();

			}

			// Must Close all the Socket and Stream for Security Purpose...
			socket.close();
			serverSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
			bufferedReader.close();

		} catch (Exception e) {

		}

	}

}
