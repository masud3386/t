package com.smart.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSuplier {
	
		
	@DataProvider
	public String [][]logindata() throws Exception{
		
		//public static void main(String[] args)throws Exception {
		// create an instance of excel file using file class of java.io package
		File src = new File("./src/test/resources/New Excel Workbook.xlsx");
		System.out.println(src.exists());
		// convert the excel file into raw data
		
		FileInputStream fis = new FileInputStream(src);
		// create a workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// from workbook find out the sheet
		XSSFSheet sheet =wb.getSheet("Sheet1");
		// count columns in the row
		int rows=sheet.getPhysicalNumberOfRows();
		int columns =sheet.getRow(0).getLastCellNum();
		
		String [][]data = new String [rows-1][columns];
		for(int i=0;i<rows-1;i++) {
			for( int j=0;j<columns;j++) {
				DataFormatter formatter = new DataFormatter();
				//System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
				//System.out.println(formatter.formatCellValue(sheet.getRow(i+1).getCell(j)));
				data[i][j]= formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			//System.out.println();
			
		}
		// closing would prevent memory loss
		wb.close();
		fis.close();
		return data;
		
		
		
		

	}

}
