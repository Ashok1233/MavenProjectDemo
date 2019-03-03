package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_3 {
	@Test
	public void testTestClass1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\EPAYSHOP\\MavenProjectDemo\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		WebElement Menele = driver.findElement(By.xpath("(//a[contains(.,'Men')])[1]"));
		if(Menele.isEnabled()) {
			System.out.println("Yes Enabled");
		}
		else {
			System.out.println("Not enabled");
		}
		Menele.click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
