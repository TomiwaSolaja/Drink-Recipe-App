package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.RecipeMain;
import runner.TestNGRunner;

public class RecipeStepImpl {

    public static WebDriver driver = TestNGRunner.driver;
    public static RecipeMain recipeMain = TestNGRunner.recipeMain;



    @Given("^The User is on the Recipes De Beber Homepage$")
    public void the_User_is_on_the_Recipes_De_Beber_Homepage() {
        driver.get("file:///C:/Users/Admin/Desktop/FrontEndP2/Revature_project2_Group4/Project2FrontEnd/FrontEndTemplate/index.html"); }

    @When("^The User clicks on Vegan drinks$")
    public void the_User_clicks_on_Vegan_drinks() {
        recipeMain.clickVegan();
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^The User should be on the Vegan Category page$")
    public void the_User_should_be_on_the_Vegan_Category_page() {
        Assert.assertEquals(driver.getTitle(), "Vegan Category");
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("^The User selects a Recipe$")
    public void the_User_selects_a_Recipe() {
        recipeMain.clickVeganDrink();
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^The User should be on the Recipe Page$")
    public void the_User_should_be_on_the_Recipe_Page() {
        Assert.assertEquals(driver.getTitle(), "Single Recipe || Final");
    }

    @When("^The User clicks on Cocktails$")
    public void the_User_clicks_on_Cocktails() {
        recipeMain.clickCocktails();
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^The User should be on the Login page$")
    public void the_User_should_be_on_the_Login_page() {
        Assert.assertEquals(driver.getTitle(), "Login");
    }

    @Then("^If they are an existing User, they can Login using their Email address and Password$")
    public void if_they_are_an_existing_User_they_can_Login_using_their_Email_address_and_Password() {
        recipeMain.enterEmail();
        recipeMain.enterPassword();
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("^The User Logs in$")
    public void the_User_Logs_in() {
        recipeMain.clickLogin();
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^The User should be on the Cocktails Category page$")
    public void the_User_should_be_on_the_Cocktails_Category_page() {
        Assert.assertEquals(driver.getTitle(), "Cocktails Category");
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
