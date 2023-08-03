package RunnerTest;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeature"},
		glue= {"StepDefinition"},
		dryRun=false,
		plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
