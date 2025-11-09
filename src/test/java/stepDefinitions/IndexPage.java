package stepDefinitions;

import io.cucumber.java.bs.I;
import io.cucumber.java.en.*;
import pageObject.IndexObject;
import testBase.Base;

public class IndexPage extends Base {
   IndexObject indexObject = new IndexObject(driver);
    @Given("user launched the Browser")
    public void user_launched_the_browser() {
 initDriver();
    }
    @Given("user navigate to url")
    public void user_navigate_to_url() {
driver.get("https://www.amazon.com/");
    }
    @When("user Click on sign in")
    public void user_click_on_sign_in() {

indexObject.yourAccount_click();
    }
    @Then("user is redirected to sign in page")
    public void user_is_redirected_to_sign_in_page() {
        System.out.println("user in loggin page");
    }

}
