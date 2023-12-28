package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;

public class UserModule extends BaseClass {
	
	@Test
	public void createAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException {
		int count = 1000;
		Thread.sleep(count);
//		LoginPage l = new LoginPage(driver);
//	l.setLogin(admin, manager);
		FileLib f= new FileLib();
		String firstname = f.readDataFromExelFile("createAndDeleteUser", 1, 1);
		String lastname= f.readDataFromExelFile("createAndDeleteUser", 1, 2);
		String email = f.readDataFromExelFile("createAndDeleteUser", 1, 3);
		String username = f.readDataFromExelFile("createAndDeleteUser", 1, 4);
		String password = f.readDataFromExelFile("createAndDeleteUser", 1, 5);
		String retypepassword= f.readDataFromExelFile("createAndDeleteUser", 1, 6);
		String expectedUserName= f.readDataFromExelFile("createAndDeleteUser", 1,7);
	
		HomePage h=new HomePage(driver);
		h.setuserListTab();
		UserListPage u = new UserListPage();
		u.getAdduserBtn().click();
		u.getFirstNameTbx().sendKeys(firstname);
		Thread.sleep(count);
		u.getLastNameTbx().sendKeys(lastname);
		u.getEmailTbx().sendKeys(email);
		u.getUsernameTbx().sendKeys(username);
		u.getPasswordTbx().sendKeys(password);
		u.getRetypePwdTbx().sendKeys(retypepassword);
		u.getCreateBtn().click();
		String actualUser = u.getCreatedUser().getText();
		Assert.assertEquals(actualUser, expectedUserName);
		u.getCreatedUser().click();
		u.getDeleteBtn().click();
		driver.switchTo().alert().accept();
		h.setlogout();
		
//		driver.findElement(By.linkText("USERS")).click();
//		Thread.sleep(count);
//		driver.findElement(By.className("buttonText")).click();
//		Thread.sleep(count);
//		driver.findElement(By.name("firstName")).sendKeys("The");
//		Thread.sleep(count);
//		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Hulk");Thread.sleep(count);
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("thehulk@actitime.com");Thread.sleep(count);
//		driver.findElement(By.name("username")).sendKeys("HULK");Thread.sleep(count);
//		driver.findElement(By.name("password")).sendKeys("Hulk@123");Thread.sleep(count);
//		driver.findElement(By.name("passwordCopy")).sendKeys("Hulk@123");Thread.sleep(count);
//		driver.findElement(By.id("userDataLightBox_commitBtn")).click();Thread.sleep(count);
//		driver.findElement(By.className("userNameContainer")).click();Thread.sleep(count);
//		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();Thread.sleep(count);
//		driver.switchTo().alert().accept();Thread.sleep(count);
//		driver.findElement(By.id("logoutLink")).click();Thread.sleep(count);
		Reporter.log("createAndDeleteUser", true);
		
	}

}
