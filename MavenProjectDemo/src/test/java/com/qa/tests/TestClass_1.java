package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_1 {
	@Test
	public void testTestClass1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\EPAYSHOP\\MavenProjectDemo\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		WebElement kidsele = driver.findElement(By.xpath("(//a[contains(.,'Kids')])[1]"));
		if(kidsele.isDisplayed()) {
			System.out.println("yes Displayed");
			
		}
		else{
			System.out.println("No Not Displayed.......>>");
			
		}
	
		kidsele.click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

	

}
