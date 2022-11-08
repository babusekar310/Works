package org.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.report.Jvm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Babu\\eclipse-workspace\\CucumberNew\\src\\main\\resources\\Facebook.feature",
		glue = "org.stepdefinition",
		monochrome = true,
		plugin = "json:junitReport\\jsonReport.json"
		)

public class TestRunner extends Jvm {
	
	@AfterClass
	public static void report() {
		Jvm.createJvmReport("C:\\Users\\Babu\\eclipse-workspace\\CucumberNew\\junitReport\\jsonReport.json");

	}
	

}
