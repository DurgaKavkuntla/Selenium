package prac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		
//		WebElement eleHyd= driver.findElement(By.xpath("//label[contains(text(),'FROM')]"));
//		
//		WebElement eleVij= driver.findElement(By.xpath("//label[contains(text(),'TO')]"));
//		
//		js.executeScript("document.querySelector("+"arguments[0].querySelector('input#src+label.db').innerHTML="+"HYDERBAD",eleHyd);
//		
//		js.executeScript("document.querySelector("+"arguments[0].querySelector('input#dest+label.db').innerHTML="+"HYDERBAD",eleVij);
//		
		
		SimpleDateFormat dt  = new SimpleDateFormat("dd-MMM-YYYY");
		
		String format= dt.format(new Date("1/1/2018"));
		System.out.println("formated fromdate is "+format);
	WebElement eleFromDate=driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]"));              
		//js.executeScript("arguments[0].setAttribute('data-caleng','"+format+"');",eleFromDate);
//		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']/descendant::div[@class='sbqs_c']"));
//		
//		for(int i =0;i<list.size();i++){
//			System.out.println(list.get(i).getText());
////			if(list.get(i).getText().contains("testing tools")){
////				
////				list.get(i).click();
////				break;
//			
		eleFromDate.click();
		
String monyear = format.split("-")[1]+" "+format.split("-")[2];

String date =format.split("-")[0];

System.out.println("monyear-->"+monyear+"\n"+"date---->"+date);
while(true){
	try{
	driver.findElement(By.xpath("//td[@class='monthTitle' and text()='"+monyear+"']")).isDisplayed();
	
	driver.findElement(By.xpath("//td[@class='wd day' and text()='"+date+"']")).click();
	}
	
	catch(Exception e){
		List<WebElement> elements=driver.findElements(By.xpath("//td[@class='next']/button"));
		
		for(int i=0;i<elements.size();i++){
			int x=elements.get(i).getLocation().getX();
			System.out.println(x);
			if(x!=0){
				elements.get(i).click();
			}
		}
	}
	
	
}
		//driver.quit();
		
		
	
}}
