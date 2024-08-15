package JDBC;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_From_Excel {



	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Inserted Data 1");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Inserted secound set");

		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("Inserted secound set");

		
		sheet.getRow(1).createCell(5).setCellValue("Inserted secound set");
		File fileinstance = new File("./ExcelFiles/JDBC_1.xlsx");

		FileOutputStream fs = new FileOutputStream(fileinstance);
		workbook.write(fs);
		workbook.close();
	}

}
