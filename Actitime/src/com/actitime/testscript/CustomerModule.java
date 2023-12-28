package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass{
	
	@Test
	public void createAndDeleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		TaskListPage t = new TaskListPage(driver);
		HomePage h= new HomePage(driver);
		h.taskTabPage();Thread.sleep(1000);
//		t.getTaskListTab().click();Thread.sleep(1000);
		t.getAddNewBtn().click();Thread.sleep(1000);
		t.getNewCustomerBtn().click();Thread.sleep(2000);
		t.getCustomerNameTF().sendKeys("The Hulk");Thread.sleep(2000);
		t.getCustomerDescTF().sendKeys("HULK: The Destroyer!!");Thread.sleep(2000);
		t.getCreatCustomerBtn().click();Thread.sleep(1000);
		t.getCustomerGearIcon().click();Thread.sleep(1000);
		String expectedTitle = t.getExpectedTitle();Thread.sleep(1000);
		String actualTitle = t.getCustomerNameTag().getText();Thread.sleep(1000);
		assertEquals(expectedTitle, actualTitle);Thread.sleep(1000);
		t.getActionBtn().click();Thread.sleep(1000);
		t.getDeleteBtn().click();Thread.sleep(1000);
		t.getDeletePermanentlyBtn().click();Thread.sleep(2000);
		
		
	}

}
