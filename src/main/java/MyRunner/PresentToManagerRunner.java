package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/vedant.jagani/Desktop/Salesforce/CucumberBDDFrameVedant/src/main/java/Features/PresentToManager.feature",

		glue = { "stepDefinitions2" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = true, strict = true, dryRun = false

)

public class PresentToManagerRunner {

}