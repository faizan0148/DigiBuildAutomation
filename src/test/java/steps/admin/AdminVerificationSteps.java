/**
 * 
 */
package steps.admin;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
//import junit.framework.Assert;
import objectmodels.admin.AdminPanelObjectModel;
import objectmodels.login.loginObjectModel;
import util.Wait;
import junit.framework.Assert;
//import org.testng.Assert;

/**
 * @author faizan.zafar
 *
 */
public class AdminVerificationSteps {
	
	
	@Then("^Valid Admin page is open$")
	public void searchResultsAreDisplayed()
	{
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		
		Assert.assertTrue(ap.companySteupTitle.isDisplayed());
		Wait.untilErrorMessagesShow(2000);
		
	}
	
	@Then("^Company Setup page is open$")
	public void companySetuppage()
	{
//		AdminPanelObjectModel ap = new AdminPanelObjectModel();
//		
//		Assert.assertTrue(ap.companyNameField.isDisplayed());
//		Wait.untilErrorMessagesShow(3000);
		
	}
	
	@Then("^Basic Information Page will open$")
	public void basicInfoPage()
	{
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		
		Assert.assertTrue(ap.basicInfoTitle.isDisplayed());
		Wait.untilPageIsReady(2000);
		
	}

	@Then("^Add Participant page will be displayed$")
	public void addParticipantPageWillBeDisplayed() throws Throwable {
		
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		
		Assert.assertEquals(ap.addParticipantsTitle.getText().toString(),"PARTICIPANTS");
		Wait.untilPageIsReady(1000);
		
	}

	
	@Then("^Participant is displayed in the list$")
	public void iParticipantisdisplayedinthelist(List<AdminStepModel> table) throws Throwable {
		
		Wait.untilPageIsReady(2000);
		Assert.assertNotNull(table);
		AdminStepModel sm = table.get(0);
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		Wait.untilPageIsReady(1000);
		
		Assert.assertTrue(ap.getParticipantEmailAddress(sm.email).isDisplayed());
		
//		
		Wait.untilPageIsReady(2000);
	}

	@Then("^Cost Code page is displayed$")
	public void costCodePageIsDisplayed() throws Throwable {
		AdminPanelObjectModel ap = new AdminPanelObjectModel();
		
		Assert.assertEquals(ap.costCodesTitle.getText().toString(),"COST CODES");
		Wait.untilPageIsReady(2000);
	}
}
