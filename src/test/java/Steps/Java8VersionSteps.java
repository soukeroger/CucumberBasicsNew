package Steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by Souke Family on 13/02/2018.
 */
public class Java8VersionSteps implements En {
    public Java8VersionSteps() {
        And("^I just need to see how step looks for Cucumber-Java(\\d+)$", (Integer arg0) -> {
            // Write code here that turns the phrase above into concrete actions

            System.out.println("The value from new step class is :" + arg0);
        });
    }
}
