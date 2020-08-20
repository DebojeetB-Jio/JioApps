package testApplications;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.PageObjectModel;
import app_Info.ZEE5;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_ZEE5 extends ZEE5 {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void LaunchVootTV() throws InterruptedException, IOException {
		
		driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		PageObjectModel pom= new PageObjectModel(driver);
		System.out.println("..........ZEE5......... ");
		
		try {
			
			WebElement registerButton= driver.findElement(By.id("com.zee5.aosp:id/already_register"));
			
			if (registerButton.isDisplayed()) {
				
				registerButton.click(); 
				System.out.println("Waiting for Device Authentication");
				Thread.sleep(25000);
				WebElement continueButton= driver.findElement(By.id("com.zee5.aosp:id/continue_button_reg"));
				continueButton.click();				
				System.out.println("Authentication done");
			}
			
		}
		
		catch(NoSuchElementException e) {
			
			System.out.println("Continue Normal Execution");
		}
		
	}
	
	
	

}
