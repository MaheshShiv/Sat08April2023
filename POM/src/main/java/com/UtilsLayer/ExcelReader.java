package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseLayer.BaseClass;

public class ExcelReader {
	
	public static XSSFWorkbook workbook;
	
	public ExcelReader(String path) {
		
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetindex, int rows, int cells) {
		
		try{
			return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getStringCellValue();
		}
		
		catch (Exception e) {
			return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getRawValue();
		}
	}
	
	public int getRowCount(int sheetindex) {
		
		return workbook.getSheetAt(sheetindex).getLastRowNum() + 1;
	}
	
	public int getCellCount(int sheetindex) {
		
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}

}
