package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipeMain {

    @FindBy(xpath = "/html/body/main/section/div[1]/div/a[2]")
    private WebElement vegan;

    @FindBy(xpath = "/html/body/main/div/div/a[1]/img")
    private WebElement drink;

    @FindBy(xpath = "/html/body/main/section/div[1]/div/a[4]")
    private WebElement cocktails;

    @FindBy(xpath = "/html/body/div/div/div[1]/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div/div/div[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div/div/button[1]")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div[2]/button[1]")
    private WebElement twentyOneButton;


    public void clickVegan() {
        vegan.click();
    }

    public void clickVeganDrink() { drink.click(); }

    public void clickCocktails() { cocktails.click(); }
    public void enterEmail() {
        emailField.sendKeys("test1@email.com");
    }
    public void enterPassword() {
        passwordField.sendKeys("1234");
    }
    public void clickLogin() { loginButton.click(); }
    public void clickTwentyOneButton() { twentyOneButton.click(); }


    public RecipeMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
