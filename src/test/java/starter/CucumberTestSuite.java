package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.UsePersistantStepLibraries;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/search/sample.feature"
)
public class CucumberTestSuite{
	@BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Passed: " + Hooks.pass);
        System.out.println("Failed: " + Hooks.fail);
        JsonWriter.exportReport(Hooks.pass, Hooks.fail);
    }
}
