package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goodfirms.co/app-development-software/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"filter\"]/div/div/button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("div[class='filter-input popular-features'] button[type='button']")).click();
		Thread.sleep(1000);

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//div[@class='filter-input popular-features open']//ul"));

		for (int i = 0; i < checkboxes.size(); i++) {
			String valueString = checkboxes.get(i).getAttribute("Collaboration Tools");
			if (valueString.equalsIgnoreCase("Collaboration Tools")) {
				break;
			}
		}
		driver.close();

	}
}
