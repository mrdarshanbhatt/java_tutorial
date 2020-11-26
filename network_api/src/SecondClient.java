

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SecondClient {

	public static void main(String[] args) {

		try {

			// Create Socket...
			Socket socket = new Socket("127.0.0.1", 8003);

			// For Write the Data in Socket...
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

			// For Read the Data from Socket...
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

			// Read the Data from User...
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String sendingMsg = "", receiveMsg = "";

			// if message is Equal to By then Chat Terminate...
			while (!sendingMsg.equals("By")) {

				sendingMsg = bufferedReader.readLine();

				dataOutputStream.writeUTF(sendingMsg);

				receiveMsg = dataInputStream.readUTF();

				System.out.println("Msg Sent by Server : " + receiveMsg);

				dataOutputStream.flush();

			}
			dataOutputStream.close();
			dataInputStream.close();
			bufferedReader.close();
			socket.close();

		} catch (Exception e) {

		}

	}

}
