package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;

public class TestHTML5DragDrop {
	
	/*@FindBy(id="one")
	private WebElement source;
	@FindBy(id="bin")
	private WebElement target;*/

	WebDriver driver;
	
	ArrayList<String> dragStart = new ArrayList<>(Arrays.asList("one","two","three","four","five"));
	
	public TestHTML5DragDrop(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void testDragAndDrop() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		for(String element : dragStart) {
			WebElement source = driver.findElement(By.id(element));
			WebElement target = driver.findElement(By.id("bin"));
			
			Point sourceCoordinates = source.getLocation();
			Point targetCoordinates = target.getLocation();
					
			robot.mouseMove(sourceCoordinates.getX()+5, sourceCoordinates.getY()+108);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(111);
			
			robot.mouseMove(targetCoordinates.getX()+200, targetCoordinates.getY()+108);
			Thread.sleep(111);
			
			robot.mouseMove(targetCoordinates.getX(), targetCoordinates.getY()+115);
			Thread.sleep(111);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(111);
			
			if(driver.findElement(By.xpath("//*[@id=\"bin\"]/p")) != null) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
	}
}
