package com.automation.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",    // Here classpath: refer to location of java and resources folder inside test folder, features is the name of the folder where features files are present
        glue = "com.automation.qa.steps",                          // path to step definition packages, multiple packages can be specified
        plugin = {"pretty"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = true,
        monochrome = false,
        strict = false
)
public class JunitCucumberTest {
}
