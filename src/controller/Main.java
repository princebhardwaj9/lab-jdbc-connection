package controller;

import java.io.IOException;
/*
1.Create a class called as `Main` with main method inside the controller package.
2.Create an object for the Connection { java.sql.Connection }.
3.Call the getConnection() method in the ConnectionManager and store the return value in the Connection object.
4.Display "Connection established" if the connection is not equal to null else display "Check your connection".

*/
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		
	// Fill your code
		Connection con=ConnectionManager.getConnection();
		if(con!=null)
			System.out.println("Connection established");
		else
			System.out.println("Check your connection");
	}
}
