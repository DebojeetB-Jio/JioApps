package app_Info;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObjectModel {
	
	public PageObjectModel(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
//	Hotstar 
	@AndroidFindBy(id="in.startv.hotstar:id/image")
	public List <WebElement> playVideo;
	
	@AndroidFindBy(id="in.startv.hotstar:id/btn_movie")
	public WebElement clickVideo;
	
	@AndroidFindBy(id="in.startv.hotstar:id/menu_item_image")
	public WebElement searchButton;
	
	@AndroidFindBy(id="in.startv.hotstar:id/extraInfo")
	public List <WebElement> searchedVideos;
	
	@AndroidFindBy(id="in.startv.hotstar:id/label")
	public List <WebElement> enterText;
	
	@AndroidFindBy(id="in.startv.hotstar:id/menu_item_text")
	public List <WebElement> sideOptions;

//	Jio Cinema
	
	@AndroidFindBy(id="com.jio.media.stb.ondemand:id/hrvText")
	public List <WebElement> notificationOptions;
	
	@AndroidFindBy(className="android.widget.ImageView")
	public List <WebElement> videoList;
	
	@AndroidFindBy(id="com.jio.media.stb.ondemand:id/btnReadMore")
	public WebElement ReadMore;
	
	@AndroidFindBy(id="com.jio.media.stb.ondemand:id/btnPlay")
	public WebElement WatchNow;
	
	@AndroidFindBy(id="com.jio.media.stb.ondemand:id/btnAddToWatch")
	public WebElement WatchList;
	
	@AndroidFindBy(className="android.widget.RelativeLayout")
	public List <WebElement> settingOptions;
	
	@AndroidFindBy(className="android.widget.TextView")
	public List <WebElement> searchResults;
	
	@AndroidFindBy(id="com.jio.media.stb.ondemand:id/lb_search_text_editor")
	public WebElement searchContent;
	
//	News 18
	
	@AndroidFindBy(id="com.jio.news18hindi:id/main_image")
	public List <WebElement> videoCategory;
	
//	@AndroidFindBy(className="android.widget.ImageView")
//	public List <WebElement> videoList;
	
	@AndroidFindBy(id="com.jio.news18hindi:id/guidedactions_item_title")
	public List <WebElement> exitButton;
	
	

//	Voot TV
	
//	@AndroidFindBy(className="android.widget.TextView")
//	public List <WebElement> searchResults;
	
	@AndroidFindBy(id="com.viacom18.tv.voot:id/lay_meta_container_show")
	public List <WebElement> movieList;
	
	@AndroidFindBy(id="com.viacom18.tv.voot:id/button")
	public List <WebElement> button;
	
	@AndroidFindBy(id="com.viacom18.tv.voot:id/watch_btn")
	public WebElement watchButton;
	
	@AndroidFindBy(id="com.viacom18.tv.voot:id/img_header")
	public List <WebElement> sideSelections;
	
	@AndroidFindBy(id="com.viacom18.tv.voot:id/img_show")
	public List <WebElement> movieImage;
	
//	Sony LIV
	
	@AndroidFindBy(id="com.jiotv.sonyliv:id/main_image")
	public List <WebElement> movieSelections;
	
//	@AndroidFindBy(className="android.widget.ImageView")
//	public List <WebElement> videoList;
	
	@AndroidFindBy(id="com.jiotv.sonyliv:id/menu_image")
	public List <WebElement> sideBar;
	
	@AndroidFindBy(id="com.jiotv.sonyliv:id/episode_myList")
	public WebElement addToMyList;
	
	@AndroidFindBy(className="android.widget.Button")
	public List <WebElement> subscribeButton;
	
	@AndroidFindBy(className="android.widget.LinearLayout")
	public List <WebElement> rechargeAmount;
	
//	Voot TV Updated
	
//	@AndroidFindBy(className="android.widget.TextView")
//	public List <WebElement> searchResults;
	
//	@AndroidFindBy(className="android.widget.ImageView")
//	public List <WebElement> videoList;
	
	
	
	
	
	
	
	
	
	
}





