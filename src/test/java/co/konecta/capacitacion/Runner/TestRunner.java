package co.konecta.capacitacion.Runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        glue = "co.konecta.capacitacion.StepsDefinitions",
        tags = "@Prueba3",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
