package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Souke Family on 03/02/2018.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening the browser : MOCK");
        //Passing a dummy WebDiver instance
        base.StepInfo = "ChromeDriver";
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


