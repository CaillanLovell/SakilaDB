package com.example.tsi.caillan.lovell.demoTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/Cucumber", glue = "com.example.tsi.caillan.lovell.demoTest")
public class runCucumberTest {
}
