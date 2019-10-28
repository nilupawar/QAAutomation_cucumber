package com.automation.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/cucumber_rerun_report",    // Here classpath: refer to location of java and resources folder inside test folder, features is the name of the folder where features files are present
        glue = "com.automation.qa.steps",                          // path to step definition packages, multiple packages can be specified
        plugin = {"pretty"
                ,"html:target/cucumber_html_failed_rerun_output"},
        dryRun = false,                    // Default value is false. When set to true it will search for all undefined steps and generate a step definition snippet for you. When set to true no actual execution for scenario steps
        snippets = CucumberOptions.SnippetType.UNDERSCORE, // Step definition snippet format (name of method) depends on value set for this. Available values are `CucumberOptions.SnippetType.CAMELCASE` and `CucumberOptions.SnippetType.UNDERSCORE`
        monochrome = false,                // Default value is false. When set to true output of your run on console will be only black and white. Recommended to use with value false to see different colors
        strict = true                     // Default value is false. When set to true test will be marked failure when undefined or Pending steps are found
)
public class JunitFailedCucumberTest {
}
