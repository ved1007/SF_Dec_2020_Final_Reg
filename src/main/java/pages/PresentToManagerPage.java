package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresentToManagerPage extends BasePageTest{
	
	
	By UserNameField = By.id("username");
    By PasswordField = By.id("password");
    By LoginBtnClick = By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']");
    By UserSearch = By.xpath("//input[@placeholder='Quick Find']");
    By UserSearch1 = By.xpath("//div[1]/div/div/div/ul/li/ul/li[8]/div/a/mark");
    By ReceptionistSearch = By.cssSelector("*[id^='158:'][id$='a']");
    By ReceptionistNameClick = By.xpath("//div[contains(text(),'Alize McDonald')]");
    By LoginWithReceptionist = By.xpath("(//input[@name='login'])[1]");
    By CreateNewUPBtnClick = By.xpath(
            "//parent::div[@class='slds-m-horizontal_xxx-small slds-size--1-of-6 slds-truncate']//button[@type='button']");
    By CustomerDescriptionInputField = By.xpath("//input[@name='description']");

    By SalespersonDropdownClick = By.xpath("//select[@name='splist']");
    By SalespersonDropdownSelect = By.xpath("//parent::select[@name='splist']//option[contains(text(),'David King')]");

    By EmailInputField = By.xpath("//input[@inputmode='email']");
    By PhoneInputField = By.xpath("//input[@type='tel']");
    By FirstNameInputField = By.xpath("(//input[@type='string'])[1]");
    By LastNameInputField = By.xpath("(//input[@type='string'])[2]");
    By ZipCodeField = By.xpath("(//input[@type='text'])[4]");
    By StreetAddressField = By.xpath("(//input[@type='text'])[5]");
    By GoodSameClubNumber = By.xpath("(//input[@type='text'])[6]");
    By SearchBtnClick = By.xpath("//parent::div[@class='slds-align_absolute-center']//button[@type='button']");
    By SaveBtnClick = By.xpath("//button[contains(text(),'Save')]");
    By ReceptionsLogOut = By.linkText("Log out as Alize McDonald");
    By DealerSalesSearch = By.cssSelector("*[id^='158:'][id$='a']");
    By DealerSalesNameClick = By.xpath("//div[contains(text(),'David King')]");
    By LoginBtnClick2 = By.xpath("(//input[@name='login'])[1]");
    By ClickOnTheCustomerName = By.cssSelector("*[data-aura-rendered-by^='102:'][data-aura-rendered-by$='a']");
    By RVGeniusBtnClick = By.xpath("//button[@name='Up__c.RV_Genius']");
    By CityInputField = By.xpath("(//input[@class='slds-input'])[7]");
    By StateDropdownClick = By.xpath("(//select[@name='select'])[1]");
    By StateDropdownSelected = By.xpath("(//option[@id='IL'])[1]");
    By NextStepBtnClick = By.xpath("//button[contains(text(),'Next Step')]");
    By AdditionalAttributesDropdownClick = By.xpath("//span[contains(text(),'Additional attributes')]");
    //   By OutdoorKitchenCheckbox = By.xpath("(//input[@type='checkbox'])[1]");
    By OutdoorEntertainmentCheckbox = By.xpath("(//input[@type='checkbox'])[2]");
    //   By ToyDeck = By.xpath("(//input[@type='checkbox'])[3]");
    By NotesInputfield1 = By.id("input-97");
    By CashRadioBtn = By.xpath("(//span[@class='slds-radio_faux'])[2]");
    By NotesHowWillyoupurchase = By.id("input-100");
    By NotesTradeIn = By.id("input-103");
    By NextStepBtnClick2 = By.xpath("//button[contains(text(),'Next Step')]");

    By RVSelection1 = By.cssSelector("[data-aura-rendered-by^='57:'][data-aura-rendered-by$='a']");
    By RVSelection2 = By.cssSelector("[data-aura-rendered-by^='127:'][data-aura-rendered-by$='a']");
    By RVSelection3 = By.cssSelector("[data-aura-rendered-by^='197:'][data-aura-rendered-by$='a']");

    By ConfirmSelectionBtnClick = By.xpath("//button[contains(text(),'Confirm Selections')]");

    By SmileyFaceIconClick1 = By.xpath("//parent::button[@id='0']//img[@id='0-mark-good']");
    By CommitBtnClick1 = By.xpath("(//button[contains(text(),'Commitment')])[1]");
    By GreenCheckMarkClick = By.xpath("(//button[@class='middle-button']//img[@class='okay-icon'])[3]");

    By NextStepBtnClick3 = By.xpath("//button[contains(text(),'Next Step')]");
    By PresentToManagerBtnClick = By.xpath("//button[contains(text(),'Present to Manager')]");

    By LogOutDealerSales = By.xpath("//a[contains(text(),'Log out as David King')]");

    By DealerSalesManagerSearch = By.cssSelector("[id^='158:'][id$='a']");
    By DealerSalesManagerNameClick = By.xpath("//div[contains(text(),'Jazz Barrett')]");

    By LoginBtnClick3 = By.xpath("(//input[@name='login'])[1]");

    //  By OpportunitiesClick = By.xpath("(//span[contains(text(),'Opportunities')])[1]");
    //  By OpportunitiesClick = By.xpath("//a[@title='Opportunities']");

    By LogoutAsDealerSalesManager = By.xpath("//a[@class='action-link']");
 //   public String Receptionist;


    public void userName(String username) {
        $(UserNameField).sendKeys(username);
    }

    public void pAssword(String password) {
        $(PasswordField).sendKeys(password);
    }

    public void loginBtnClick() {
        $(LoginBtnClick).click();
    }

    public void gearIconClick() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("(//div[@class='headerTrigger  tooltip-trigger uiTooltip'])[2]")))
                .build().perform();
        driver.findElement(By.xpath("(//div[@class='headerTrigger  tooltip-trigger uiTooltip'])[2]")).click();
        System.out.println("Clicked on the Gear icon");

    }

    public void setupClick() throws InterruptedException {
        Thread.sleep(5000);
        String ParentWindowHandle = driver.getWindowHandle();
        System.out.println("ParentWindowHandle " + ParentWindowHandle);

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("related_setup_app_home"))).click().build().perform();
        System.out.println(driver.getTitle());

        for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
            Thread.sleep(5000);

        }

        userSearch();
        userSearch1();
        receptionistSearch();
//        receptionistSearch(Receptionist);
        receptionistNameClick();
        clickLoginBtn();
        createNewUpBtnClick();
        customerDescriptionInputField();
        emailInputField();
        phoneInputField();
        firstNameInputField();
        lastNameInputField();
        zipCodeField();
        streetAddressField();
        goodSameClubNumber();
        salespersonDropdownClick();
        salespersonDropdownSelect();
        searchBtnClick();
        saveBtnClick();
        receptionsLogOut();
        dealerSalesSearch();
        dealerSalesNameClick();
        loginBtnClick2();
        clickOnTheCustomerName();
        rVGeniusBtnClick();
        cityInputField();
        stateDropdownClick();
        stateDropdownSelected();
        nextStepBtnClick();
        additionalAttributesDropdownClick();
        //   outdoorKitchenCheckbox();
        outdoorEntertainmentCheckbox();
        //   toyDeck();
        notesInputfield1();
        cashRadioBtn();
        notesHowWillyoupurchase();
        notesTradeIn();
        nextStepBtnClick2();
        rVSelection1();
        rVSelection2();
        rVSelection3();
        confirmSelectionBtnClick();
        smileyFaceIconClick1();
        commitBtnClick1();
        greenCheckMarkClick();
        nextStepBtnClick3();
        presentToManagerBtnClick();
        logOutDealerSales();
        dealerSalesManagerSearch();
        dealerSalesManagerNameClick();
        loginBtnClick3();
        //   opportunitiesTabClick();
        logoutAsDealerSalesManagerClick();

    }

    public void userSearch() throws InterruptedException {
        Thread.sleep(2000);
        $(UserSearch).sendKeys("Users");
    }

    public void userSearch1() throws InterruptedException {
        Thread.sleep(2000);
        $(UserSearch1).click();
        Thread.sleep(5000);
    }

//    public void receptionistSearch(String Receptionist) {
//        $(ReceptionistSearch).sendKeys(Receptionist);
//
//    }
    public void receptionistSearch() {
        $(ReceptionistSearch).sendKeys("Alize McDonald");

    }

    public void receptionistNameClick() throws InterruptedException {
        Thread.sleep(5000);
        $(ReceptionistNameClick).click();
        Thread.sleep(5000);
    }

    public void clickLoginBtn() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        $(LoginWithReceptionist).click();

    }

    public void createNewUpBtnClick() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(9000);
        $(CreateNewUPBtnClick).click();
        Thread.sleep(7000);
    }

    public void customerDescriptionInputField() {
        $(CustomerDescriptionInputField).sendKeys("Customer Description field");
    }

    public void salespersonDropdownClick() {
        $(SalespersonDropdownClick).click();
    }

    public void salespersonDropdownSelect() {
        $(SalespersonDropdownSelect).click();
    }

    public void emailInputField() {
        $(EmailInputField).sendKeys("GW32@email.com");
    }

    public void phoneInputField() {
        $(PhoneInputField).sendKeys("3254565679");
    }

    public void firstNameInputField() {
        $(FirstNameInputField).sendKeys("George32");
    }

    public void lastNameInputField() {
        $(LastNameInputField).sendKeys("Washington32");
    }

    public void zipCodeField() {
        $(ZipCodeField).sendKeys("60132");
    }

    public void streetAddressField() {
        $(StreetAddressField).sendKeys("322 Chicago St");
    }

    public void goodSameClubNumber() {
        $(GoodSameClubNumber).sendKeys("3203");
    }

    public void searchBtnClick() {
        $(SearchBtnClick).click();
    }

    public void saveBtnClick() {
        $(SaveBtnClick).click();
    }

    public void receptionsLogOut() {
        $(ReceptionsLogOut).click();

    }

    public void dealerSalesSearch() {
        $(DealerSalesSearch).sendKeys("David King");
    }

    public void dealerSalesNameClick() throws InterruptedException {
        $(DealerSalesNameClick).click();
        Thread.sleep(7000);

    }

    public void loginBtnClick2() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(8000);
        $(LoginBtnClick2).click();
    }

    public void clickOnTheCustomerName() throws InterruptedException {
        Thread.sleep(9000);
        driver.switchTo().defaultContent();
        Thread.sleep(9000);
        $(ClickOnTheCustomerName).click();
        Thread.sleep(9000);

    }

    public void rVGeniusBtnClick() throws InterruptedException {
        String ParentWindowHandle = driver.getWindowHandle();
        System.out.println("ParentWindowHandle " + ParentWindowHandle);
        for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
            Thread.sleep(5000);
        }
        $(RVGeniusBtnClick).click();
        System.out.println("------------Clicked-----on-----the-----RVGenius-----button--------------");
    }

    public void cityInputField() throws InterruptedException {
        Thread.sleep(9000);
        String ParentWindowHandle = driver.getWindowHandle();
        System.out.println("ParentWindowHandle " + ParentWindowHandle);
        for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
        }
        Thread.sleep(9000);
        $(CityInputField).sendKeys("Bartlett");

    }

    public void stateDropdownClick() {
        $(StateDropdownClick).click();
    }

    public void stateDropdownSelected() {
        $(StateDropdownSelected).click();
    }

    public void nextStepBtnClick() throws InterruptedException {
        $(NextStepBtnClick).click();
        Thread.sleep(3000);
    }

    public void additionalAttributesDropdownClick() {
        $(AdditionalAttributesDropdownClick).click();
    }

//    public void outdoorKitchenCheckbox() { $(OutdoorKitchenCheckbox).click(); }

    public void outdoorEntertainmentCheckbox() {
        $(OutdoorEntertainmentCheckbox).click();
    }

//    public void toyDeck() { $(ToyDeck).click(); }

    public void notesInputfield1() {
        $(NotesInputfield1).sendKeys("Notes field for Additional attributes");
    }

    public void cashRadioBtn() {
        $(CashRadioBtn).click();
    }

    public void notesHowWillyoupurchase() {
        $(NotesHowWillyoupurchase).sendKeys("Notes field for How will you purchase");
    }

    public void notesTradeIn() {
        $(NotesTradeIn).sendKeys("Notes field for the Trade In");
    }

    public void nextStepBtnClick2() throws InterruptedException {
        $(NextStepBtnClick2).click();
        Thread.sleep(3000);
    }

    public void rVSelection1() throws InterruptedException {
        $(RVSelection1).click();
        Thread.sleep(3000);
    }

    public void rVSelection2() throws InterruptedException {
        $(RVSelection2).click();
        Thread.sleep(3000);
    }

    public void rVSelection3() throws InterruptedException {
        $(RVSelection3).click();
        Thread.sleep(3000);
    }

    public void confirmSelectionBtnClick() throws InterruptedException {
        $(ConfirmSelectionBtnClick).click();
        Thread.sleep(5000);
    }

    public void smileyFaceIconClick1() throws InterruptedException {
        Thread.sleep(5000);
        $(SmileyFaceIconClick1).click();
    }

    public void commitBtnClick1() {
        $(CommitBtnClick1).click();
    }

    public void greenCheckMarkClick() {
        $(GreenCheckMarkClick).click();
    }

    public void nextStepBtnClick3() throws InterruptedException {
        $(NextStepBtnClick3).click();
        Thread.sleep(3000);
    }

    public void presentToManagerBtnClick() throws InterruptedException {
        Thread.sleep(6000);
        $(PresentToManagerBtnClick).click();
        Thread.sleep(3000);
        System.out.println("-----------Successfully----Present---To---Manager-----------3-----------------------");

    }

    public void logOutDealerSales() throws InterruptedException {
        $(LogOutDealerSales).click();
        Thread.sleep(6000);
    }

    public void dealerSalesManagerSearch() throws InterruptedException {
        $(DealerSalesManagerSearch).sendKeys("Jazz Barrett");
        Thread.sleep(2000);
    }

    public void dealerSalesManagerNameClick() throws InterruptedException {
        $(DealerSalesManagerNameClick).click();
        Thread.sleep(6000);
    }

    public void loginBtnClick3() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(9000);
        $(LoginBtnClick3).click();
        Thread.sleep(9000);
        System.out.println("----------Successfully----Click-----on----------Login----------Button3----------");
    }

//    public void opportunitiesTabClick() throws InterruptedException {
//        Thread.sleep(9000);
//        $(OpportunitiesClick).click();
//    }

    public void logoutAsDealerSalesManagerClick() throws InterruptedException {
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
    //    Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) $(LogoutAsDealerSalesManager))).click();

     //   $(LogoutAsDealerSalesManager).click();
        Thread.sleep(10000);
        driver.quit();

        System.out.println("----------Salesforce-----Application-----is-----Closed-----");
    }
	

}
