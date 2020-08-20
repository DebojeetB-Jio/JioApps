package testApplications;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.News18;
import app_Info.PageObjectModel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_News18 extends News18 {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void LaunchNews18() throws MalformedURLException, InterruptedException {
		
		driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		PageObjectModel pom= new PageObjectModel(driver);
		System.out.println("..........News18......... ");
		
		boolean title = driver.findElement(By.id("com.jio.news18hindi:id/tvChannelName")).isDisplayed();
				
//		Playing multiple videos to check stability
		
		System.out.println("First Video to be played");
		pom.videoCategory.get(0).click(); pom.videoCategory.get(0).click();
		Thread.sleep(55000);
		System.out.println("First Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Second Video to be played");
		pom.videoCategory.get(1).click(); pom.videoCategory.get(1).click();
		Thread.sleep(55000);
		System.out.println("Second Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Third Video to be played");
		
	     try {		
		 		
	    	 WebElement exitPage= driver.findElement(By.id("com.jio.news18hindi:id/guidance_title"));
	    	 
	    	 if (exitPage.isDisplayed()) {			
				
				pom.exitButton.get(0).click();
				System.out.println("Navigated to If Condition as exit page is displayed");
							
				Thread.sleep(10000);
							    
			}
	     }
	     
	     catch(NoSuchElementException e) {
	    	 
	    	 System.out.println("Continuing normal execution"); Thread.sleep(5000);
	    	 
	     }
		pom.videoCategory.get(2).click(); pom.videoCategory.get(2).click();
		Thread.sleep(55000);
		System.out.println("Third Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Fourth Video to be played");
		
	     try {		
	 		
	    	 WebElement exitPage= driver.findElement(By.id("com.jio.news18hindi:id/guidance_title"));
	    	 
	    	 if (exitPage.isDisplayed()) {			
				
				pom.exitButton.get(0).click();
				System.out.println("Navigated to If Condition as exit page is displayed");
							
				Thread.sleep(10000);
							    
			}
	     }
	     
	     catch(NoSuchElementException e) {
	    	 
	    	 System.out.println("Continuing normal execution"); Thread.sleep(5000);
	    	 
	     }
		
		
		
		pom.videoCategory.get(3).click(); pom.videoCategory.get(3).click();
		Thread.sleep(55000);
		System.out.println("Fourth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		

     try {		
		
    	 WebElement exitPage= driver.findElement(By.id("com.jio.news18hindi:id/guidance_title"));
    	 
    	 if (exitPage.isDisplayed()) {			
			
			pom.exitButton.get(0).click();
			System.out.println("Navigated to If Condition as exit page is displayed");
						
			Thread.sleep(10000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Daily Breaking\").instance(0))").click();
		    
		}
     }
     
     catch (NoSuchElementException e){

		System.out.println("Continuing normal execution");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Daily Breaking\").instance(0))").click();
     }
				
		System.out.println("Fifth Video to be played");
		pom.videoCategory.get(1).click(); pom.videoCategory.get(1).click();
		Thread.sleep(55000);
		System.out.println("Fifth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Sixth Video to be played");
		pom.videoCategory.get(2).click(); pom.videoCategory.get(2).click();
		Thread.sleep(55000);
		System.out.println("Sixth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Seventh Video to be played");
		pom.videoCategory.get(3).click(); pom.videoCategory.get(3).click();
		Thread.sleep(55000);
		System.out.println("Seventh Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Eighth Video to be played");
		
	     try {		
	 		
	    	 WebElement exitPage= driver.findElement(By.id("com.jio.news18hindi:id/guidance_title"));
	    	 
	    	 if (exitPage.isDisplayed()) {			
				
				pom.exitButton.get(0).click();
				System.out.println("Navigated to If Condition as exit page is displayed");
							
				Thread.sleep(10000);
							    
			}
	     }
	     
	     catch (NoSuchElementException e){

			System.out.println("Continuing normal execution");
			Thread.sleep(5000);
	     }
		
		
		
		
		
		pom.videoCategory.get(4).click(); pom.videoCategory.get(3).click();
		Thread.sleep(55000);
		System.out.println("Eighth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Aaj Ki Taaza Khabar\").instance(0))").click();
		Thread.sleep(3000);
		
		System.out.println("Ninth Video to be played");
		pom.videoList.get(1).click(); pom.videoList.get(1).click();
		Thread.sleep(55000);
		System.out.println("Ninth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Tenth Video to be played");
		pom.videoCategory.get(2).click(); pom.videoCategory.get(2).click();
		Thread.sleep(55000);
		System.out.println("Tenth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Eleventh Video to be played");
		pom.videoCategory.get(3).click(); pom.videoCategory.get(3).click();
		Thread.sleep(55000);
		System.out.println("Eleventh Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Twelfth Video to be played");
		pom.videoCategory.get(4).click(); pom.videoCategory.get(3).click();
		Thread.sleep(55000);
		System.out.println("Twelfth Video is played successfully");
		driver.navigate().back(); Thread.sleep(5000);
		
		System.out.println("Quitting News18 Application");
		Thread.sleep(10000);
		driver.quit();
	}
	
	
	

}
