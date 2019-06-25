/**
 * 
 */
package webdriver;

import java.io.IOException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import util.PropertiesContext;

/**
 * @author faizan.zafar
 *
 */
public class WebDriverContext {

	private static WebDriverContext _instance;

	private WebDriver _webDriver = null;

	private WebDriverContext() {
	}

	public static synchronized WebDriverContext getInstance() {
		if(_instance == null) {
			_instance = new WebDriverContext();
		}

		return _instance;
	}

	public WebDriver getWebDriver() {
		if (_webDriver == null) {
			createSession();
		}

		return _webDriver;
	}

	public void createSession() {
		if (_webDriver != null) {
			cleanUp();
		}

		String browser = PropertiesContext.getInstance().getProperty("endToEndAutomationTest.selenium.browser");
		_webDriver = WebDriverFactory.createWebDriver(browser);
	}

	public void cleanUp() {
		if (_webDriver != null) {
			_webDriver.close();
			_webDriver.quit();

			// TODO: Investigate how to close orphaned chromedriver.exe.
			// This code works if the tests are run sequentially, but not in parallel.

			Process p;
			try {
				String command = "";

				if (Platform.getCurrent().is(Platform.WINDOWS))
				{
					command = "TASKKILL /F /IM chromedriver.exe";
				}
				else if (Platform.getCurrent().is(Platform.MAC))
				{
					command = "pkill -9 chromedriver";
				}

				p = Runtime.getRuntime().exec(command);
				p.waitFor();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			_webDriver = null;
		}
	}


}
