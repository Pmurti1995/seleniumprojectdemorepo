package ECommerceWebste;



import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NaveenLabsWebsite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("prasanna1murti@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Poonam@1996");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();

		List<WebElement> dropdowns =  driver.findElements(By.linkText("Desktops"));
		System.out.println("Size is equal to:" +dropdowns.size());
		for(WebElement all:dropdowns) {

			String alloptns = all.getText();
			System.out.println(alloptns);
		}

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Desktops"))).perform();
		ac.moveToElement(driver.findElement(By.linkText("Show All Desktops"))).perform();
		ac.click().build().perform();
		WebElement sorts = driver.findElement(By.id("input-sort"));
		sorts.click();
		driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")).click();
		driver.findElement(By.xpath("//a[@title = 'Shopping Cart']")).click();
		//Select sc = new Select(sorts);

		/*List<WebElement> dropdowns1 = driver.findElements(By.id("input-sort"));
		 System.out.println("All items are:" +dropdowns1.size());
		for(WebElement all2:dropdowns1) {

			//String alloptns = all2.getText();
					if(all2.getText().equals("Rating (Highest)"));{
						all2.click();
					}
			//System.out.println(alloptns);*/
	}





}


