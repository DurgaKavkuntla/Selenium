import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatePicker {
	

	public WebDriver driver;
	@Test
	public void test() throws InterruptedException{
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\DP\\Downloads\\Compressed\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Depart')]/../div/input")).click();
		
	Calendar cal = Calendar.getInstance();
//		
//		int month = cal.MONTH;
		
		Date d =new Date("1/1/2018");
		
		DateFormat dt = new SimpleDateFormat("MMMM/dd/YYYY");
		SimpleDateFormat d2 = new SimpleDateFormat("YYYYMMdd");
		
		String df = dt.format(d);
		
		String df2 = d2.format(d);
				
		
		System.out.println(df);
		
		System.out.println("df2------"+df2);
		
		String monyear= df.split("/")[0]+" "+df.split("/")[2];
		
		System.out.println(monyear);
		
		String dateidxpath= "//div[@id='fare_"+df2+"']";
		
		while(true){
			try{
			driver.findElement(By.xpath("//div[text()='"+monyear+"']")).isDisplayed();
			
			
			driver.findElement(By.xpath("//div[text()='"+monyear+"']")).click();
			
			driver.findElement(By.xpath(dateidxpath)).click();
			
			break;
			}
			
			catch(Exception e){
				
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(1000);
			}
		}
		
//		driver.quit();
	}
}
