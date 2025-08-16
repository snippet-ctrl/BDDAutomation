package RunnerDemo;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\jayde\\IdeaProjects\\GitHubDemo\\src\\test\\java\\Feature\\login"}, glue = {"Steps"},dryRun = false)
public class LoginRunner {
}