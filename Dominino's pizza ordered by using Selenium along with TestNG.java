package com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SumailinDominos {
     WebDriver driver;
     
    @Test
	public void launchBrowser() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://pizzaonline.dominos.co.in");
		driver.manage().window().maximize();
    }
    @Test
    public void location() throws InterruptedException {
    	driver.findElement(By.xpath("(//input[@placeholder='Enter your delivery address']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@type='text'])[1]")).sendKeys("Chennai");
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//span[text()='Chennai']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
    	WebElement cityName = driver.findElement(By.xpath("//input[@placehlder='Select City']"));
    	cityName.click();
    	cityName.sendKeys("CHENNAI");
    	Thread.sleep(2000);
    	cityName.click();
    	
    	driver.findElement(By.xpath("//span[text()='CHENNAI']")).click();
    	Thread.sleep(2000);
    	WebElement selectStore = driver.findElement(By.xpath("//input[@placeholder='SelectStore']"));
    	selectStore.click();
    	Thread.sleep(2000);
    	selectStore.sendKeys("THIRUVANMIYUR");
    	selectStore.click();
    	
    	driver.findElement(By.xpath("//span[text()='THIRUVANMIYUR']")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//button[@class='btn--grn']")).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(By.xpath("(//button[@data-label='addTocart'])[1]")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@data-label='miniCartCheckout']")).click();
    	WebElement cheesyReward = driver.findElement(By.xpath("//button[@onclick='moeRemoverBanner()']"));
    	cheesyReward.click();
    	
    }
}

