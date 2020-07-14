import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src\\main\\java\\aprender_cucumber.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = true
)
public class Runner {
}
