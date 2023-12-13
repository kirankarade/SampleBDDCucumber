package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = {"src\\test\\resources\\ApplicationTest\\Search.feature"},

	glue = {"steps"}

	

	)


public class SearchRunner extends AbstractTestNGCucumberTests{

}
