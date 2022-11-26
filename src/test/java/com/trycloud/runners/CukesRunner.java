package com.trycloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features", //right click on features package, copy path from content root
        glue = "com/trycloud/step_definitions", //right click on stepdef package, copy path from source root
        dryRun = false,
        tags = ""
)

public class CukesRunner {
}
