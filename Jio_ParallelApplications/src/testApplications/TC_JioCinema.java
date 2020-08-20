package testApplications;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.PageObjectModel;
import app_Info.JioCinema;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_JioCinema extends JioCinema {
	
	@Test
	public void automateJioCinema() throws IOException, InterruptedException {
	
	AndroidDriver<AndroidElement> driver= Capabilities();	
	PageObjectModel pom= new PageObjectModel(driver);
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	System.out.println("..........JioCinema......... ");
	
//	Click on Movies section
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Movies\").instance(0))").click();
	pom.notificationOptions.get(2).click();
	System.out.println("Navigated to Movies section");
			
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Recently Added\").instance(0))").click();
	Thread.sleep(3000);	
	pom.videoList.get(10).click();
	
//	Details Screen 
	
//	First Content
	
	pom.ReadMore.click(); 
	pom.WatchList.click(); Thread.sleep(4000);
	System.out.println("First content to be played");
	pom.WatchNow.click(); Thread.sleep(55000);
	driver.navigate().back(); 
	System.out.println("First content played successfully");
	
//	Second Content
	System.out.println("Second content to be played");
	pom.videoList.get(2).click(); Thread.sleep(5000);
	pom.WatchNow.click(); Thread.sleep(55000); driver.navigate().back();
	System.out.println("Second content played successfully");

//	Third Content
	System.out.println("Third content to be played");
	pom.videoList.get(3).click(); Thread.sleep(5000);
	pom.WatchNow.click(); Thread.sleep(55000); driver.navigate().back();
	System.out.println("Third content played successfully");
	driver.navigate().back(); Thread.sleep(3000);
	
//	Navigate back to Home Page
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Settings\").instance(0))").click();
	pom.notificationOptions.get(6).click(); Thread.sleep(3000);
	
//	Clear Cache and Clicking on T&C's
	pom.settingOptions.get(5).click(); Thread.sleep(5000);
	pom.settingOptions.get(3).click(); Thread.sleep(5000);	
	driver.navigate().back();

//	Play audio 
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Music\").instance(0))").click();
	pom.notificationOptions.get(4).click();
	Thread.sleep(3000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Trending Music Videos\").instance(0))").click();
	Thread.sleep(3000);
	
	System.out.println("Fourth Content to be played");
	pom.videoList.get(9).click(); Thread.sleep(55000);		
	driver.navigate().back(); Thread.sleep(4000);
	
	System.out.println("Fifth Content to be played");
	pom.videoList.get(10).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
	
	System.out.println("Sixth Content to be played");
	pom.videoList.get(11).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
	
		System.out.println("Seventh Content to be played");
		pom.videoList.get(8).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(4000);	
		

	
	System.out.println("Eigth Content to be played");
	pom.videoList.get(9).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
	
	System.out.println("Ninth Content to be played");
	pom.videoList.get(10).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
	
	System.out.println("Tenth Content to be played");
	pom.videoList.get(11).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);

		
		System.out.println("Eleventh Content to be played");
		pom.videoList.get(8).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(4000);	
	
	
	System.out.println("Twelfth Content to be played");
	pom.videoList.get(10).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
	
	System.out.println("Thirteenth Content to be played");
	pom.videoList.get(11).click(); Thread.sleep(55000);
	driver.navigate().back(); Thread.sleep(4000);
		
	driver.navigate().back(); Thread.sleep(4000);
	System.out.println("Quitting JioCinema Application");
	driver.quit();
	
	}
	}



