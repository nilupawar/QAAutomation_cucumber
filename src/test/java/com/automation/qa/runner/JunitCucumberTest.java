package com.automation.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.aspectj.util.FileUtil;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
//         Here classpath: refer to location of java and resources folder inside test folder,
//         features is the name of the folder where features files are present

        glue = "com.automation.qa.steps",

//         path to step definition packages, multiple packages can be specified

        plugin = {"pretty"
                , "html:target/cucumber_html_output"
                , "json:target/cucumber_json_report.json"
                , "progress:target/cucumber_progress_report"
                , "rerun:target/cucumber_rerun_report"
                , "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        },

//         pretty : generates console output with details of gherkin steps. if skipped you will not be able to explicitly see executed gherkin steps on console output
//         html : generates execution reports in html format
//         json : generates execution reports in json format. Usually this report can be used by other plugins to generate useful reports
//         rerun : generates a file which has details about all failed test scenario. This generated rerun file can be used by another test runner to rerun only the failed scenarios

        tags = {"@MultiExamples and @ExampleTag2"}, // please also look at EDIT configuration as test are also executed from that

//         Selects test scenario for execution based on the specified tags. to create an OR condition use {"@ORtag1,@ORtag2"}
//         OR {"@ORtag1 or @ORtag2"} and to create a AND condition use {"@ANDtag1","@ANDtag2"}. use {"~@NotToExecuteTag"}

        dryRun = false,
//        Default value is false. Right word to define is that dryRun ignore scenario execution. When set to true it will
//        search for all undefined steps and generate a step definition snippet for you. When set to true no actual execution for scenario steps

        snippets = CucumberOptions.SnippetType.CAMELCASE,
//         Step definition snippet format (name of method) depends on value set for this. Available values are
//         `CucumberOptions.SnippetType.CAMELCASE` and `CucumberOptions.SnippetType.UNDERSCORE`

        monochrome = false,
//         Default value is false. When set to true output of your run on console will be
//         only black and white. Recommended to use with value false to see different colors

        strict = false
//         Default value is false. When set to true test will be marked failure when undefined or Pending steps are found
)
public class JunitCucumberTest {

    @AfterClass
    public static void finalise() throws URISyntaxException, IOException {
        FileUtil.copyFile(Paths.get(JunitCucumberTest.class.getClassLoader().getResource("environment.properties").toURI()).toFile()
                , Paths.get(System.getProperty("user.dir")).resolve(System.getProperty("allure.results.directory").concat("/environment.properties")).toFile());
    }
}
