package com.prasanna;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are " +links.size());
		for(WebElement all:links) {
			//WebElement element = links.get(i);
			String url1 = all.getAttribute("href");
			//System.out.println("Links are " +url1);
			
			URL link = new URL(url1);
			
			//Establish connection
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			httpconn.connect();
			//get response code
			int rescode = httpconn.getResponseCode();
			if(rescode<=400) {
				System.out.println("Links are valid " +rescode);
			}
			else {
				System.out.println("Links are broken");
			}
		}

	}

}
