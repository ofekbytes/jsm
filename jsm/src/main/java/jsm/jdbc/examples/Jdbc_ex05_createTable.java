package jsm.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_ex05_createTable {

	
	private String dbUrl = "jdbc:mysql://localhost/test1";
	private String user = "jron";  //"dbadmin";
	private String password = "koskas@1974.com"; //"2Wsxcde3";
//	private String stQuery = "select * from customer";
	private String stCreate = "CREATE TABLE IF NOT EXISTS `test1`.`employees` (`id` INT(14) NOT NULL AUTO_INCREMENT,`last_name` VARCHAR(45) NOT NULL, `first_name` VARCHAR(45) NOT NULL, `email` VARCHAR(45) NOT NULL,`department` VARCHAR(45) NOT NULL,`salary` DECIMAL(12,2) NOT NULL, PRIMARY KEY (`id`))";
	
	// TODO create table + permission for dbadmin; (create table without pre
	
	public Jdbc_ex05_createTable() {
		try {
			
			Connection myConnection = DriverManager.getConnection(dbUrl, user, password);
			Statement myStatement = myConnection.createStatement();
//			ResultSet myResultSet = myStatement.executeQuery(stQuery);
//			
//			System.out.println("");
//
//			while (myResultSet.next()) {
//
//				// read Data by "column"
//				System.out.print("" + myResultSet.getString("cust_id"));
//				System.out.print(", " + myResultSet.getString("first_name"));
//				System.out.print(", " + myResultSet.getString("last_name"));
//				System.out.print(", " + myResultSet.getString("phone"));
//				System.out.print(", " + myResultSet.getString("email"));				
//				System.out.println("");
//			}
			
			ResultSet myResultSet = myStatement.executeQuery(stCreate);			
			
//			int rowsAffected =  myStatement.executeUpdate(stCreate);
			
//			System.out.println("");
//			System.out.println("rows Affected :: " + rowsAffected);
			System.out.println("create a table complete");

			
			
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
		Jdbc_ex05_createTable p = new Jdbc_ex05_createTable();
	}

}
