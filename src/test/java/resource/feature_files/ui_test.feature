
@ui_test

Feature:  Navigating to test page and checking for UI elements


  Scenario: Check for check button
    Given I navigate to test page
    Then I check for checkbox
    Then I click Remove button
    Then I check the remove message
    Then I check the remove button status
    And I click add button
    Then the checkox should reappear
    And I check the status of the button Add
    And I check the add message


  Scenario: check for enable/diable button
    Given I navigate to test page
    Then I check the default button status
    Then I click on enable button
    Then I check the enable state message
    Then I click on disable button
    And I check the current status
    And I check the disable state message