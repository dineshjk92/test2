package starter;

import org.junit.AfterClass;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	static int pass;
	static int fail;

	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("This will run before the Scenario");
	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("This will run after the Scenario");
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		if(scenario.getStatus().toString().equalsIgnoreCase("passed")) {
			pass++;
		} else if(scenario.getStatus().toString().equalsIgnoreCase("failed")) {
			fail++;
		}
	}
	
}