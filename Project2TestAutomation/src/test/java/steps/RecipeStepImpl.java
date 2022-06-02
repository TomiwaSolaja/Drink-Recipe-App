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
        driver.get("C:/Users/Admin/Desktop/Project2/Project2FrontEndLocal/FrontEndTemplate/index.html"); }

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

    @Then("^The User should be on the Age Verification Page$")
    public void the_User_should_be_on_the_Age_Verification_Page() {
        Assert.assertEquals(driver.getTitle(), "Age Verification");
        try {
            Thread.sleep(2000);       //To make it sleep when this is called
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("^The User selects Over Twenty One$")
    public void the_User_selects_Over_Twenty_One() {
        recipeMain.clickTwentyOneButton();
    }

    @Then("^The User should be on the Login page$")
    public void the_User_should_be_on_the_Login_page() {
        Assert.assertEquals(driver.getTitle(), "Login");
    }

    @When("^The User Logs in$")
    public void the_User_Logs_in() {
        recipeMain.enterEmail();
        recipeMain.enterPassword();
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
