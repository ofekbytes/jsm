package jcm.examples.socket.ex01ClientServer;
/***
 * ---[Socket Connection - Server Side]---
 * ---[Socket Connection]---
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private String hostName = "localhost";
	private int portNumber = 4999;

	public Server() throws IOException {
		System.out.println("Server Side Socket");
		
		//socket server side
		ServerSocket serverSocket = new ServerSocket(portNumber);
		
		// wait for client
		Socket socket = serverSocket.accept();

		// print when client access server
		System.out.println("Client Connect");
	}

	public static void main(String[] args) {

		try {
			Server server = new Server();
		} catch (IOException e) {
			System.out.println("Server.main()");
			e.printStackTrace();
		}
	}

}
