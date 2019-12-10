package hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//register a driver//class.forname() method
		Connection con=null;//connection object
		//2)create a connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
		//(object=class jdbc-API,mysql-database,localhost-server,3306-portNumber,connection db name,root username,""pw)
		if(con!=null)//connection checking
		{
			return con;
		}
		else
			return null;
		//5)connection close
		
	}

}
