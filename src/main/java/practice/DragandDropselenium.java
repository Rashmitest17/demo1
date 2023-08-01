package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropselenium {

	@Test(priority = 1,enabled = false)
	public void test() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.get("https://www.goodfirms.co/crm-software/");
			
		Thread.sleep(2000);
		Actions action = new Actions(driver); // pass driver reference 
		
		//mouse actully move to element
		action.moveToElement(driver.findElement(By.className("navbar-nav-button"))).build().perform();
		//Static thread
		Thread.sleep(2000);
		driver.findElement(By.name("Software Development")).click();
		
		driver.findElement(By.linkText("Custom Software Developers")).click();
				
				
		
		
	}
		
	// Element not available exception -- 	we have to mouse howser about us and we have to click on it
	
	
	
	@Test(priority = 1,enabled = true)
	public void dragdown() {
		
		// DragandDropselenium
		
		//Click it ,  move it  and Relese it
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		Actions actions =new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build()
		.perform();
		
		driver.close();
		
		
	//	actions.dragAndDrop(null, null);
		
		
		
	}
	
	@Test
	public void implicitewaittest() {
		// Example of Implicitwait
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//Element not visisble then how will manage 
		
		driver.get("https://www.goodfirms.co/crm-software/");
		
		//Implicitwait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // Don't perform any actions and wait for 40 sec and fullyloaded 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	 // for all the elements global wait which are available on page
		
		
	}
	
}
