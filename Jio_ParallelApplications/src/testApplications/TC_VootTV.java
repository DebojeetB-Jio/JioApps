package testApplications;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import app_Info.PageObjectModel;
import app_Info.VootTV;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_VootTV extends VootTV {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void LaunchVootTV() throws InterruptedException, IOException {
		
		driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		PageObjectModel pom= new PageObjectModel(driver);
		System.out.println("..........Voot TV......... ");
		
//		Home Section
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Vault\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(4).click(); Thread.sleep(4000);
		pom.button.get(1).click(); Thread.sleep(3000);	
		
//		First Video
		System.out.println("First Video to be played");

		pom.watchButton.click(); Thread.sleep(55000); driver.navigate().back();		 
		System.out.println("Play same video again");
		pom.watchButton.click(); Thread.sleep(55000); driver.navigate().back();
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("First video played successfully. Navigated to Home page");
			
		List<AndroidElement> sideOptions= driver.findElements(By.id("com.viacom18.tv.voot:id/header_label"));
		 
		for (int i=0; i<sideOptions.size(); i++) {
			
			String voot= sideOptions.get(i).getAttribute("text");
			System.out.println(voot);							
				
		}
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Vault\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(5).click(); Thread.sleep(4000);
		
//		Second Video
		System.out.println("Second Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Second video played successfully. Navigated to Home page");
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Vault\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(1).click(); Thread.sleep(4000);
		
//		Third Video
		System.out.println("Third Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(4000); 
		System.out.println("Third video played successfully. Navigated to Home page");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Vault\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(1).click(); Thread.sleep(4000);
		
//		Fourth Video
		System.out.println("Fourth Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); 
		System.out.println("Fourth video played successfully. Navigated to Home page");
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Originals\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(0).click(); Thread.sleep(4000);
		
//		Fifth Video
		System.out.println("Fifth Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back();
		System.out.println("Play same video again");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Fifth video played successfully. Navigated to Home page");
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Vault\").instance(0))").click();
		Thread.sleep(3000); pom.movieList.get(7).click(); Thread.sleep(4000);
		
//		Sixth Video
		System.out.println("Sixth Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Sixth video played successfully. Navigated to Home page");
		Thread.sleep(3000);

//		Seventh Video		
		Thread.sleep(4000);
		pom.movieImage.get(9).click(); Thread.sleep(4000);
		System.out.println("Seventh Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Seventh video played successfully. Navigated to Home page");
		Thread.sleep(3000);
		
//		Eighth Video		
		Thread.sleep(4000);
		pom.movieImage.get(10).click(); Thread.sleep(4000);
		System.out.println("Eighth Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Eighth video played successfully. Navigated to Home page");
		Thread.sleep(3000);	
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"Voot Originals\").instance(0))").click();
		Thread.sleep(3000);

//		Ninth Video		
		Thread.sleep(4000);
		pom.movieImage.get(7).click(); Thread.sleep(4000);
		System.out.println("Ninth Video to be played");
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		System.out.println("Ninth video played successfully. Navigated to Home page");

		System.out.println("Playing same video again after navigating to Home page");
		pom.movieImage.get(7).click();	
		pom.watchButton.click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back();
		
		Thread.sleep(5000);
		System.out.println("Qutting Voot TV");
		driver.quit();
	}
	
	
	

}
