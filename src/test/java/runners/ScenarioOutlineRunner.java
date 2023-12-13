package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\ApplicationTest\\ScenarioOutline.feature"},

		glue = {"steps"},
		
		plugin = {"pretty"}
)
public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests{

}
