package org.example.JunitRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "org.example.StepDefinition", "org.example.hooks" },
        plugin = {"pretty", "html:target/cucumber-reports.html"},
//        plugin = {"pretty", "html://target/cucumber-reports", "json://target/cucumber.json"},
        tags = "@backgroundScenario",
        dryRun = false

)
public class TestRunner {
}
