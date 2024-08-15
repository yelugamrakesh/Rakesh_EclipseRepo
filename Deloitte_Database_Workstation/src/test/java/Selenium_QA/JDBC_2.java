package Selenium_QA;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_2 {

	Connection con=null;
	
	public Connection getCon() throws Exception
	{
		Class.forName("com.googlecode.sqlsheet.Driver");
		con=DriverManager.getConnection("jdbc:xlsx:file:.//Users/yelugamrakesh/Documents/Documents - Yelugam_Rakesh/Deloitte_Database_Workstation/ExcelFiles/Book.xlsx");
		return con;
	}	
	
	public void closeCon()throws Exception
	{
		con.close();
	}

}
