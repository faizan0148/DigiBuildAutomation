/**
 * 
 */
package steps.admin;


import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import objectmodels.admin.AdminPanelObjectModel;
import util.Wait;

/**
 * @author faizan.zafar
 *
 */
public class AdminExecutionSteps {

	@When("^I Click the Create new button$")
	public void whenIClickCreateNew()
	{

		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		ap.createNewButton.click();
		Wait.untilPageIsReady(2000);

	}

	@And("^I submit the following values in create owner company$")
	public void createOwnerCompany(List<AdminStepModel> table) {

		Assert.assertNotNull(table);
		AdminStepModel sm = table.get(0);
		AdminPanelObjectModel ap = new AdminPanelObjectModel();

		ap.companyNameField.clear();
		ap.companyNameField.sendKeys(sm.companyName);
		Wait.untilPageIsReady(1000);
		//		Select companyType = new Select(ap.selectCompanyType);
		//		companyType.selectByVisibleText(sm.companyType);
		ap.selectCompanyType.click();
		Wait.untilPageIsReady(1000);
		
		// Selecting Company Type
		
		if (sm.companyType.equals("Project Owner")) {
			ap.ownerType.click();
			Wait.untilPageIsReady(1000);
		}
		else if (sm.companyType.equals("General Contractor")) {
			ap.gcType.click();
			Wait.untilPageIsReady(1000);
		}
		else if (sm.companyType.equals("Sub Contractor")) {
			ap.scType.click();
			Wait.untilPageIsReady(1000);
		}
		else if (sm.companyType.equals("Supplier")) {
			ap.supplierType.click();
			Wait.untilPageIsReady(1000);
		}

		Wait.untilPageIsReady(1000);
		ap.companyAddresField.clear();
		ap.companyAddresField.sendKeys(sm.address);
		Wait.untilPageIsReady(1000);
		ap.companyPhoneField.clear();
		ap.companyPhoneField.sendKeys(sm.phone);
		Wait.untilPageIsReady(1000);
		ap.companyCityField.clear();
		ap.companyCityField.sendKeys(sm.city);
		Wait.untilPageIsReady(1000);
		ap.companyFaxField.clear();
		ap.companyFaxField.sendKeys(sm.fax);
		Wait.untilPageIsReady(1000);
		ap.companyZipField.clear();
		ap.companyZipField.sendKeys(sm.zip);
		Wait.untilPageIsReady(1000);
		ap.companyCountryField.clear();
		ap.companyCountryField.sendKeys(sm.country);
		ap.companyStateField.clear();
		ap.companyStateField.sendKeys(sm.state);

		Wait.untilPageIsReady(2000);
		ap.submitButton.click();

		Wait.untilPageIsReady(5000);

	}

	@When("^I Click the Next Button$")
	public void iClickTheNextButton() throws Throwable {
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		ap.nextButton.click();
		Wait.untilPageIsReady(2000);
	}



	@And("^I submit the following values for new user$")
	public void iSubmitTheFollowingValuesForNewUser(List<AdminStepModel> table) throws Throwable {

		Assert.assertNotNull(table);
		AdminStepModel sm = table.get(0);
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		Wait.untilPageIsReady(2000);

		ap.firstNametextField.clear();
		ap.firstNametextField.sendKeys(sm.firstName);
		Wait.untilPageIsReady(1000);
		ap.lastNameTextField.clear();
		ap.lastNameTextField.sendKeys(sm.lastName);
		Wait.untilPageIsReady(1000);
		ap.emailTextField.clear();
		ap.emailTextField.sendKeys(sm.email);
		Wait.untilPageIsReady(1000);
		ap.roleTextField.clear();
		ap.roleTextField.sendKeys(sm.role);
		Wait.untilPageIsReady(2000);

		ap.inviteButton.click();
		Wait.untilPageIsReady(4000);
	}

	@When("^I click the Add New Button$")
	public void iClickTheAddNewButton() throws Throwable {
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		ap.addNewButton.click();
		Wait.untilPageIsReady(2000);
	}

	@When("^I Add the Default Cost Codes$")
	public void iAddTheDefaultCostCodes() throws Throwable {
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		ap.defaultCostCodeButton.click();
		Wait.untilPageIsReady(2000);
		ap.YesButton.click();
		Wait.untilPageIsReady(2000);
	}

	@And("^i click finish button$")
	public void iClickFinishButton() throws Throwable {
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		ap.finishButton.click();
		Wait.untilPageIsReady(5000);
	}

}
