package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public  WebDriver driver;
	public FileLib f = new FileLib();
@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser) throws IOException {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	} else {
		driver = new EdgeDriver();
	}
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = f.readDataFromPropertyFile("URL");
		driver.get(url);
		Reporter.log("OpenBrowser", true);
	}

	@BeforeMethod
	public void login() throws IOException {
		String un = f.readDataFromPropertyFile("username");
		String pwd = f.readDataFromPropertyFile("password");
		LoginPage l = new LoginPage(driver);
		l.setLogin(un,pwd);
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void logout() {
		HomePage h= new HomePage(driver);
		h.setlogout();
		Reporter.log("logout", true);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser", true);
	}
}