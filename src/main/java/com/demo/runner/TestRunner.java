package com.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\LT-SUKR\\eclipse-workspace\\DemocumberFramework\\src\\main\\java\\com\\demo\\feature"
,glue="com.demo.stepdef",dryRun=false, monochrome=true,plugin= {"pretty","json:target/frameworkreports/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
