package testApplications;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.PageObjectModel;
import app_Info.VootTV;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_Updated_VootTV extends VootTV {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void LaunchVootTV() throws InterruptedException, IOException {
		
		driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		PageObjectModel pom= new PageObjectModel(driver);
		System.out.println("..........Voot TV......... ");
				
		WebElement backgroundClick= driver.findElement(By.id("com.viacom18.tv.voot:id/masthead_gradient_image"));
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
				
				System.out.println("Continue execution");
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
		}
		
//		First Video
		
		System.out.println("Playing first video");
		pom.searchResults.get(9).click(); Thread.sleep(7000);
		System.out.println(pom.searchResults.get(1).getAttribute("text"));	
		pom.searchResults.get(1).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("First content played successfully");
		
//		Second Video
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
			
				System.out.println("Continue execution");
				System.out.println("Playing second video");
				pom.searchResults.get(10).click(); Thread.sleep(3000);
				pom.searchResults.get(10).click();
				Thread.sleep(55000);
				driver.navigate().back();
				System.out.println("Second content played successfully");
			
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("Playing second video");		
			pom.searchResults.get(10).click(); Thread.sleep(7000); 
			System.out.println(pom.searchResults.get(2).getAttribute("text"));
			pom.searchResults.get(2).click(); Thread.sleep(55000);
			driver.navigate().back(); Thread.sleep(5000);
			System.out.println("Second content played successfully");
		
		}
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
				
				backgroundClick.click();
				System.out.println("Continue execution");
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
		}
		
//		Third Video
		
		Thread.sleep(2000);
		System.out.println("Playing third video");				
		pom.searchResults.get(12).click(); Thread.sleep(7000); 
		System.out.println(pom.searchResults.get(2).getAttribute("text"));
		pom.searchResults.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Third content played successfully");
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
				
				backgroundClick.click();
				System.out.println("Continue execution");
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
		}
		
//		Fourth Video
		
		Thread.sleep(2000);
		System.out.println("Playing fourth video");				
		pom.searchResults.get(13).click(); Thread.sleep(7000); 
		System.out.println(pom.searchResults.get(2).getAttribute("text"));
		pom.searchResults.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Fourth content played successfully");
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
				
				backgroundClick.click();
				System.out.println("Continue execution");
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
		}
		
//		Fifth Video
		
		Thread.sleep(2000);
		System.out.println("Playing fifth video");				
		pom.searchResults.get(14).click(); Thread.sleep(7000); 
		System.out.println(pom.searchResults.get(2).getAttribute("text"));
		pom.searchResults.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Fifth content played successfully");
		
		
		try {			
			WebElement vootLogo= driver.findElement(By.id("com.viacom18.tv.voot:id/home_logo_imageView"));
			
			if(vootLogo.isDisplayed()) {
				
				backgroundClick.click();
				System.out.println("Continue execution");
			}}
					
		catch(NoSuchElementException e) {
			
			Thread.sleep(5000);
			System.out.println("Navigated back as logo was not displayed");
			driver.navigate().back();
		}
		
//		Sixth Video
		
		Thread.sleep(2000);
		System.out.println("Playing sixth video");				
		pom.searchResults.get(15).click(); Thread.sleep(7000); 
		System.out.println(pom.searchResults.get(2).getAttribute("text"));
		pom.searchResults.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Sixth content played successfully");
		
		System.out.println("Qutting Voot TV");
//		driver.quit();
	}
	
	
	

}
