package com.selenium.work;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TakeScreenshotDemo {
	
	WebDriver driver;

	@Test(enabled=false)
	public  void test() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.facebook.com");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\DP\\myworkspace\\AppiumDemo\\img.png"));
			
	}
	
	@Test(enabled=true)
	
	public void test1() throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("naveenk");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test@123");
		
		WebElement eleLogin = driver.findElement(By.cssSelector("input[value='Login']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//		js.executeScript("arguments[0].click();",eleLogin);
//		
//		Actions action = new Actions(driver);
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		WebElement target = driver.findElement(By.xpath("//a[text()='Campaigns']"));
//		
//		wait.until(ExpectedConditions.visibilityOf(target));
//		
//		action.moveToElement(target)
//		.click(driver.findElement(By.cssSelector("a[title='Print Campaigns']")))
//		.perform();
		
		
		String bgcolor=eleLogin.getCssValue("backgroundColor");
		String color="rgb(200,0,0)";
		for(int i=1;i<=20;i++){
		
		
		js.executeScript("arguments[0].style.backgroundColor='"+bgcolor+"'",eleLogin);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",eleLogin);
		}
		
		
		
		
		
		
		
		
		
	}
		

}
