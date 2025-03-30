package org.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Sample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options option=new UiAutomator2Options();
		option.setCapability("deviceName", "Arul");
		option.setCapability("app", "C:\\Users\\HP\\eclipse-workspace\\AppiumDemo\\src\\test\\resources\\ApiDemos-debug.apk");
		option.setCapability("appPackage","io.appium.android.apis");
		
		//option.setCapability("appActivity","io.appium.android.apis.view.AutoComplete1");
		option.setCapability("appActivity","io.appium.android.apis.view.DragAndDropDemo");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//driver.setClipboardText("India");
		//driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys(driver.getClipboardText());
		
		System.out.println("Ok");
		
		
	}

}
