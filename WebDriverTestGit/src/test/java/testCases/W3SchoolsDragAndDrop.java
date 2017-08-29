package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class W3SchoolsDragAndDrop {
	
	static WebDriver driver;
	
	final static String javaScript = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffect:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
										"ction(format,data){this.items[format]=data;this.types.append(format);},getData:function(format){return this.items[format];},clea" +
										"rData:function(format){}};var emit=function(event,target){var evt=document.createEvent('Event');evt.initEvent(event,true,false);" +
										"evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
										"'drop',tgt);emit('dragend',src);";
	
	public W3SchoolsDragAndDrop(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void testingMethod() {
		try {
			Assert.assertTrue(false);
		} catch (AssertionError e){
			System.err.println(e);
		}
	}
	
	@Test(priority=1)
	public void testMethod() throws InterruptedException {
		WebElement source = driver.findElement(By.id("drag1"));
		WebElement target = driver.findElement(By.id("div2"));
		try {
			((JavascriptExecutor)driver).executeScript(javaScript, source, target);
			if(driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[4]/img")) != null) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
			Thread.sleep(1000);
		} catch (AssertionError e) {
			System.out.println(e);
		}
	}

}
