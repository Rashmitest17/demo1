package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatepopUp {

	// Example of Popup by automation
	/*
	 * @Test public void test1() {
	 * 
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver();
	 * 
	 * //Basic Authentication popup in selenium
	 * driver.get("http://admin:admin@the-internet.herkuapp.com/basic_auth");
	 * 
	 * String pageMessage=driver.findElement(By.cssSelector("p")).getText();
	 * System.out.println(pageMessage);
	 * 
	 * 
	 * driver.close();
	 * 
	 * }
	 */

	@Test (priority = 1,enabled = false)
	public void popup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(2000);

		// it will switch it will retrun to alert class object reference
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert message");

		} else {
			System.out.println("In- correct Alert message");
		}

		alert.accept(); // for ok button

		// alert.dismiss(); // for cancel button

		driver.close();

	}

	@Test(priority = 2,enabled = true)
	public void HandleFileUploadPopup() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");
		// which file u want to upload give path -- without clicking on browse buttons.... their are attachments 
		driver.findElement(By.name("fileupload"))
				.sendKeys("D:\\.Pictures\\SamplePNGImage_20mbmb.png");
	
		driver.close(); // driver will be close.
		
		
	}
	
	
						

}
