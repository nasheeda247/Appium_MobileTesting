package browser;
	
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.MobileBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class WebTesting {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");

			cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET\\drivers\\chromedriver_win32\\chromedriver.exe");
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
			driver.findElement(MobileBy.AccessibilityId("Continue with Facebook")).click();
			Thread.sleep(4000);
			System.out.println(driver.getContextHandles());
			System.out.println("Hello");
			driver.context("NATIVE_APP");


		}

	}


