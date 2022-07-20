package com.pract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class UpdateValueInCell {
	public static void main(String[] args) throws IOException {
		

		File file=new File("C:\\Users\\Pravin R\\eclipse-workspace\\Practise\\data\\testexcel.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook work=new XSSFWorkbook(stream);
		Sheet sheet = work.getSheet("practise");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		if (cellValue.equals("pravin")) {
			cell.setCellValue("java");
			
		}
		FileOutputStream out=new FileOutputStream(file);
		work.write(out);
		
		
	}
	
	

}
