package com.maven.flipkart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"}
		,glue={"stepDefinitions"}
	    ,dryRun= false
	    ,format={ "pretty" ,"html: target/cucumber-reporting"})
		

public class TestRunner {
         
}
