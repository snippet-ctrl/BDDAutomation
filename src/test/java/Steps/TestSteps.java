package Steps;

import io.cucumber.java.en.*;


public class TestSteps {
    @Given("user is on login page")
    public void userIsOnLoginPage()  {
        System.out.println("On Login");
        System.out.println("User is trying to input the credentials");
        System.out.println("User populated the credentials");
    }

    @When("user enters username and Password")
    public void userEntersUsernameAndPassword() {
        System.out.println("Entered UName & Password");
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("Clicked Login Button");

    }

    @Then("user is navigated to Home Screen")
    public void userIsNavigatedToHomeScreen() {
        System.out.println("I'm at Home Screen");
    }
}

