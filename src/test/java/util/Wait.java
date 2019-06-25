/**
 * 
 */
package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.WebDriverContext;

/**
 * @author faizan.zafar
 *
 */
public class Wait {
	private static int timeout_seconds = 120;

	public static void untilPageIsReady() {
        untilPageIsReady(3000);
	}
	
	public static void untilErrorMessagesShow() {
		untilErrorMessagesShow(5000);
	}

	public static void untilPageIsReady(long initialDelayMillis) {
		// This sleep of 1 second is intentional, since click() does not wait for the next page to load.
		try {
			Thread.sleep(initialDelayMillis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriver driver = WebDriverContext.getInstance().getWebDriver();
		
	    new WebDriverWait(driver, timeout_seconds).until((ExpectedCondition<Boolean>) wd ->
	            ((JavascriptExecutor) wd).executeScript("return 'undefined' == typeof window.jQuery && 'undefined' == typeof Sys || 'undefined' != typeof window.jQuery && jQuery.isReady && jQuery.active == 0 || 'undefined' != typeof window.Sys && !Sys.WebForms.PageRequestManager.getInstance().get_isInAsyncPostBack()").equals(true));
	}
	
	public static void untilErrorMessagesShow(long initialDelayMillis) {
		// This sleep of 1 second is intentional, since click() does not wait for the next page to load.
		try {
			Thread.sleep(initialDelayMillis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriver driver = WebDriverContext.getInstance().getWebDriver();
		
	    new WebDriverWait(driver, timeout_seconds).until((ExpectedCondition<Boolean>) wd ->
	            ((JavascriptExecutor) wd).executeScript("return 'undefined' == typeof window.jQuery && 'undefined' == typeof Sys || 'undefined' != typeof window.jQuery && jQuery.isReady && jQuery.active == 0 || 'undefined' != typeof window.Sys && !Sys.WebForms.PageRequestManager.getInstance().get_isInAsyncPostBack()").equals(true));
	}
	
}
