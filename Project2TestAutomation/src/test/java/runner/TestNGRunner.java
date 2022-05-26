package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.RecipeMain;
import java.util.concurrent.TimeUnit;


@CucumberOptions(features = {"src/test/resources/Recipe.feature"}, glue = {"steps"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    public static RecipeMain recipeMain;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Project 1/chromedriver.exe");

        driver = new ChromeDriver();
        recipeMain = new RecipeMain(driver);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //Add this to PROJECT
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }








}
