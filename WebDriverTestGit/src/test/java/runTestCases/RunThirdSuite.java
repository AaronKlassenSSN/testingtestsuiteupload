package runTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testCases.Outrun;

public class RunThirdSuite {
	
	Outrun outrun;
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/r/outrun/");
	}
	
	@Test(priority=0)
	public void verifyTitleText() {
		outrun = new Outrun(driver);
		outrun.verifyTitle();
	}
	
	@Test(priority=1)
	public void checkFirstLink() {
		driver.findElement(By.xpath("//*[@id=\"thing_t3_6wpiym\"]/div[2]/div[1]/ul/li[1]/a"));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
