package practiseeee;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelautomation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Syam\\git\\selenium\\test\\selenium\\src\\test\\resources\\excelauto.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet2");
		int row = s.getLastRowNum();
		System.out.println(row);
		int column = s.getRow(1).getLastCellNum();
		System.out.println(column);
		
		
		
	}

}
