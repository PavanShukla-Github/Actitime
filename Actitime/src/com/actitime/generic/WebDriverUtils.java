package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {
public int getLastRow(String sheet) throws IOException {
FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
int row = wb.getSheet(sheet).getLastRowNum();
return row;
}

public void selectOptionUsingIndex(WebElement ele, int index) {
	Select s=new Select(ele);
	s.selectByIndex(index);
}	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
}
	
public void selectOptionUsingVisibleText(WebElement ele, String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
}
