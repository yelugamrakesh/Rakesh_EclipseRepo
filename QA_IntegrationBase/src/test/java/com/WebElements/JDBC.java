package com.WebElements;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JDBC extends StoreRoom {

	public void insertdata() throws Exception {
		Connection con = getConn();
		Statement stm = con.createStatement();
		stm.executeUpdate("insert into sheet1(username,password) values('Rakesh','Raghu')");
		con.commit();
		Closeconn();
		System.out.println("Inserted");

	}

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		
		sheet.getRow(0).createCell(0).setCellValue("Rakesh");
		sheet.getRow(0).createCell(1).setCellValue("World");
		sheet.getRow(0).createCell(2).setCellValue("World1");
		sheet.getRow(0).createCell(3).setCellValue("World2");
		sheet.getRow(0).createCell(4).setCellValue("World3");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Selenium");
		sheet.getRow(1).createCell(1).setCellValue("Program");

		File file = new File(
				"/Users/yelugamrakesh/Documents/Documents - Yelugam_Rakesh/Deloitte_Database_Workstation/ExcelFiles/Database_excel1.xlsx");

		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();

		

	}

}
