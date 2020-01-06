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

    @And("^I check the current status$")
    public void iCheckTheCurrentStatus() {
        ui_test_pageobject.check_enable_button_state();
    }

    @Then("^I check the default button status$")
    public void iCheckTheDefaultButtonStatus() {
        ui_test_pageobject.check_enable_default_button_state();
    }

    @Then("^I click on disable button$")
    public void iClickOnDisableButton() {
        ui_test_pageobject.click_enable_button();
        //*[@id="input-example"]/button
    }

    @Then("^I check the status of the button Add$")
    public void iCheckTheStatusOfTheButtonAdd() {
        ui_test_pageobject.check_add_button_State();
    }

    @And("^I check the add message$")
    public void iCheckTheAddMessage() {
        ui_test_pageobject.check_for_added_message();
    }

    @Then("^I check the remove message$")
    public void iCheckTheRemoveMessage() {
        ui_test_pageobject.check_for_remove_message();
    }

    @Then("^I check the enable state message$")
    public void iCheckTheEnableStateMessage() {
        ui_test_pageobject.check_for_enable_state_message();
    }

    @Then("^I check the remove button status$")
    public void iCheckTheRemoveButtonStatus() {
        ui_test_pageobject.check_remove_button_State();
    }

    @And("^I check the disable state message$")
    public void iCheckTheDisableStateMessage() {
        ui_test_pageobject.check_for_disable_state_message();
    }
}
