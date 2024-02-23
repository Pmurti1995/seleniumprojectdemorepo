package com.prasanna;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatGpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("https://www.letskodeit.com/");
		
		
		//click on sign in button
		WebElement signbtn = driver.findElement(By.xpath("//a[@href = '/login']"));
		signbtn.click();
		
		
		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("testuser@example.com");
		
		WebElement passfield = driver.findElement(By.id("login-password"));
		passfield.sendKeys("password123");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id = 'login']"));
		submit.click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
