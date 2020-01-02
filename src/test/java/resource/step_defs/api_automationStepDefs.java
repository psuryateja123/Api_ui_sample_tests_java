package resource.step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.IsEqual.equalTo;

public class api_automationStepDefs {

    @Given("^I post the api \"([^\"]*)\"  with json \"([^\"]*)\" and matches the result \"([^\"]*)\"$")
    public void iPostTheApiWithJsonAndMatchesTheResult(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        given()

                .header("Content-Type", arg1) //another way to specify content type
                // use jsonObj toString method
                .when()
                .post(arg0)
                .then()
                .assertThat()
                .body("decisionResult",equalTo(arg2));
    }


}
