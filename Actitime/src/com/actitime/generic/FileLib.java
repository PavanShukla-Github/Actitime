package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
	}

	public String readDataFromExelFile(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void writeDataIntoExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);

	}
}
