package com.prasanna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.snapdeal.com");
      driver.get("https://www.amazon.com");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      //driver.manage().window().maximize();
      
	}

}
