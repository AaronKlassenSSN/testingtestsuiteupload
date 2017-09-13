package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestingReactPage {
	WebDriver driver;
	
	public TestingReactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test
	public void fillOutReactForm() {
		/*Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("registerSimple");*/
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("username--20")).sendKeys("newUser");
		driver.findElement(By.id("email--21")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("emailConfirm--22")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("password--23")).sendKeys("Password!");
		driver.findElement(By.id("devSkills--24")).sendKeys("8");
		driver.findElement(By.id("terms--25")).click();
	}
}
