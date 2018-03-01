package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Souke Family on 28/02/2018.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"}, glue = "Steps")

public class TestRunner extends AbstractTestNGCucumberTests {
}
