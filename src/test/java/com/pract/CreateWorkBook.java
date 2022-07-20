package com.pract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateWorkBook {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Pravin R\\eclipse-workspace\\Practise\\data\\practisesheet.xlsx");
		
		Workbook work=new XSSFWorkbook();
		Sheet sheet = work.createSheet("data");
		for (int i = 1; i < 10; i++) {
			Row createRow = sheet.createRow(i);
			for (int j = 1; j < 10; j++) {
				Cell createCell = createRow.createCell(j);
				createCell.setCellValue("pravin");
				
				
				
			}
			
		}
//		Row row = sheet.createRow(0);
//		Cell cell = row.createCell(0);
//		cell.setCellValue("java");
	FileOutputStream out=new FileOutputStream(file);
		work.write(out);
		
	}

}
