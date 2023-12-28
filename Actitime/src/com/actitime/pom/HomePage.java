package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id = "logoutLink")
	private WebElement logoutbtn;

	@FindBy(linkText = "USERS")
	private WebElement userListTab;
	
	@FindBy(linkText = "TASKS")
	private WebElement taskListTab;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setlogout() {
		logoutbtn.click();
	}

	public void setuserListTab() {
		userListTab.click();
	}
	public void taskTabPage() {
		taskListTab.click();
	}
}
