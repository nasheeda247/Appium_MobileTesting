package browser;

	
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.interactions.touch.TouchActions;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.MobileBy;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class Swipe {

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "160316004865");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
			cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET\\drivers\\chromedriver_win32\\chromedriver.exe");
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
			driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
			driver.findElement(MobileBy.AccessibilityId("Search")).sendKeys("Math");
			driver.hideKeyboard();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Doodling in math: Stars\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Doodling in math: Stars\")"));
			
			
		
		}

	}


