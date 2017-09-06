package runTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testCases.HomePageTestCases;
import testCases.AppPageTestCases;

public class TestDemoPage {
	HomePageTestCases homePageObj;
	AppPageTestCases appPageObj;
	
	private WebDriver driver;
	
	@BeforeTest
	public void BeforeTest() {
		/*System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		System.setProperty("webdriver.gecko.driver", "C:\\ssnqa\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void testDemoPage() {
		homePageObj = new HomePageTestCases(driver);
		homePageObj.verifyDemoPageTitle();
		homePageObj.visitSelenium();
		homePageObj.visitJava();
		homePageObj.visitQTP();
		homePageObj.visitSAPBeginners();
		homePageObj.visitLinux();
	}
	
	@Test(priority=1)
	public void testAppLink() {
		appPageObj = new AppPageTestCases(driver);
		appPageObj.verifyPageTitle();
	}
	
	@AfterTest
	public void AfterTest() {
		driver.quit();			
	}
}
