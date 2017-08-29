package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Outrun {
	WebDriver driver;
	
	public Outrun(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Outrun"));
	}
}
