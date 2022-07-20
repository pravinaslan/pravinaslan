package com.pract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Pravin R\\eclipse-workspace\\Practise\\data\\testexcel.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook work=new XSSFWorkbook(stream);
		Sheet sheet = work.getSheet("practise");
		
		Row row = sheet.getRow(1);
		for (int i = 0; i <row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			CellType type = cell.getCellType();
			
			switch (type) {
			case STRING:
				String value = cell.getStringCellValue();
				System.out.println(value);
				
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)){
					Date dateCellValue = cell.getDateCellValue();
					String text=new SimpleDateFormat("dd/MM/yyyy").format(dateCellValue);
					
					
				}
				else {
					double cellValue = cell.getNumericCellValue();
					String s = BigDecimal.valueOf(cellValue).toString();
					System.out.println(s);
					
				}
			

			default:
				break;
			}
			
		}
		
		
	}

	
}
