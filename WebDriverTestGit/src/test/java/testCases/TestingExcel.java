package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.ExcelUtils;

public class TestingExcel {
	WebDriver driver;

	public TestingExcel(WebDriver driver) {
		this.driver=driver;
	}
	
	@Test
	public void enterLoginInformation(String sUsername, String sPassword) {
		driver.findElement(By.id("account")).click();
		driver.findElement(By.id("log")).sendKeys(sUsername);
		driver.findElement(By.id("pwd")).sendKeys(sPassword);
		driver.findElement(By.id("login")).click();
	}
	
	@Test
	public void leaveAComment(String comment, String name, String email, String url) {
		driver.findElement(By.id("menu-item-54")).click();
		driver.findElement(By.id("comment")).sendKeys(comment);
		driver.findElement(By.id("author")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("url")).sendKeys(url);
		driver.findElement(By.id("submit")).click();
	}
}
