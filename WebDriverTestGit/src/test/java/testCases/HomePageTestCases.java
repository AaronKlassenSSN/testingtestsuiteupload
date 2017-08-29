package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestCases {
	
	WebDriver driver;
	
	public HomePageTestCases(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void verifyDemoPageTitle() {
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("Demo Guru99 Page"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
	}
	
	@Test(priority=1)
	public void visitSelenium() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a")).click();
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("Free Selenium Tutorials"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
		driver.navigate().back();
	}
	
	@Test(priority=2)
	public void visitJava() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a")).click();
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("Java Tutorial for Beginners: Learn in 7 Days"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void visitQTP() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/a")).click();
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("Free HP UFT/QTP (Quick Test Professional) Tutorials"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
		
		driver.navigate().back();
	}
	
	@Test(priority=4)
	public void visitSAPBeginners() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/div/a")).click();
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("SAP Course for Beginners"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
		
		driver.navigate().back();
	}
	
	@Test(priority=5)
	public void visitLinux() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[5]/div/div/div/div/div[1]/div/div/a")).click();
		String title = driver.getTitle();
		try {
			Assert.assertTrue(title.contains("Free Linux Tutorials"));
		} catch (AssertionError e) {
			System.err.println(e);
		}
		driver.navigate().back();
	}
}
