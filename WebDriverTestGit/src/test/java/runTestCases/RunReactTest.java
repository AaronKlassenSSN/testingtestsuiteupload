package runTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testCases.TestingReactPage;

public class RunReactTest {
	
	TestingReactPage reactPage;
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://foxhound87.github.io/mobx-react-form-demo/demo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void fillOutReactForm() throws InterruptedException { 
		reactPage = new TestingReactPage(driver);
		reactPage.fillOutReactFormRegisterSimple(); 
		reactPage.fillOutReactFormCompanyReactWidgets();
		reactPage.fillOutReactFormCompanySimple();
		reactPage.fillOutReactFormNestedFields();
	}
	
	/*@AfterTest
	public void TearDown() {
		driver.quit();
	}*/
}
