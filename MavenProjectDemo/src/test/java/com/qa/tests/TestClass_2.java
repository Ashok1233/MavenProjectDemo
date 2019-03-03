package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_2 {
	@Test
	public void testTestClass1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\EPAYSHOP\\MavenProjectDemo\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		WebElement Disele = driver.findElement(By.xpath("//a[@data-group='discover']"));
		if(Disele.isDisplayed()) {
			System.out.println("yes DisDisplayed");
		}
		else {
			System.out.println("No Dis");
		}
		
		Disele.click();
		Thread.sleep(3000);
		driver.close();
	

}
}
