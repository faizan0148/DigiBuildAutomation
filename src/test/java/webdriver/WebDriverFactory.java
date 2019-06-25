/**
 * 
 */
package webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author faizan.zafar
 *
 */
public class WebDriverFactory {
	public static WebDriver createWebDriver(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			if (Platform.getCurrent().is(Platform.WINDOWS)) {
				System.setProperty("webdriver.chrome.driver", "./external/webdrivers/chromedriver_win32/chromedriver.exe");
			}
			else if (Platform.getCurrent().is(Platform.MAC)) {
				System.setProperty("webdriver.chrome.driver", "external/webdrivers/chromedriver_mac64/chromedriver");
			}
			
			return new ChromeDriver();
		}
		
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			if(Platform.getCurrent().is(Platform.WINDOWS)) {
				System.setProperty("webdriver.gecko.driver", "./external/webdrivers/geckodriver-v0.20.1-win64/geckodriver.exe");
			}
			else if(Platform.getCurrent().is(Platform.MAC)) {
				System.setProperty("webdriver.gecko.driver", "external/webdrivers/geckodriver-v0.20.1-macos.tar/geckodriver");
			}
			
			return new FirefoxDriver();
		}
		
		return null;
	}

}
