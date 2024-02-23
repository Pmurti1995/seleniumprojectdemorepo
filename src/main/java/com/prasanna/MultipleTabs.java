package com.prasanna;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String Id = driver.getWindowHandle();
		System.out.println("Parent id is " +Id);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String> allwindow = driver.getWindowHandles();
		int count = allwindow.size();
		System.out.println("no of windows " +count);
		 
		for(String chld:allwindow) {
			if(!Id.equalsIgnoreCase(chld)) {
				driver.switchTo().window(chld);
			System.out.println("child window is " +chld);
			//driver.findElement(By.name("q")).sendKeys("selenium");
			
			Thread.sleep(5000);
			driver.close();
		}
		driver.switchTo().window(Id);
		}
		System.out.println("Parent window title is " +driver.getTitle());
		
		

	

	}
}