package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHTML5DragDrop {

	WebDriver driver;
	
	final String javaScript = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffect:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
								"ction(format,data){this.items[format]=data;this.types.append(format);},getData:function(format){return this.items[format];},clea" +
								"rData:function(format){}};var emit=function(event,target){var evt=document.createEvent('Event');evt.initEvent(event,true,false);" +
								"evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
								"'drop',tgt);emit('dragend',src);";
	
	public TestHTML5DragDrop(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void testDragAndDrop() {
		WebElement source = driver.findElement(By.id("one"));
		WebElement target = driver.findElement(By.id("bin"));
		((JavascriptExecutor)driver).executeScript(javaScript, source, target);
		if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=1)
	public void testDragAndDrop2() {
		WebElement source = driver.findElement(By.id("two"));
		WebElement target = driver.findElement(By.id("bin"));
		((JavascriptExecutor)driver).executeScript(javaScript, source, target);
		if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void testDragAndDrop3() {
		WebElement source = driver.findElement(By.id("three"));
		WebElement target = driver.findElement(By.id("bin"));
		((JavascriptExecutor)driver).executeScript(javaScript, source, target);
		if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3)
	public void testDragAndDrop4() {
		WebElement source = driver.findElement(By.id("four"));
		WebElement target = driver.findElement(By.id("bin"));
		((JavascriptExecutor)driver).executeScript(javaScript, source, target);
		if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=4)
	public void testDragAndDrop5() {
		WebElement source = driver.findElement(By.id("five"));
		WebElement target = driver.findElement(By.id("bin"));
		((JavascriptExecutor)driver).executeScript(javaScript, source, target);
		if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
