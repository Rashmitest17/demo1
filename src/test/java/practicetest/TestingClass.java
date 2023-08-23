package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.TestUtil;



public class TestingClass {

	@Test(priority = 1)
	public void verify_google() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.findElement(By.id("APjFqb")).sendKeys("JAVA");
		
		Thread.sleep(2000);
		
		// Custom xpath by using descendent div
		List<WebElement> list1 = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));

		System.out.println("Google Search Result List of Size: " + list1.size());
		driver.quit();
		
	}

	@Test(priority = 2)
	public void verify_Servicelisting() {

		// whileloop -- to perform activity

		int i = 1; // initialization
		while (i <= 10) { // condition
			System.out.println("My name" + i);
			i = i + 1;
		}
	}

	@Test(priority = 3)
	public void verify() {
		int num;
		for (num = 2; num <= 10; num++) {
			System.out.println("Value of num" + num);

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " *" + i + "=" + num * i);
			}

		}

	}

	@Test(priority = 4)
	public void testifelse() {

		int age = 16;
		if (age > 20) {
			System.out.println(" allow to bike ride");
		} else if (age == 16) {
			System.out.println("May be allowed ");
		} else {
			System.out.println("Not Allowed");
		}

	}

	@Test(priority = 5)
	public void gratertest() {

		int a = 10, b = 30, c = 5;

		if (a > b && a > c) {
			System.out.println("a is gretest");

		} else if (b > c) {
			System.out.println("b is gretest");
		} else {
			System.out.println("C is gretest");
		}

	}

	@Test(priority = 6)
	public void nestedif() {
		int a = 15, b = 2;

		if (a > 10) {
			if (b > 5) {
				System.out.println("b is greater than 5 ");
			} else {
				System.out.println("b is not greater than 5");
			}
		}

	}

	// Array
	@Test(priority = 7)
	public void arraytest() {

		int a = 10;
		int s[] = new int[5];
		s[0] = 3;
		s[1] = 23;
		s[2] = 43;
		s[3] = 53;
		s[4] = 63;

		char ch[] = new char[3];

		for (int i = 0; i < s.length; i++) {
			System.out.println(i + s[i]);
		}
		// length
		System.out.println("Length of Array is : " + s.length);

		// Object Array
		Object obj[] = new Object[5];
		obj[0] = 1;
		obj[1] = "Vaibhav";
		obj[2] = 12.5;
		obj[3] = "A";
		obj[4] = false;

		for (int j = 0; j < obj.length; j++) {
			System.out.println(obj[j]);

		}
		System.out.println("Object Array length=>" + obj.length);

		// one diminstional -- left to right
		// double diminitional array

		int b[][] = new int[3][5];
		// First Row
		b[0][0] = 22;
		b[0][1] = 33;
		b[0][2] = 32;
		b[0][3] = 11;
		b[0][4] = 31;


		// Second Row
		b[1][0] = 222;
		b[1][1] = 333;
		b[1][2] = 324;
		b[1][3] = 116;
		b[1][4] = 318;

		//third Row

		b[2][0] = 822;
		b[2][1] = 933;
		b[2][2] = 532;
		b[2][3] = 511;
		b[2][4] = 531;


		System.out.println("Value of b[2][3] = 511" +b[2][3]);
		
		
		for(int rowNum=0;rowNum<b.length;rowNum++) {
			
			for(int colNum=0;colNum<b[rowNum].length;colNum++) {

				System.out.println("Matrix Value is:" + b[rowNum][colNum]);
		
			}
			
			System.out.println();
		}
		

	}
	
	
	
	@Test(priority = 8)
	public void arrayListTest() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		
		list.add(2,"-");
		/*for(String str:list) {
			System.out.println(str);
		}*/
		
		
		//Delete value 
		
		//list.remove(2);  // By possible 

		list.remove("-");	//By Value 
		for(String str:list) {
			System.out.println(str);
		}
			
		
	}
	
	@Test(priority = 9)
	public void hashmaptestMostIMP() {
		
		//HashMap Demo
		
		HashMap<String,String> hash = new HashMap<String,String>(); 
		
		//in arraylist we using add but here use put 
		
		hash.put("number", "123");
		hash.put("name", "Rashmi");
		hash.put("age", "23");
		hash.put("code", "AF123");
		hash.put("lang", "JAVA");
		hash.put("Test","Automation Testing");
			
		System.out.println(hash.get("name"));
		
		System.out.println(hash.get("age"));
		//Fetch the whole detail for 2 methods 
		//1st Method
		
		Iterator<String> iterator =hash.keySet().iterator();
		while(iterator.hasNext())  // iterator has next verify next element is present or not -- it checks next element is not null 
		{
			String key =iterator.next();  //    and // navigate to next element 
			
			System.out.println(key +":" +hash.get(key));
			
			
		}
		
		//2nd Method 
		//keyset gives only keysset value
		//entry set gives the combination of key pair values both 
		for(Entry<String,String> entry: hash.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
		
		
		
	}
	
}
