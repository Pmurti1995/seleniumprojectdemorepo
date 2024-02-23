package com.prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoApp {

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
    String title = driver.getTitle();
    String title1 = "Managerhomepage";
    System.out.println("Title is: " +title);
    //driver.close();
    if(!title.equalsIgnoreCase(title1)) {
    	System.out.println("Print title: " +title);
    }
    else {
    }
    }
    
    
	}


