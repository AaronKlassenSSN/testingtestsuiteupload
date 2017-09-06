package runTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testCases.TestHTML5DragDrop;
import testCases.W3SchoolsDragAndDrop;

public class TestDragAndDrop {
	
	TestHTML5DragDrop dragAndDrop;
	W3SchoolsDragAndDrop anotherDragAndDrop;
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ssnqa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html5demos.com/drag/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void dragAndDrop() {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop();
	}
	
	@Test(priority=1)
	public void dragAndDrop2() {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop2();
	}
	
	
	@Test(priority=2)
	public void dragAndDrop3() {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop3();
	}
	
	@Test(priority=3)
	public void dragAndDrop4() {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop4();
	}
	
	@Test(priority=4)
	public void dragAndDrop5() {
		dragAndDrop = new TestHTML5DragDrop(driver);
		dragAndDrop.testDragAndDrop5();
	}
	
	@Test (priority=5)
	public void testW3SchoolsDragAndDrop() throws InterruptedException {
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");	
		anotherDragAndDrop = new W3SchoolsDragAndDrop(driver);
		anotherDragAndDrop.testMethod();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
