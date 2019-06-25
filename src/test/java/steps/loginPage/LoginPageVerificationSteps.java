/**
 * 
 */
package steps.loginPage;

//import org.testng.Assert;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import objectmodels.login.loginObjectModel;
import util.Wait;

/**
 * @author faizan.zafar
 *
 */
public class LoginPageVerificationSteps {

	@Then("^Valid Login Page is Open$")
	public void searchResultsAreDisplayed()
	{
		loginObjectModel lp = new loginObjectModel();
		
		Assert.assertTrue(lp.loginButton.isDisplayed());
		Wait.untilErrorMessagesShow(3000);
		
	}
}
