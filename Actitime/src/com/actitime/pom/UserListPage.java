package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	@FindBy(className = "buttonText")
	private WebElement adduserBtn;

	@FindBy(name = "firstName")
	private WebElement firstNameTbx;

	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lastNameTbx;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailTbx;

	@FindBy(name = "username")
	private WebElement usernameTbx;

	@FindBy(name = "password")
	private WebElement passwordTbx;

	@FindBy(name = "passwordCopy")
	private WebElement retypePwdTbx;

	@FindBy(id = "userDataLightBox_commitBtn")
	private WebElement createBtn;

	@FindBy(className = "userNameContainer")
	private WebElement unContainerBtn;

	@FindBy(id = "userDataLightBox_deleteBtn")
	private WebElement deleteBtn;

	@FindBy(className = "userNameSpan")
	private WebElement createdUser;

	
	public WebElement getAdduserBtn() {
		return adduserBtn;
	}

	public WebElement getUnContainerBtn() {
		return unContainerBtn;
	}

	public WebElement getFirstNameTbx() {
		return firstNameTbx;
	}

	public WebElement getLastNameTbx() {
		return lastNameTbx;
	}

	public WebElement getEmailTbx() {
		return emailTbx;
	}

	public WebElement getUsernameTbx() {
		return usernameTbx;
	}

	public WebElement getPasswordTbx() {
		return passwordTbx;
	}

	public WebElement getRetypePwdTbx() {
		return retypePwdTbx;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getCreatedUser() {
		return createdUser;
	}

}
