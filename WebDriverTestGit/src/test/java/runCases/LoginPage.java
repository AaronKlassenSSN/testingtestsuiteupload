package runCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import buildCases.BuildLoginPageTestCases;
import org.testng.annotations.Test;
import utilities.ExcelUtils;

public class LoginPage {
	BuildLoginPageTestCases buildLoginTests;
	WebDriver driver;
	
	@DataProvider
	public Object[][] login() throws Exception {
		Object[][] testObjArray=ExcelUtils.getTableArray("DataProvider.xlsx", "Login");
		return (testObjArray);
	}
	
	@BeforeTest
	public void BeforeTests() {
		System.setProperty("webdriver.chrome.driver","C:\\ssn_qa\\testSuites\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://screenmanager.qa.screenscape.com/screens");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void verifyLoginPageTitle() throws InterruptedException {
		buildLoginTests = new BuildLoginPageTestCases(driver);
		buildLoginTests.verifyTitle();
	}
	
	@Test(priority=1, dataProvider="login")
	public void testLogin(String email, String password) throws InterruptedException {
		buildLoginTests = new BuildLoginPageTestCases(driver);
		buildLoginTests.testLoginAndLogout(email, password);
	}
	
	@AfterTest
	public void AfterTests() {
		driver.quit();
	}
}
