package runTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testCases.HTML5Form;
import utilities.ExcelUtils;

public class RunThirdSuite {
	HTML5Form html5Form;
	WebDriver driver;
	
	@DataProvider
	public Object[][] HTML5FormData() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray("SeleniumExcelTest.xlsx", "HTML5Form");
		return (testObjArray);
	}
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html5doctor.com/demos/forms/forms-example.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0, dataProvider="HTML5FormData")
	public void fillOutForm(String givenname, String familyname, String dob, String email, String url, String phone, String shoes, String address, String postCode, String country, String card, String cardName, String cardNo, String security) {
		html5Form = new HTML5Form(driver);
		html5Form.fillOutAndSubmitForm(givenname, familyname, dob, email, url, phone, shoes, address, postCode, country, card, cardName, cardNo, security);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
