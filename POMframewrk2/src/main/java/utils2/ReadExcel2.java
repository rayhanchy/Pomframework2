package utils2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	
	public String[][] readexcel (String excelfile) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data2/"+excelfile+".xlsx");
		
		// Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		// Row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Column Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data =new String[rowCount][columnCount];
				
		//open "for loop" for rows
		for (int i = 1; i <= rowCount; i++) {
			// Row
			XSSFRow row = sheet.getRow(i);
			
			//open "for loop" for  columns
			for (int j = 0; j < columnCount; j++) {
				//Column
				XSSFCell cell = row.getCell(j);
				
				//Action -> Read Value
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			
			} //Ends column for loop
		
		}//Ends row for loop
		
		return data;
		
	}

		
	}


