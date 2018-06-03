package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect
{
	public static Connection m1() throws ClassNotFoundException, SQLException
	{
		

Class.forName("oracle.jdbc.driver.OracleDriver");  

//step2 create  the connection object  
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  

	return conn;	
	}

}
