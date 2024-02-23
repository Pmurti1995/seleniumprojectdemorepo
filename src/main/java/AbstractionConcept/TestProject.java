package AbstractionConcept;



import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProject {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://katalon-demo-cura.herokuapp.com/profile.php#login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	  driver.findElements(By.xpath("//select[@name = 'facility']"));
		driver.findElement(By.xpath("//label[@for='chk_hospotal_readmission']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='None']")).click();
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='22']")).click();
		driver.findElement(By.id("txt_comment")).sendKeys("Done");
		driver.findElement(By.id("btn-book-appointment")).click();
		driver.navigate().back();
		
	
	
		
		
		
		
	}

}
