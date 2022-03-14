package jcm.examples.socket.ex02ClientServer;
/***
 * ---[Socket Connection - Server Side]---
 * ---[Socket Connection - one way (Client to Server) ]---
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		// Socket - Stream read
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		
		// Socket - Stream read - Buffer read
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		// read line of user input
		String stUserInput = bufferedReader.readLine();
		
		// print user input
		System.out.println("user say: " + stUserInput);
	
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

