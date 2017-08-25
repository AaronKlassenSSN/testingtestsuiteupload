package runTestCases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testCases.TestHTML5DragDrop;

public class TestDragAndDrop {
	
	TestHTML5DragDrop dragAndDrop;
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		driver.get("https://html5demos.com/drag/");
	}
	
	@Test(priority=1)
	public void dragAndDrop() throws AWTException, InterruptedException {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
