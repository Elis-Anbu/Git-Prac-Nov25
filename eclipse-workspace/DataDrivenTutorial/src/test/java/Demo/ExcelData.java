package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public void method1() throws IOException {
     File file=new File("‪C:\\Users\\sam\\Desktop\\fblogin.xlsx");
	 FileInputStream	stream=new FileInputStream(file);
	 XSSFWorkbook xssf =new XSSFWorkbook(stream);
	 XSSFSheet sheet=xssf.getSheet("Sheet1");
	 XSSFRow row=sheet.getRow(0);
	 XSSFCell cell=row.getCell(1);
	 String value= cell.getStringCellValue();
	 //DataFormatter format=new DataFormatter();
	 //String value = format.formatCellValue(cell);
	 System.out.println(value);
	 

		
	}

}
