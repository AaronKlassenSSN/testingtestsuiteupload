package testCases;

import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTML5Form {
	WebDriver driver;
	private String today;
	
	public HTML5Form(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test
	public void fillOutAndSubmitForm(String givenname, String familyname, String dob, String email, String url, String phone, String shoes, String address, String postCode, String country, String card, String cardName, String cardNo, String security) {
		today=getCurrentDay();
		
		System.out.println(today);
		
		WebElement form = driver.findElement(By.id("register"));
		
		driver.findElement(By.id("given-name")).sendKeys(givenname);
		driver.findElement(By.id("family-name")).sendKeys(familyname);
		driver.findElement(By.id("dob")).sendKeys(dob);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("url")).sendKeys(url);
		driver.findElement(By.id("phone")).sendKeys(phone);
		driver.findElement(By.id("shoes")).sendKeys(shoes);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("postCode")).sendKeys(postCode);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id(card)).click();
		driver.findElement(By.id("cardName")).sendKeys(cardName);
		driver.findElement(By.id("cardNo")).sendKeys(cardNo);
		driver.findElement(By.id("security")).sendKeys(security);
		driver.findElement(By.xpath("//*[@id=\"register\"]/fieldset[4]/div/button"));
		
		form.submit();
	}
	
	private String getCurrentDay() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		
		int todayInt=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: "+todayInt+"\n");
		
		String todayStr=Integer.toString(todayInt);
		System.out.println("Today Str: "+todayStr+"\n");
		
		return todayStr;
	}
}
