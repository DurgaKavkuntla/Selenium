package com.WhatsApp;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AmazonDemo {

	public AndroidDriver<MobileElement> driver;
	@Test
	public void launchDriver() throws Exception{
		
		//File app = new File("C:\\Users\\DP\\Documents\\Faasos_com.done.faasos.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName", "Redmi");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.done.faasos");
		caps.setCapability("appActivity", "com.done.faasos.ui.Activity_OnBoarding");
		//caps.setCapability("app",app.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void quitDriver(){
		driver.quit();
	}
	
}
