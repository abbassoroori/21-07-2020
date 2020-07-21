package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\createAcoonutEcommerce.feature", // featrues tells Cucumber options where features are located
glue = { "stepDefination" }, // glue tells cucumber options where Step Definitions are located
tags = {"@registerTest"}, 
dryRun = false, // dry run if sets to false checks if all steps in feature files has step
							// definitons.
monochrome = true, // if set to true, makes the console output readable.
strict = false, // if set to false will fail if there are pending undefined steps.
format = {"pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"
},
plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class CreateTestRunner {

}
