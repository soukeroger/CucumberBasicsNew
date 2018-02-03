package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Souke Family on 03/02/2018.
 */
public class Hook {

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening the browser : MOCK");
    }

    @After
    public void TearDownTest(Scenario scenario)
    {
        if(scenario.isFailed())
            //Take screenshots
            System.out.println(scenario.getName());

        System.out.println("Closing the browser : MOCK");
    }
}


