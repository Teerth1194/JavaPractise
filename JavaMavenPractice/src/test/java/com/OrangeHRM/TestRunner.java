package com.OrangeHRM;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "E:\\Teerth\\Inteli J\\JavaMavenPractice\\src\\test\\resources",
        glue = "com.OrangeHRM.steps",
        plugin ={ "html:target/cucumber.html","json:target/cucumber.json"}

)

public class TestRunner {

}
