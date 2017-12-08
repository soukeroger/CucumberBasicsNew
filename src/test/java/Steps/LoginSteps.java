package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by Roger.Souke on 08/12/2017.
 */
public class LoginSteps {
//    @And("^I enter the username as admin and password as admin$")
//    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Enter Username and password");
//    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see userform page");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigate login page");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click button");
    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
       List<List<String>> data = table.raw();
       System.out.println("The Value is:" + data.get(0).get(0).toString());
        System.out.println("The Value is:" + data.get(0).get(1).toString());

    }
}
