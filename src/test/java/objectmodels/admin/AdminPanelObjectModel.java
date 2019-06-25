/**
 * 
 */
package objectmodels.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import objectmodels.PageBase;

/**
 * @author faizan.zafar
 *
 */
public class AdminPanelObjectModel extends PageBase{

	public AdminPanelObjectModel() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.XPATH, using=".//div[text()='Company Setup']")
	public WebElement companySteupTitle;
	
	@FindBy(how=How.XPATH, using="*//input[@name='companyName']")
	public WebElement companyNameField;
	
	@FindBy(how=How.XPATH, using=".//span[text()='Create New']")
	public WebElement createNewButton;
	
	@FindBy(how=How.XPATH, using=".//div[text()='Select Company Type *']")
	public WebElement selectCompanyType;
	
	@FindBy(how=How.NAME, using="address")
	public WebElement companyAddresField;
	
	@FindBy(how=How.NAME, using="phone")
	public WebElement companyPhoneField;
	
	@FindBy(how=How.NAME, using="fax")
	public WebElement companyFaxField;
	
	@FindBy(how=How.NAME, using="city")
	public WebElement companyCityField;
	
	@FindBy(how=How.NAME, using="state")
	public WebElement companyStateField;
	
	@FindBy(how=How.NAME, using="country")
	public WebElement companyCountryField;
	
	@FindBy(how=How.NAME, using="zip")
	public WebElement companyZipField;
	
	@FindBy(how=How.XPATH, using=".//span[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(how=How.XPATH, using=".//span[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(how=How.XPATH, using=".//span[text()='Edit Profile']")
	public WebElement editProfileButton;
	
	@FindBy(how=How.XPATH, using="*//div[text()='Basic Information']")
	public WebElement basicInfoTitle;
	
	@FindBy(how=How.XPATH, using="*//div[text()='Participants']")
	public WebElement participantsTitle;
	
	@FindBy(how=How.XPATH, using="*//li[@data-value='PO']")
	public WebElement ownerType;
	
	@FindBy(how=How.XPATH, using="*//li[@data-value='GC']")
	public WebElement gcType;
	
	@FindBy(how=How.XPATH, using="*//li[@data-value='SC']")
	public WebElement scType;
	
	@FindBy(how=How.XPATH, using="*//li[@data-value='SP']")
	public WebElement supplierType;
	
	@FindBy(how=How.NAME, using="firstName")
	public WebElement firstNametextField;
	
	@FindBy(how=How.NAME, using="lastName")
	public WebElement lastNameTextField;
	
	@FindBy(how=How.NAME, using="email")
	public WebElement emailTextField;
	
	@FindBy(how=How.NAME, using="role")
	public WebElement roleTextField;
	
	@FindBy(how=How.XPATH, using="*//div[text()='Participants']")
	public WebElement addParticipantsTitle;
	
	@FindBy(how=How.XPATH, using="*//span[text()='Add New']")
	public WebElement addNewButton;
	
	@FindBy(how=How.XPATH, using="*//span[text()='Invite']")
	public WebElement inviteButton;
	
	public WebElement getParticipantEmailAddress(String email)
    {
        String Xpath = "*//td[text()='"+email+"']";
        WebElement particpantEmail = _driver.findElement(By.xpath(Xpath));
        //WebElement selectElements = _driver.FindElement(By.xpath(Xpath));
        return particpantEmail;
    }
	
	@FindBy(how=How.XPATH, using="*//div[text()='Cost Codes']")
	public WebElement costCodesTitle;
	
	@FindBy(how=How.XPATH, using="*//button/span[text()='Use Default Cost Codes']")
	public WebElement defaultCostCodeButton;
	
	@FindBy(how=How.XPATH, using="*//button/span[text()='Finish']")
	public WebElement finishButton;
	
	@FindBy(how=How.XPATH, using="*//button/span[text()='Yes']")
	public WebElement YesButton;
}
