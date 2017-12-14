package prac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsElementVisibleDemo {
	WebDriver driver;
	
	@Test(enabled=false)
	
	public void test(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		WebElement ele= driver.findElement(By.xpath("//input[@name='agreeTerms']"));
		
		System.out.println(ele.isDisplayed());
		
		System.out.println(ele.isEnabled());
		
		System.out.println(ele.isSelected());
		
		System.out.println("for submit button");
		
		WebElement eleafter= driver.findElement(By.xpath("//div[@class='myButton']"));
		
		System.out.println(eleafter.isEnabled());
		
		System.out.println(eleafter.isSelected());
		
		ele.click();
		
		System.out.println("after click on agree  " +ele.isSelected());
		
		
	}
	
	@Test(enabled=true)
	
	public void getSearchValues(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
				
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']/descendant::div[@class='sbqs_c']"));
		
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().contains("testing tools")){
//				
//				list.get(i).click();
//				break;
			
		}
		
		driver.quit();
		
		
	}

}
