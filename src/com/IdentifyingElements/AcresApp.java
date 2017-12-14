package com.IdentifyingElements;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AcresApp {

	public AndroidDriver<MobileElement> driver;
	
	@Test
	public void testApp() throws Exception{
		File app = new File("C:\\Users\\DP\\Documents\\99acres_com.nnacres.app.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("appPackage","com.nnacres");
		caps.setCapability("deviceName","Redmi");
		caps.setCapability("platformVersion","6.0.1");
		caps.setCapability("platformName","Android");
		//caps.setCapability("appActivity","");
		caps.setCapability("app",app.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
	}
	@AfterMethod
	public void quitDriver(){
		driver.quit();
	}
	
	
}
