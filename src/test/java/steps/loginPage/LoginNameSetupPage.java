/**
 * 
 */
package steps.loginPage;

import cucumber.api.java.en.Given;
import objectmodels.login.loginObjectModel;
import util.Wait;

/**
 * @author faizan.zafar
 *
 */
public class LoginNameSetupPage {
	
	@Given("^The Login Page is Open$")
	public void navigateToDigiBuildLoginpage()
	{
	
		loginObjectModel lp = new loginObjectModel();
		lp.navigate();
		
	}
	
	@Given("^I am login as an admin$")
	public void loginAsAnAdmin() {
		navigate();
		loginObjectModel loginPage = new loginObjectModel();
		loginPage.emailField.sendKeys("admin");
		Wait.untilPageIsReady();
		loginPage.passwordField.sendKeys("Test@1234");
		Wait.untilPageIsReady();
		loginPage.loginButton.click();
		Wait.untilPageIsReady();
	}
	
	
	private void navigate() {
		loginObjectModel loginPage = new loginObjectModel();
		loginPage.navigate();
		Wait.untilPageIsReady();
	}

}
