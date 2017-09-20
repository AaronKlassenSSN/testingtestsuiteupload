package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestingReactPage {
	WebDriver driver;
	
	public TestingReactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test
	public void fillOutReactForm() {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("registerSimple");
		menu.selectByValue("companyWidgets");
		menu.selectByValue("companySimple");
		menu.selectByValue("nestedFields");
		menu.selectByValue("fileUpload");
		menu.selectByValue("markdown");
		menu.selectByValue("dynamicFieldsSelect");
		menu.selectByValue("registerMaterial");
		
		/*driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("username--20")).sendKeys("newUser");
		driver.findElement(By.id("email--21")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("emailConfirm--22")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("password--23")).sendKeys("Password!");
		driver.findElement(By.id("devSkills--24")).sendKeys("8");
		driver.findElement(By.id("terms--25")).click();*/
	}
	
	@Test
	public void fillOutReactFormRegisterSimple() {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("registerSimple");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("username--26")).sendKeys("newUserName");
		driver.findElement(By.id("email--27")).sendKeys("newUserEmail@gmail.com");
		driver.findElement(By.id("emailConfirm--28")).sendKeys("newUserEmail@gmail.com");
		driver.findElement(By.id("password--29")).sendKeys("Password1234");
		driver.findElement(By.id("devSkills--30")).sendKeys("8");
		
	}
	
	@Test
	public void fillOutReactFormCompanyReactWidgets() {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("companyWidgets");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("name--37")).sendKeys("Earache Records");
		driver.findElement(By.id("revenue--39")).sendKeys("123456789");
		driver.findElement(By.id("assets--40")).sendKeys("666");
		driver.findElement(By.id("founded--38_input")).sendKeys("04/19/1992");
		driver.findElement(By.id("productsDropdown--41")).click();
		
	}
}
