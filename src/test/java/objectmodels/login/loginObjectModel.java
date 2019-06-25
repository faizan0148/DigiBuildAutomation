/**
 * 
 */
package objectmodels.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import objectmodels.PageBase;

/**
 * @author faizan.zafar
 *
 */
public class loginObjectModel extends PageBase {
	
	public loginObjectModel()
	{
		
	}
	
	@FindBy(how=How.XPATH, using="*//span[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(how=How.XPATH, using="*//input[@name='email']")
	public WebElement emailField;
	
	@FindBy(how=How.XPATH, using="*//input[@name='password']")
	public WebElement passwordField;
	
	@FindBy(how=How.XPATH, using="//button[@id='sgnBt']")
	public WebElement signInButton;
	
}
