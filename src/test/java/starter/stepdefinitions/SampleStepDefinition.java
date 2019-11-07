package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SampleStepDefinition {

	@Given("^print the name$")
	public void print_the_name() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("AAAAAAAAAAAA");
	}

	@When("^print the age$")
	public void print_the_age() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("BBBBBBBBBBBBB");
		org.junit.Assert.assertEquals("a", "b ");
	}

	@Then("^print the eligibility$")
	public void print_the_eligibility() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("CCCCCCCCCCCCCC");
	}
	
	
	@Given("^print the name1$")
	public void print_the_name1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("AAAAAAAAAAAA");
	}

	@When("^print the age1$")
	public void print_the_age1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("BBBBBBBBBBBBB");
	}

	@Then("^print the eligibility1$")
	public void print_the_eligibility1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("CCCCCCCCCCCCCC");
	}
}
