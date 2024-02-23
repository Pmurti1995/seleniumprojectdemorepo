package com.prasanna;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreelancingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expectedtitle = "google";
        String actualtitle = driver.getTitle();
        if(expectedtitle.equalsIgnoreCase(actualtitle)) {
        	System.out.println(expectedtitle);
        }
        else {
        	System.out.println(actualtitle);
        	
        }
        WebElement listBox = driver.findElement(By.id("listbox-id"));
	}
        

        // Search for the option with text "Option 1"
        
        
        
        public static WebElement getElement(WebDriver driver, String locatorType, String locatorValue) {
            By locator = null;

            switch (locatorType.toLowerCase()) {
                case "id":
                    locator = By.id(locatorValue);
                    break;
                case "name":
                    locator = By.name(locatorValue);
                    break;
                case "class":
                    locator = By.className(locatorValue);
                    break;
                case "tagname":
                    locator = By.tagName(locatorValue);
                    break;
                case "linktext":
                    locator = By.linkText(locatorValue);
                    break;
                case "partiallinktext":
                    locator = By.partialLinkText(locatorValue);
                    break;
                case "xpath":
                    locator = By.xpath(locatorValue);
                    break;
                case "cssselector":
                    locator = By.cssSelector(locatorValue);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid locator type: " + locatorType);
            }

            return driver.findElement(locator);
        
	}

}
