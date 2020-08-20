package app_Info;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZEE5 {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws IOException{
	
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "JHSD200");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
	cap.setCapability("appPackage", "com.zee5.aosp");
	cap.setCapability("appActivity", "com.zee5.player.activities.SplashActivity");

	AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	return driver;
	
	
	}

}
