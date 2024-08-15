package com.inetbanking.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig()   {

		
		File src = new File("./Configurations/ReadConfig.properties");
		try {
			FileInputStream fs = new FileInputStream(src);
			pro = new Properties();
			pro.load(fs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String Uname=pro.getProperty("username");
		return Uname;
	}

	public String getPwd()
	{
		String pwd=pro.getProperty("password");
		return pwd;	
	}
}
