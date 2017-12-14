package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteJunkMailsSelenium {
	public WebDriver driver;
	
	@Test(enabled=true)
		
		public void getSearchValues() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://mail.google.com");
			
			driver.findElement(By.id("identifierId")).sendKeys("durgakavkuntla");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			driver.findElement(By.name("password")).sendKeys("Durga@421");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			WebElement ele=driver.findElement(By.xpath("//span[text()='Everything else']"));
			
			JavascriptExecutor js =(JavascriptExecutor) driver;
			
			String script  ="document.querySelector("+"//span[text()='Everything else']"+").scrollintoview()";
			
			js.executeScript(script, ele);
			
			
			Thread.sleep(5000);
			
			driver.quit();
			
			
			
			
				
			
}
}
