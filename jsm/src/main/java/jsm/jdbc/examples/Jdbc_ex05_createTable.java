package jsm.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_ex05_createTable {

	private String dbUrl = "jdbc:mysql://localhost/test1";
	
	private String user = "dbadmin";
	private String password = "2Wsxcde3";
	private String stQuery = "select * from customer";
	
	// TODO create table + permission for dbadmin;
	
	public Jdbc_ex05_createTable() {
		try {

			Connection myConnection = DriverManager.getConnection(dbUrl, user, password);
			Statement myStatement = myConnection.createStatement();
			ResultSet myResultSet = myStatement.executeQuery(stQuery);			
			System.out.println("");

			
			
			
			// ResultSet - close //
			myResultSet.close();

			// Statement close//
			myStatement.close();

			// Connection close//
			myConnection.close();

		}
		// import java.sql.SQLException; //
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/****
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Jdbc_ex06_ps p = new Jdbc_ex06_ps();
	}

}
