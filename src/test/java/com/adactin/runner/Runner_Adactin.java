package com.adactin.runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.base.Adactin_Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", publish = true, glue = "com.stepdefinition", monochrome = true, plugin = {
		"html:Report/rep.html", "pretty" })

public class Runner_Adactin {
	public static WebDriver driver;

	@BeforeClass
	public static void start() {
		Adactin_Base.launch_Browser("chrome");
	}

	@AfterClass
	public static void end() throws IOException {

		Adactin_Base.ss("C:\\Users\\sasi\\eclipse-workspace\\Cucumber\\ScreenShots\\Adactin.png");
		// Adactin_Base.close();
	}

}
