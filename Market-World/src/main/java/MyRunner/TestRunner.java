package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\Cucumber Market world\\Market-World\\src\\main\\java\\features\\Referral.feature",
	glue= {"stepDefinition"},
	format = {"pretty","html:test-output", "json:json_output/login.json" , "junit:junit_xml/login.xml"},
	monochrome = true,
	strict = true,
	dryRun = false
	)

public class TestRunner
{	

	
}

