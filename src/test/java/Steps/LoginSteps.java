package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roger.Souke on 08/12/2017.
 */
public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    //    @And("^I enter the username as admin and password as admin$")
//    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Enter Username and password");
//    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("I should see userform page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.Driver.findElement(By.name("Login")).submit();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals( "It's not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
       /* List<List<String>> data = table.raw();
       System.out.println("The Value is:" + data.get(0).get(0).toString());
        System.out.println("The Value is:" + data.get(0).get(1).toString());*/
        List<User> users = new ArrayList<User>();
//     Store all the users
        users = table.asList(User.class);

        for (User user : users) {
           base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
            base.Driver.findElement(By.name("Password")).sendKeys(user.password);
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("The Email Address is" + email);

    }

    @And("^I verify the count of my salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("My salary digits count is:" + salary);
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
