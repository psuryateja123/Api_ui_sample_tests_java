package resource.step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import resource.page_objects.ui_test_pageobject;
import resource.utils.Env;

import static resource.utils.RunTest.driver;

public class ui_testStepDefs {

    @Given("^I navigate to test page$")
    public void iNavigateToTestPage() {
        ui_test_pageobject.navigating_home_page();

    }

    @Then("^I check for checkbox$")
    public void iCheckForCheckbox() {
        ui_test_pageobject.check_for_checkbox();
    }

    @Then("^I click Remove button$")
    public void iClickRemoveButton() {
        ui_test_pageobject.clicking_remove_checkbox();
    }

    @Then("^the checkbox should disappear$")
    public void theCheckboxShouldDisappear() {
        ui_test_pageobject.check_for_checkbox();
        ui_test_pageobject.check_for_remove_message();
    }

    @And("^I click add button$")
    public void iClickAddButton() {
        ui_test_pageobject.clicking_add();
    }


    @Then("^the checkox should reappear$")
    public void theCheckoxShouldReappear() {
        ui_test_pageobject.check_for_added_message();
    }


    @Then("^I click on enable button$")
    public void iClickOnEnableButton() {
        ui_test_pageobject.click_enable_button();
    }


    @And("^I check the status$")
    public void iCheckTheStatus() {
        ui_test_pageobject.check_disable_button_state();
    }


    @And("^I check the current status$")
    public void iCheckTheCurrentStatus() {
        ui_test_pageobject.check_enable_button_state();
    }

    @Then("^I check the default button status$")
    public void iCheckTheDefaultButtonStatus() {
        ui_test_pageobject.check_enable_default_button_state();
    }
}
