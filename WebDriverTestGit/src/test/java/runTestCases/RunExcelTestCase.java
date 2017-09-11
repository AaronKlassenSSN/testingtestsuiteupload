package runTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testCases.TestingExcel;
import utilities.ExcelUtils;

public class RunExcelTestCase {
	TestingExcel ExcelTest;
	WebDriver driver;
	
	@DataProvider
	public Object[][] Authentication() throws Exception {
		Object[][] testObjArray=ExcelUtils.getTableArray("SeleniumExcelTest.xlsx", "Login");
		return (testObjArray);
	}
	
	@DataProvider
	public Object[][] AuthenticationLeaveAComment() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray("SeleniumExcelTest.xlsx", "ContactUs");
		return (testObjArray);
	}
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0, dataProvider="Authentication")
	public void runExcelTest(String sUsername, String sPassword) {
		ExcelTest = new TestingExcel(driver);
		ExcelTest.enterLoginInformation(sUsername, sPassword);
	}
	
	@Test(priority=1,dataProvider="AuthenticationLeaveAComment")
	public void leaveAComment(String comment, String author, String email, String url) {
		ExcelTest = new TestingExcel(driver);
		ExcelTest.leaveAComment(comment, author, email, url);
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
