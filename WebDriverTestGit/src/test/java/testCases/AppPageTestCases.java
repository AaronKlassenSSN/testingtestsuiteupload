package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppPageTestCases {
	
	@FindBy(linkText="My Apps")
	WebElement myAppLink;
	
	WebDriver driver;
	
	public AppPageTestCases(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void verifyPageTitle() {
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div[1]/div/p/a")).click();
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("Guru99 (Testing,SAP,Interview) - Android Apps on Google Play"));
	}
	
	@Test(priority=0)
	public void viewMyApps() {
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[1]/ul/li[1]/a")).click();
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("My Android Apps"));
	}
}
