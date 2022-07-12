package com.example.java.demoJava;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoJavaApplicationTest {
	@Test
	public void contextLoads() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\DevStudio\\Installs\\chrome\\chrome102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		String actualUrl="https://www.amazon.com/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		Thread.sleep(2000);
         driver.quit();
	}

}



