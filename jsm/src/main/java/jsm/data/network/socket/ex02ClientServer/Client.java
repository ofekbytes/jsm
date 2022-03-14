package jcm.examples.socket.ex02ClientServer;
/***
 * ---[Socket Connection - Client Side]---
 * ---[Socket Connection - one way (Client to Server) ]---
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private String hostName = "localhost";
	private int portNumber = 4999;

	public Client() throws IOException {
		System.out.println("Client Side Socket");
		
		// connect to server
		Socket socket = new Socket(hostName, portNumber);
		
		// object formatted text stream ("hello") from client to server
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		
		// send data/text ("hello") from client to server
		printWriter.println("hello");
		
		// flush the stream (from client to server).
		printWriter.flush();
		
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
