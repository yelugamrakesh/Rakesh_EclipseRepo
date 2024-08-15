package JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Extraction {

	public static void main(String[] args) throws Exception {

		// Properties
		Properties Properties_Class = new Properties();
		FileInputStream File_Location = new FileInputStream("./PropertiesFiles/Config.properties");
		Properties_Class.load(File_Location);

		// Workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		// Row_1
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Rahul Sipligunz");

		// Row_15
		sheet.createRow(15);
		sheet.getRow(15).createCell(1).setCellValue("Warangal Herosssss1");

		//sheet.createRow(15);

		sheet.getRow(15).createCell(3).setCellValue("Warangal Heros1");

		File fileinstance = new File("./ExcelFiles/JDBC_1.xlsx");
		FileOutputStream fs = new FileOutputStream(fileinstance);
		workbook.write(fs);
		workbook.close();

	}

}