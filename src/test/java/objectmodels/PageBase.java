/**
 * 
 */
package objectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.PropertiesContext;
import util.Wait;
import webdriver.WebDriverContext;

/**
 * @author faizan.zafar
 *
 */
public class PageBase {
	
	protected	String 		_url				= PropertiesContext.getInstance().getProperty("endToEndAutomationTest.url");
	protected 	String		_relativeUrl		= "";
	protected	String		_relativeUrlRegEx	= null;
	protected 	WebDriver 	_driver				= WebDriverContext.getInstance().getWebDriver();
	
	public PageBase() {
		PageFactory.initElements(_driver, this);
	}
	
	public void navigate() {
		navigateTo(_url);
	}

	public void navigateTo(String relativeUrl) {
        _driver.navigate().to(_url);
        Wait.untilPageIsReady();
    }
	
	public void navigateBack() {
		_driver.navigate().back();
		Wait.untilPageIsReady();
	}
	
	public String getCurrenturl() {
		return _driver.getCurrentUrl();
	}
	
	public void navigateForward() {
		_driver.navigate().forward();
		Wait.untilPageIsReady();
	}
	
	public void navigateRefresh() {
		_driver.navigate().refresh();
		Wait.untilPageIsReady();
	}
}
