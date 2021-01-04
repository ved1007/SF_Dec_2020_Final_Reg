package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.excel.test.utility.Xls_Reader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.PresentToManagerPage;

public class PresentToManagerStepDefi {

	WebDriver driver;

	Xls_Reader reader = new Xls_Reader(
			"/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/SampleData/ExcelTestData.xlsx");

	String Receptionist = reader.getCellData("PresentToManager", "Receptionist", 2);
	String CustomerDescription = reader.getCellData("PresentToManager", "CustomerDescription", 2);
	String Email = reader.getCellData("PresentToManager", "Email", 2);
	String Phone = reader.getCellData("PresentToManager", "Phone", 2);
	String FirstName = reader.getCellData("PresentToManager", "FirstName", 2);
	String LastName = reader.getCellData("PresentToManager", "LastName", 2);
	String ZipCode = reader.getCellData("PresentToManager", "ZipCode", 2);
	String StreetAddress = reader.getCellData("PresentToManager", "StreetAddress", 2);
	String GoodSameClubNumber = reader.getCellData("PresentToManager", "GoodSameClubNumber", 2);
	String DealerSalesSearch = reader.getCellData("PresentToManager", "DealerSalesSearch", 2);
	String NotesInputfield1 = reader.getCellData("PresentToManager", "NotesInputfield1", 2);
	String NotesHowWillyouPurchase = reader.getCellData("PresentToManager", "NotesHowWillyouPurchase", 2);
	String NotesTradeIn = reader.getCellData("PresentToManager", "NotesTradeIn", 2);

	PresentToManagerPage ptm = new PresentToManagerPage();

	@Given("^View the Salesforce website$")
	public void view_the_Salesforce_website() {
		ptm.setup();

	}

	@When("^Salesforce login page title as \"([^\"]*)\"$")
	public void salesforce_login_page_title_as(String LoginPageTitleVerify) throws InterruptedException {
		Thread.sleep(3000);
		String title = ptm.getTitle();
		System.out.println(title);
		Assert.assertEquals(LoginPageTitleVerify, title);

	}

	@Then("^SystemAdmin UserID enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void systemadmin_UserID_enter_and(String un, String pwd) {
		ptm.userName(un);
		ptm.pAssword(pwd);

	}

	@Then("^Click on Login to Sandbox button$")
	public void click_on_Login_to_Sandbox_button() throws InterruptedException {
		ptm.loginBtnClick();
		Thread.sleep(18000);

	}

	@Then("^Home page title as \"([^\"]*)\"$")
	public void home_page_title_as(String HomePageTitleVerify) throws InterruptedException {
		Thread.sleep(18000);
		String title = ptm.getTitle();
		System.out.println(title);
		Assert.assertEquals(HomePageTitleVerify, title);

	}

	@Then("^Click on the Gear icon$")
	public void click_on_the_Gear_icon() {
		ptm.gearIconClick();

	}

	@Then("^CLick Setup option$")
	public void click_Setup_option() throws InterruptedException {
		ptm.setupClick();

	}

	@Then("^Find Users$")
	public void find_Users() throws InterruptedException {
		ptm.userSearch();
		ptm.userSearch1();

	}

	@Then("^Search for receptionist Alize McDonald from CNC$")
	public void search_for_receptionist_Alize_McDonald_from_CNC() throws InterruptedException {
		ptm.receptionistSearch();
		ptm.receptionistNameClick();
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws InterruptedException {
		String title = ptm.getTitle();
		System.out.println(title);
		ptm.clickLoginBtn();
	}

	@Then("^Click the Crete New Up button$")
	public void click_the_Crete_New_Up_button() throws InterruptedException {
		ptm.createNewUpBtnClick();
	}

	@Then("^Populate the Create New Up fields$")
	public void populate_the_Create_New_Up_fields() {
		ptm.customerDescriptionInputField();
		ptm.salespersonDropdownClick();
		ptm.salespersonDropdownSelect();
		ptm.emailInputField();
		ptm.phoneInputField();
		ptm.firstNameInputField();
		ptm.lastNameInputField();
		ptm.zipCodeField();
		ptm.streetAddressField();
		ptm.goodSameClubNumber();

	}

	@Then("^CLick on the Search button$")
	public void click_on_the_Search_button() throws InterruptedException {
		ptm.searchBtnClick();
		ptm.saveBtnClick();
		Thread.sleep(4000);

	}

	@Then("^Logout as receptionist$")
	public void logout_as_receptionist() throws InterruptedException {
		Thread.sleep(4000);
		ptm.receptionsLogOut();

	}

	@Then("^Search for Dealer Sales David King from CNC$")
	public void search_for_Dealer_Sales_David_King_from_CNC() {
		ptm.dealerSalesSearch();

	}

	@Then("^CLick on Customer Name$")
	public void click_on_Customer_Name() throws InterruptedException {
		ptm.dealerSalesNameClick();
		ptm.loginBtnClick2();
		ptm.clickOnTheCustomerName();

	}

	@Then("^Click on the RV Genius button$")
	public void click_on_the_RV_Genius_button() throws InterruptedException {
		ptm.rVGeniusBtnClick();
	}

	@Then("^Populate the City and State fields$")
	public void populate_the_City_and_State_fields() throws InterruptedException {
		ptm.cityInputField();
		ptm.stateDropdownClick();
		ptm.stateDropdownSelected();
	}

	@Then("^Click on the Next Step button$")
	public void click_on_the_Next_Step_button() throws InterruptedException {
		ptm.nextStepBtnClick();

	}

	@Then("^Populate the Additional Attributes section$")
	public void populate_the_Notes_field() throws InterruptedException {
		ptm.additionalAttributesDropdownClick();
		// ptm.outdoorKitchenCheckbox();
		ptm.outdoorEntertainmentCheckbox();
		// ptm.toyDeck();
		ptm.notesInputfield1();
		ptm.cashRadioBtn();
		ptm.notesHowWillyoupurchase();
		ptm.notesTradeIn();
		ptm.nextStepBtnClick2();

	}

	@Then("^Select the RVs by clicking plus sign$")
	public void select_the_RVs_by_clicking_plus_sign() throws InterruptedException {
		ptm.rVSelection1();
		ptm.rVSelection2();
		ptm.rVSelection3();

	}

	@Then("^Click on the Confirm Selections button$")
	public void click_on_the_Confirm_Selections_button() throws InterruptedException {
		ptm.confirmSelectionBtnClick();
	}

	@Then("^Select the Face icon and click on the Commitment button$")
	public void select_the_Face_icon_and_click_on_the_Commitment_button() throws InterruptedException {
		ptm.smileyFaceIconClick1();
		ptm.commitBtnClick1();
	}

	@Then("^CLick the Check mark green icon$")
	public void click_the_Check_mark_green_icon() {
		ptm.greenCheckMarkClick();
	}

	@Then("^CLick on the Next Step$")
	public void click_on_the_Next_Step() throws InterruptedException {
		ptm.nextStepBtnClick3();

	}

	@Then("^Click on the Present to Manager button$")
	public void click_on_the_Present_to_Manager_button() throws InterruptedException {
		ptm.presentToManagerBtnClick();
	}

	@Then("^Take screenshot of the Successfully message$")
	public void take_screenshot_of_the_Successfully_message() {

	}

	@Then("^Logout Dealer Sales$")
	public void logout_Dealer_Sales() throws InterruptedException {
		ptm.logOutDealerSales();
	}

	@Then("^Search for the Dealer Sale Manager$")
	public void search_for_the_Dealer_Sale_Manager() throws InterruptedException {
		ptm.dealerSalesManagerSearch();
		ptm.dealerSalesManagerNameClick();
		ptm.loginBtnClick3();

	}

//    @Then("^CLick on the Opportunity$")
//    public void click_on_the_Opportunity() throws InterruptedException {
//        ptm.opportunitiesTabClick();
//
//    }

	@Then("^Logout as Jazz Barrett$")
	public void logout_as_Jazz_Barrett() throws InterruptedException {
		ptm.logoutAsDealerSalesManagerClick();

	}

}