package jsm.data.network.socket.ex03ClientServerCient;

/***
 * ---[Socket Connection - Server Side]---
 * ---[Socket Connection - two way (Client to Server -and- Server to Client) ]---
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	
	private int portNumber = 4999;
	private ArrayList<String> output = new ArrayList<String>();
	private String stFileName = "txt-server.txt";
	
	/***
	 * 
	 * @throws IOException
	 */
	public Server() throws IOException {
//		System.out.println("Server Side Socket");
		output.add("1. Server Side Socket");
		//socket server side
		ServerSocket serverSocket = new ServerSocket(portNumber);
		
		// wait for client
		Socket socket = serverSocket.accept();

		// print when client access server
//		System.out.println("Client Connect");
		output.add("2. Client Connect.");
///---(1)---[receive/read object/data from client -to- server]-----///
		
		// Socket - Stream read
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		
		// Socket - Stream read - Buffer read
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		// read line of user input
		String stUserInput = bufferedReader.readLine();
		
		// print user input
//		System.out.println("user say: " + stUserInput);
		output.add("3. user say: " + stUserInput);
		
///---(/1)---------------------------------------------------------///
		
		
		
///---(2)---[send object/data from server -to- client]-----///

		// object formatted text stream ("hello") from server to client
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		
		// send data/text ("hello") from server to client
		printWriter.println("yes its working.");
		output.add("4. yes its working");

		// flush the stream (from server to client).
		printWriter.flush();
		
		
///---(/2)-------------------------------------------------///

//		System.out.println(output);
		
//		SocketOutput socketOutput = new SocketOutput();
//		socketOutput.writeToFile(stFileName, output.toString());
		
		SocketOutput socketOutput = new SocketOutput(stFileName, output.toString());
	}

	/****
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException  {

		Server server = new Server();
	}

}
