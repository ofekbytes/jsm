package jcm.examples.socket.ex01ClientServer;
/***
 * ---[Socket Connection - Client Side]---
 * ---[Socket Connection]---
 */
import java.io.IOException;
import java.net.Socket;

public class Client {

	private String hostName = "localhost";
	private int portNumber = 4999;

	public Client() throws IOException {
		System.out.println("Client Side Socket");
		
		// connect to server
		Socket socket = new Socket(hostName, portNumber);

	}

	public static void main(String[] args) {

		try {
			Client client = new Client();
		} catch (IOException e) {
			System.out.println("Clientmain()");
			e.printStackTrace();
		}

	}

}
