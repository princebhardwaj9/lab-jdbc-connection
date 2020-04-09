package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Properties;


/*
Create a class called as `ConnectionManager` inside the utility package.
2.Create a method public static Connection getConnection() which returns a connection object. 
3.Use the method public static Properties loadPropertiesFile() to load the jdbc properties from the jdbc.properties file.

*/

public class ConnectionManager {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		Properties pc=loadPropertiesFile();
	    Class.forName(pc.getProperty("driver"));
		Connection con = null;
		con = DriverManager.getConnection(pc.getProperty("url"),pc.getProperty("username"),pc.getProperty("password"));
	    
		if(con!=null)
			return con;
		else
			return null;
		
	}
	
	public static Properties loadPropertiesFile() throws IOException {
		
		Properties p=new Properties();
		InputStream in=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	    p.load(in);
	    in.close();
		return p;
		
	}
	
}
