package java_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\Syam\\git\\selenium\\test\\selenium\\src\\main\\resources\\exceldata\\excelpract.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
		//Row row = sheet.getRow(0);
		//System.out.println(row.getCell(2));
		
		for(Row row:sheet) {
			
			for(Cell cell : row) {
				
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+" ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
					break;
				default:
					break;
				}
				
			}System.out.println();
		}
	
		wb.close();
		fis.close();
	}

}
