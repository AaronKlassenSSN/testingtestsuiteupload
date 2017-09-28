package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void fillOutReactFormCompanyReactWidgets() throws InterruptedException {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("companyWidgets");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("name--37")).sendKeys("Earache Records");
		driver.findElement(By.id("revenue--39")).sendKeys("123456789");
		driver.findElement(By.id("assets--40")).sendKeys("666");
		driver.findElement(By.id("founded--38_input")).sendKeys("04/19/1992");
		
		driver.findElement(By.id("productsDropdown--41")).click();
		Thread.sleep(100);
		driver.findElement(By.id("productsDropdown--41__listbox__option__0")).click();
	}
	
	@Test
	public void fillOutReactFormCompanySimple() throws InterruptedException{
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("companySimple");
		Select productsMenu = new Select(driver.findElement(By.id("products--35")));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[6]/button[2]")).click();
		driver.findElement(By.id("name--32")).sendKeys("Earache Records");
		driver.findElement(By.id("revenue--33")).sendKeys("123456789");
		driver.findElement(By.id("assets--34")).sendKeys("666");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[5]/div")).click();
		Thread.sleep(75);
		if(driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[5]/div/div[2]")).size() != 0) {
			driver.findElement(By.id("react-select-2--option-0")).click();
			driver.findElement(By.id("react-select-2--option-0")).click();
			driver.findElement(By.id("react-select-2--option-0")).click();
			driver.findElement(By.id("react-select-2--option-0")).click();
			driver.findElement(By.id("react-select-2--option-0")).click();
			driver.findElement(By.id("react-select-2--option-0")).click();
		}
	}
	
	@Test
	public void fillOutReactFormNestedFields() {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("nestedFields");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/fieldset[1]/div[1]/div/span/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/fieldset[2]/div/div/span/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/fieldset[2]/div/div/span/button[1]")).click();
		
		driver.findElement(By.id("club-name--2")).sendKeys("New Club");
		driver.findElement(By.id("club-city--3")).sendKeys("Charlottetown");
		
		driver.findElement(By.id("members-0-firstname--6")).sendKeys("First");
		driver.findElement(By.id("members-0-lastname--7")).sendKeys("Last");
		driver.findElement(By.id("members-0-hobbies-0--9")).sendKeys("Hobby 1");
		driver.findElement(By.id("members-0-hobbies-1--10")).sendKeys("Hobby 2");
		
		driver.findElement(By.id("members-1-firstname--12")).sendKeys("First 2");
		driver.findElement(By.id("members-1-lastname--13")).sendKeys("Last 2");
		driver.findElement(By.id("members-1-hobbies-0--15")).sendKeys("Hobby 1 1");
		driver.findElement(By.id("members-1-hobbies-1--16")).sendKeys("Hobby 2 2");
		
		driver.findElement(By.id("members-2-firstname--46")).sendKeys("First 3");
		driver.findElement(By.id("members-2-lastname--47")).sendKeys("Last 3");
		driver.findElement(By.id("members-2-hobbies-0--49")).sendKeys("Hobby 1 1 1");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div/button[2]")).click();
	}
	
	@Test
	public void fillOutReactFormFileUploadTest() throws InterruptedException {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("fileUpload");
		
		driver.findElement(By.id("myFileUpload--18")).sendKeys("C:\\Users\\aaron.klassen\\Downloads\\testingFile.txt");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[1]/div/div/button")).click();
	}
	
	@Test
	public void fillOutReactFormDynamicFieldsSelect() throws InterruptedException {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("dynamicFieldsSelect");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.id("react-select-2--option-0")).click();
	}
	
	/*@Test
	public void fillOutReactFormRegisterMaterial() {
		Select menu = new Select(driver.findElement(By.name("menu")));
		menu.selectByValue("registerMaterial");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/form/div[7]/button[2]")).click();
		driver.findElement(By.id("username--20")).sendKeys("newUser");
		driver.findElement(By.id("email--21")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("emailConfirm--22")).sendKeys("s.jobs@apple.com");
		driver.findElement(By.id("password--23")).sendKeys("Password!");
		driver.findElement(By.id("devSkills--24")).sendKeys("8");
		driver.findElement(By.id("terms--25")).click();
	}*/
}
