package testApplications;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import app_Info.PageObjectModel;
import app_Info.SonyLIV;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_SonyLIV extends SonyLIV {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void LaunchVootTV() throws InterruptedException, IOException {
		
		driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		PageObjectModel pom= new PageObjectModel(driver);
		System.out.println("..........Sony LIV......... ");
		Thread.sleep(10000);
	
		
//		Shows Section
		
		pom.sideBar.get(3).click();  Thread.sleep(8000);
		System.out.println("Playing first video");
		pom.movieSelections.get(0).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back();
		System.out.println("First Video played successfully"); Thread.sleep(5000);
	
		try {
			
			if (pom.addToMyList.isDisplayed()) {
								
				driver.navigate().back();
				System.out.println("Navigated back from add to my list ");
				
			}
					}
		catch(NoSuchElementException e){
			
			System.out.println("Working as normal");
		}
		
		
		
		pom.sideBar.get(3).click();  Thread.sleep(5000);
		
		System.out.println("Playing second video");
		pom.movieSelections.get(1).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back();
		System.out.println("Second Video played successfully");
		
		try {
			
			if (pom.addToMyList.isDisplayed()) {
								
				driver.navigate().back();
				System.out.println("Navigated back from add to my list ");
				
			}
					}
		catch(NoSuchElementException e){
			
			System.out.println("Working as normal");
		}

		pom.sideBar.get(3).click();  Thread.sleep(8000);
		
		System.out.println("Playing third video");
		pom.movieSelections.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back();
		System.out.println("Third Video played successfully");
		
		try {
			
			if (pom.addToMyList.isDisplayed()) {
								
				driver.navigate().back();
				System.out.println("Navigated back from add to my list ");
				
			}
					}
		catch(NoSuchElementException e){
			
			System.out.println("Working as normal");
		}
		pom.sideBar.get(3).click();  Thread.sleep(8000);
		
		System.out.println("Playing fourth video");
		pom.movieSelections.get(3).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back();
		System.out.println("Fourth Video played successfully");
		
		try {
			
			if (pom.addToMyList.isDisplayed()) {
								
				driver.navigate().back();
				System.out.println("Navigated back from add to my list ");
				
			}
					}
		catch(NoSuchElementException e){
			
			System.out.println("Working as normal");
		}
		
//		Entertainment Section
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
				
		System.out.println("Playing fifth video");
		pom.movieSelections.get(0).click();	Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back(); 
		System.out.println("Fifth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing sixth video");
		pom.movieSelections.get(1).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back(); 
		System.out.println("Sixth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing seventh video");
		pom.movieSelections.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); Thread.sleep(5000); driver.navigate().back(); 
		System.out.println("Seventh Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing eighth video");
		pom.movieSelections.get(3).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Eighth Video played successfully");
		
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing ninth video");
		pom.movieSelections.get(4).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Ninth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing tenth video");
		pom.movieSelections.get(5).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Tenth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing eleventh video");
		pom.movieSelections.get(6).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Eleventh Video played successfully");
		
//		Movies Section
		
		pom.sideBar.get(4).click();  Thread.sleep(8000);
		
		System.out.println("Playing twelfth video");
		pom.movieSelections.get(0).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Twelfth Video played successfully");
		
		pom.sideBar.get(4).click();  Thread.sleep(8000);
		
		System.out.println("Playing thirteenth video");
		pom.movieSelections.get(1).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Thirteenth Video played successfully");
		
		pom.sideBar.get(4).click();  Thread.sleep(8000);
		
		System.out.println("Playing fourteenth video");
		pom.movieSelections.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Fourteenth Video played successfully");
		
		
//		Entertainment Section
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
				
		System.out.println("Playing fifteenth video");
		pom.movieSelections.get(0).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Fifteenth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing sixteenth video");
		pom.movieSelections.get(1).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Sixteenth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing seventeenth video");
		pom.movieSelections.get(2).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Seventeenth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing eighteenth video");
		pom.movieSelections.get(3).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Eighteenth Video played successfully");
		
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing ninteenth video");
		pom.movieSelections.get(4).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Ninteenth Video played successfully");
		
		pom.sideBar.get(7).click();  Thread.sleep(8000);
		
		System.out.println("Playing twentieth video");
		pom.movieSelections.get(5).click(); Thread.sleep(55000);
		driver.navigate().back(); driver.navigate().back(); Thread.sleep(5000);
		System.out.println("Twentieth Video played successfully");
		
		Thread.sleep(3000);
		System.out.println("Quitting Application");
		driver.quit();
	}
	
	
	

}
