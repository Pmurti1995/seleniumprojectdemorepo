package com.prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoApp4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.demo.guru99.com/V4/");
    Thread.sleep(5000);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    driver.findElement(By.name("uid")).sendKeys("mngr476053");
    driver.findElement(By.name("password")).sendKeys("egabEvy");
    driver.findElement(By.name("btnLogin")).click();
    driver.findElement(By.xpath("//a[@class = 'dropdown-toggle']")).click();
    WebElement drpdown= driver.findElement(By.xpath("//a[@aria-expanded = 'true']"));
    System.out.println("Dropdowns are : " +drpdown);
    Thread.sleep(5000);
    
    
	}
}
   
    
    
	


