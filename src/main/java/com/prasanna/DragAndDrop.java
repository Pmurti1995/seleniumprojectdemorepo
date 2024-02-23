package com.prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//span[text() = 'Lawrence Block']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id = 'treeTarget']"));
		ac.clickAndHold(src).moveToElement(trg).release().build().perform();

	}

}
