package com.prasanna;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/?cc=in");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//span[@class = 'sa_tm_text']"));
		System.out.println("List of auto suggestions are " +list.size());
		for(WebElement listitem:list) {
			if(listitem.getText().contains("download")) {
				listitem.click();
				break;
		

			}

		}
	}

}
