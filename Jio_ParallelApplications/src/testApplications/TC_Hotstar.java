package testApplications;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.Hotstar;
import app_Info.PageObjectModel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_Hotstar extends Hotstar {
	
	@Test
	public void automateHotstar() throws IOException, InterruptedException {
	
	AndroidDriver<AndroidElement> driver= Capabilities();	
	PageObjectModel pom= new PageObjectModel(driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	System.out.println("..........Hotstar......... ");
	
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Specials & Latest Movies\").instance(0))");
	Thread.sleep(3000);
	 System.out.println("Click on Video");
	 
	 pom.playVideo.get(1).click(); pom.playVideo.get(1).click();
		 
	 System.out.println("Playing first video");
	 
	 pom.clickVideo.click(); Thread.sleep(55000);	 
	 	 
	 driver.navigate().back(); 
	 System.out.println("Playing same video again");
	 pom.clickVideo.click(); Thread.sleep(55000);	
	 driver.navigate().back(); Thread.sleep(5000); driver.navigate().back(); 
	 
	 try {
		 
		 if(pom.clickVideo.isDisplayed()) {
			 
			 driver.navigate().back();
		 }
	 }
	catch(NoSuchElementException e) {
		
		
	}
	 
	 
	 Thread.sleep(5000);
	 System.out.println("Navigated back to Main page");
		 
	 pom.playVideo.get(4).click(); pom.playVideo.get(1).click();	 	
	 
	 Thread.sleep(5000);
	 System.out.println("Playing second video");
	 pom.clickVideo.click(); Thread.sleep(55000);
	 driver.navigate().back(); Thread.sleep(5000);
	 System.out.println("Play same video again");
	 pom.clickVideo.click(); Thread.sleep(55000);
	 driver.navigate().back(); Thread.sleep(5000); driver.navigate().back();
	 System.out.println("Navigated back to Main page");
	 driver.navigate().back();
	 
//	 Search Content	 
	 pom.searchButton.click(); pom.searchButton.click();
	 Thread.sleep(4000);
	 
	 System.out.println("Entering Search Content");
	 pom.enterText.get(18).click(); pom.enterText.get(18).click(); 
	 pom.enterText.get(15).click(); pom.enterText.get(15).click();
	 pom.enterText.get(14).click(); pom.enterText.get(14).click();
	 pom.enterText.get(17).click(); pom.enterText.get(17).click();
	 pom.enterText.get(19).click(); pom.enterText.get(19).click();
	 pom.enterText.get(18).click(); pom.enterText.get(18).click();
	 
	 System.out.println("Playing third video"); Thread.sleep(4000);	 	 
	 pom.searchedVideos.get(8).click(); pom.searchedVideos.get(2).click(); 
	 Thread.sleep(55000); driver.navigate().back();
	 Thread.sleep(10000 );
	 System.out.println("Playing fourth video");
	 pom.searchedVideos.get(0).click();  pom.searchedVideos.get(0).click(); Thread.sleep(55000);
	 driver.navigate().back(); driver.navigate().back();
//	 driver.navigate().back(); 
	 Thread.sleep(5000);
	 System.out.println("Navigated Back to main page");
	 
	 driver.navigate().back(); Thread.sleep(5000);
	 
	 try {
		 
		 WebElement title= driver.findElement(By.id("in.startv.hotstar:id/menu_title"));
		 
		 if(title.isDisplayed()) {
			 
			 driver.navigate().back();
			 Thread.sleep(5000);
		 }}
		 
	catch(NoSuchElementException e) {
		
		System.out.println("Continuing execution");
	}
		 
	 
	 
	 
	 
//	 Go to Account

	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Channels\").instance(0))").click();
	 Thread.sleep(3000);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Account\").instance(0))").click();
	 
	 pom.sideOptions.get(7).click();
	 Thread.sleep(10000);
	 driver.navigate().back(); Thread.sleep(5000);
	 System.out.println("Quitting Hotstar Application");
	 driver.quit();
	
	}
	}



