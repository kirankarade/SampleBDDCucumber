package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\ApplicationTest\\Orders.feature"},

		glue = {"steps"},
		plugin = {"pretty"},
		dryRun = true
		)
public class OrderRunner extends AbstractTestNGCucumberTests{

}
