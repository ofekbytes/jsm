package jcm.examples.socket.ex03ClientServerCient;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SocketOutput {

	/****
	 * getCurrentDateAndTime() - get Current Date And Time
	 * @return - Current Date And Time
	 */
	private static String getCurrentDateAndTime() {
		String stDateAndTime = "";
		
		//LocalDateTime myObj = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		stDateAndTime = localDate.toString() 
						+ " -- " 
						+ localTime.toString()
						+ "\r\n";
		
		return stDateAndTime;
	}
	
	
	/***
	 * writeToFile() - write To File	
	 * @param stFileName - file name.
	 * @param stOutput - output String Data.
	 */
	public static void writeToFile(String stFileName, String stOutput) {
		
	    try {
		      FileWriter myWriter = new FileWriter(stFileName); 
		      myWriter.write(getCurrentDateAndTime()); // add date + time
		      myWriter.write(stOutput); // add Data
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }		
	}
	
	
	// constructor //
	public SocketOutput() {	}

	
	// constructor //
	public SocketOutput(String stFileName, String stOutput) {
		
		System.out.println("write a file:: " + stFileName);
		writeToFile (stFileName, stOutput);
	}

}


/***
 * note: 
 * code path: /home/jron/git-ofekbytes/jcm/com.mydomain.jcm/src/jcm/examples/socket/ex03ClientServerCient/SocketOutput.java
 * file path: /home/jron/git-ofekbytes/jcm/com.mydomain.jcm/txt-client.txt 
 */

