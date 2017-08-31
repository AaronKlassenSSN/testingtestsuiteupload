package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import utilities.ExcelUtils;

public class TestingExcel {
	private String sTestCaseName;
	private int iTestCaseRow;
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() throws Exception{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}
	
	@Test(dataProvider="Authentication")
	public void enterLoginInformation(String sUsername, String sPassword) {
		driver.findElement(By.id("account")).click();
		driver.findElement(By.id("log")).sendKeys(sUsername);
		driver.findElement(By.id("pwd")).sendKeys(sPassword);
		driver.findElement(By.id("login")).click();
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	@DataProvider
	public Object[][] Authentication() throws Exception {
		Object[][] testObjArray=ExcelUtils.getTableArray("SeleniumExcelTest.xlsx", "Sheet1");
		return (testObjArray);
	}
}
