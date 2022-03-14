package jcm.examples.socket.ex03ClientServerCient;
import java.io.BufferedReader;
/***
 * ---[Socket Connection - Client Side]---
 * ---[Socket Connection - two way (Client to Server -and- Server to Client) ]---
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;


public class Client {

	private String hostName = "localhost";
	private int portNumber = 4999;
	private ArrayList<String> output = new ArrayList<String>();
	private String stFileName = "txt-client.txt";
	
//	private String output = "";
	
	public Client() throws IOException {
//		System.out.println("Client Side Socket");
		
		output.add("Client Side Socket");
		
		// connect to server
		Socket socket = new Socket(hostName, portNumber);

///---(1)---[send object/data from client -to- server]-----///
		
		// object formatted text stream ("hello") from client to server
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		
		// send data/text ("hello") from client to server
		printWriter.println("is it working ?");
		
		output.add("....is it working ?");
		// flush the stream (from client to server).
		printWriter.flush();
		
///---(/1)-------------------------------------------------///

//		System.out.println("i !!!");
		
///---(2)---[receive/read object/data from server -to- client]-----///

		// Socket - Stream read
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		
		// Socket - Stream read - Buffer read
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		// read line of user input
		String stUserInput = bufferedReader.readLine();
		
		// print user input
//		System.out.println("server say: " + stUserInput);
		output.add("....server say: " + stUserInput);
		
///---(/2)---------------------------------------------------------///
		
//		System.out.println(output);

		// 1 // write to file.
//		SocketOutput socketOutput = new SocketOutput();
//		socketOutput.writeToFile("txt-client.txt", output.toString());
		
		// 2 // write to file.
		SocketOutput socketOutput = new SocketOutput(stFileName, output.toString());
	}
 
	public static void main(String[] args) throws IOException {

		Client client = new Client();

	}
}
