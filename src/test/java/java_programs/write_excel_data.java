package java_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_excel_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Syam\\git\\selenium\\test\\selenium\\src\\main\\resources\\exceldata\\writexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("mahesh");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("maheshrudraraju");
		wb.write(fos);
		wb.close();
		fos.close();
		
		System.out.println("successfully written");
		
		
		
	}

}
