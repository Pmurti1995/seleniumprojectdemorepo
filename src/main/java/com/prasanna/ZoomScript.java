package com.prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomScript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18_45");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    String zoomchrome = "document.body.style.zoom = '400%'";
	    js.executeScript(zoomchrome);
	    //driver.close();


	}

}
