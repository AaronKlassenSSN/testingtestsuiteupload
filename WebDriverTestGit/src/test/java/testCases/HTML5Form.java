package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTML5Form {
	WebDriver driver;
	
	public HTML5Form(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test
	public void fillOutFirstSection() {
		driver.findElement(By.id("given-name")).sendKeys("Aaron");
		driver.findElement(By.id("family-name")).sendKeys("Klassen");
		driver.findElement(By.id("dob")).sendKeys("04191992");
		driver.findElement(By.id("email")).sendKeys("testemail@noemail.com");
		driver.findElement(By.id("url")).sendKeys("http://www.screenscape.com");
		driver.findElement(By.id("phone")).sendKeys("555-1234");
		driver.findElement(By.id("shoes")).sendKeys("10");
	}
	
	@Test
	public void fillOutBillingSection() {
		driver.findElement(By.id("address")).sendKeys("614 North River Rd, Charlottetown, PEI");
		driver.findElement(By.id("postCode")).sendKeys("C0A 1H5");
		driver.findElement(By.id("country")).sendKeys("Canada");
	}
	
	@Test
	public void fillOutCardDetails() {
		driver.findElement(By.id("visa")).click();
		driver.findElement(By.id("cardName")).sendKeys("Aaron Klassen");
		driver.findElement(By.id("cardNo")).sendKeys("0000 1234 5678 9000 0000");
		driver.findElement(By.id("security")).sendKeys("125");
	}
	
	@Test
	public void submit() {
		WebElement form = driver.findElement(By.id("register"));
		form.submit();
	}
}
