package prac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusCalendar {

	public WebDriver driver;
	
@Test(enabled=true)
	
	public void getSearchValues(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).sendKeys("Vijayawada");
		
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		
		SimpleDateFormat dt  = new SimpleDateFormat("ddMMMYYYY");
		
		String format= dt.format(new Date("1/1/2018"));
		
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
