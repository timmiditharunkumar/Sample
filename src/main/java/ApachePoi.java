import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\tarun\\Documents\\Sample.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
//		String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellValue);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			int colCount = row.getPhysicalNumberOfCells();
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell);
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
