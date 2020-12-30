Feature: Present to Manager

  Scenario Outline: Present to Manager functionality
    Given View the Salesforce website
    When Salesforce login page title as "Login | Salesforce"
    Then SystemAdmin UserID enter "<username>" and "<password>"
    And  Click on Login to Sandbox button
    And Home page title as "Home | Salesforce"
    Then Click on the Gear icon
    And CLick Setup option
	#------------------------Login as receptionist-----------------------------------
    Then Find Users
    Then Search for receptionist Alize McDonald from CNC
    Then Click on Login Button
    Then Click the Crete New Up button
    Then Populate the Create New Up fields
    Then CLick on the Search button
    Then Click the Save button
    Then Logout as receptionist
	#----------------------Login as Dealer Sale-------------------------------------
    Then Search for Dealer Sales David King from CNC
    Then Click on Login Button
    Then CLick on Customer Name
    Then Click on the RV Genius button
    Then Populate the City and State fields
    Then Click on the Next Step button
    Then Populate the Additional Attributes section
    Then Select the RVs by clicking plus sign
    Then Click on the Confirm Selections button
    Then Select the Face icon and click on the Commitment button
    Then CLick the Check mark green icon
    Then CLick on the Next Step
    And Click on the Present to Manager button
    And Take screenshot of the Successfully message
    And Logout Dealer Sales
	#-------------------------Login as Dealer Sales Manager----------------------------------
    Then Search for the Dealer Sale Manager
    #Jazz Barrett
    Then Click on Login Button
    # Then CLick on the Opportunity
    Then Logout as Jazz Barrett
#    And Close the Salesforce Application

    Examples:
      | username                            | password     |
      | vedant.jagani@campingworld.com.test | Welcome2019* |