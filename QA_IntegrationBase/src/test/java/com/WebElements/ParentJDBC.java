package com.WebElements;

import java.sql.Connection;
import java.sql.Statement;

public class ParentJDBC extends JDBC_2 {

	
	
	public void insetdata() throws Exception
	{
		Connection con=getCon();
		Statement stm =con.createStatement();
		stm.executeUpdate("inset into sheet1 (username,password) values('rakesh','yelugam')");
		con.commit();
		con.close();
	}
	
	
	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub

		ParentJDBC i=new ParentJDBC();
		i.insetdata();
		
		
		
	}

}
