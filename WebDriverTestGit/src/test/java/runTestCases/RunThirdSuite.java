package runTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testCases.HTML5Form;

public class RunThirdSuite {
	HTML5Form html5Form;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html5doctor.com/demos/forms/forms-example.html");
	}
	
	@Test(priority=0)
	public void fillOutFirstSection() {
		html5Form = new HTML5Form(driver);
		html5Form.fillOutFirstSection();
	}
	
	@Test(priority=1)
	public void fillOutSecondSection() {
		html5Form = new HTML5Form(driver);
		html5Form.fillOutBillingSection();
	}
	
	@Test(priority=2)
	public void fillOutThirdSection() {
		html5Form = new HTML5Form(driver);
		html5Form.fillOutCardDetails();
	}
	
	@Test(priority=3)
	public void submitForm() {
		html5Form = new HTML5Form(driver);
		html5Form.submit();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
