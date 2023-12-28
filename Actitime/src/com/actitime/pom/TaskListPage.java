package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	
	@FindBy(linkText = "TASKS")
	private WebElement taskListTab;

	@FindBy(className = "addNewButton")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
	private WebElement newCustomerBtn;

	@FindBy(id = "customerLightBox_nameField")
	private WebElement customerNameTF;

	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement customerDescTF;

	@FindBy(id = "customerLightBox_commitBtn")
	private WebElement creatCustomerBtn;

	// will work only if the webpage is not refreshed, else element will moves to
	// last
	@FindBy(xpath = "//div[@class='itemsContainer']/div[2]/div[4]")
	private WebElement customerGearIcon;

	@FindBy(xpath = "//div[@class='customerNamePlaceHolder']/div/div[1]")
	private WebElement customerNameTag;

	public WebElement getCustomerNameTag() {
		return customerNameTag;
	}

	String expectedTitle = "The Hulk";

	// to verify
//	assertEquals(actualTitle, expectedTitle);

	@FindBy(xpath = "//div[@class='actionButton']")
	private WebElement actionBtn;
	
	@FindBy(xpath = "//div[@class='dropdownContainer actionsMenu']/div[1]/div[3]")
	private WebElement deleteBtn;
	
	@FindBy(id = "customerPanel_deleteConfirm_submitTitle")
	private WebElement deletePermanentlyBtn;

	public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	public WebElement getTaskListTab() {
		return taskListTab;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerNameTF() {
		return customerNameTF;
	}

	public WebElement getCustomerDescTF() {
		return customerDescTF;
	}

	public WebElement getCreatCustomerBtn() {
		return creatCustomerBtn;
	}

	public WebElement getCustomerGearIcon() {
		return customerGearIcon;
	}
	public String getExpectedTitle() {
		return expectedTitle;
	}



	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeletePermanentlyBtn() {
		return deletePermanentlyBtn;
	}












//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost/login.do");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.manage().window().maximize();
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.partialLinkText("Login")).click();
//		driver.findElement(By.linkText("TASKS")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.className("addNewButton")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("The Hulk");
//		Thread.sleep(1000);
//		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("HULK: The Destroyer!!");
//		Thread.sleep(1000);
//		driver.findElement(By.id("customerLightBox_commitBtn")).click();
//		Thread.sleep(2000);
//		// to click on gear icon
//		driver.findElement(By.xpath("//div[@class='itemsContainer']/div[2]/div[4]")).click();
//		Thread.sleep(2000);
//		// to get the name
//		WebElement e = driver.findElement(By.xpath("//div[@class='customerNamePlaceHolder']/div/div[1]"));
//		System.out.println(e.getText());
//		String expectedTitle = "The Hulk";
//		String actualTitle = e.getText();
//		assertEquals(actualTitle, expectedTitle);
//		// to acction dropdwon
//		driver.findElement(By.xpath("//div[@class='actionButton']")).click();
//		// to delete buttom
//		driver.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']/div[1]/div[3]")).click();
//		// to confirm
//		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
//		driver.quit();
//	}
//
////		driver.findElement(By.xpath("//div[@class='itemsContainer']/div[2]/div[4]")).click();
}