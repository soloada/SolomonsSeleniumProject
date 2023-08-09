package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class FooterPage {

    WebDriver driver;

    public FooterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (css = "img[title='Automation Test Store']")
    private WebElement logo;

    @FindBy (css = "ul[id='customer_menu_top'] li a")
    private WebElement loginLink;

    @FindBy (css = "li[class='dropdown'] span[class='menu_text']")
    private WebElement specialsLink;

    @FindBy (css = "li[class='dropdown'] a[class='top menu_account'] span[class='menu_text']")
    private WebElement accountLink;

    @FindBy (xpath = "//li[@class='dropdown']//span[@class='menu_text'][normalize-space()]")
    private List<WebElement> accountDropdown;

    @FindBy (css = "ul[id='main_menu_top'] a[class='top nobackground'] span[class='menu_text']")
    private WebElement cartLink;

    @FindBy (css = "li[class='dropdown'] a[class='top menu_checkout'] span[class='menu_text']")
    private  WebElement checkoutLink;

    @FindBy (css = "#filter_keyword")
    private WebElement filterSearchKeyWord;


    public void logoVerification () {
        Assert.assertTrue(logo.isDisplayed());
        Assert.assertTrue(logo.isEnabled());
        //logo.click();
    }

    public void clickLoginLink () {

        loginLink.click();
        //driver.navigate().back();
    }

    public void clickSpecialsLink() {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(specialsLink));
        specialsLink.click();
    }

    public void clickAccountLink() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(accountLink));
        Actions action = new Actions(driver);
        action.moveToElement(accountLink).perform();
        for (int i=0;i<accountDropdown.size();i++){

            if (accountDropdown.get(i).getText().trim().contains("Login")){
                Assert.assertTrue(accountDropdown.get(i).isDisplayed());
                Assert.assertTrue(accountDropdown.get(i).isEnabled());

            }

               if (accountDropdown.get(i).getText().trim().contains("Check Your Order")){
                   Assert.assertTrue(accountDropdown.get(i).isDisplayed());
                   Assert.assertTrue(accountDropdown.get(i).isEnabled());

               }

            else {
               System.out.println("they are not available");
            }
        }

    }



    public void clickCartLink() {
        cartLink.click();
    }

    public void clickCheckoutLink() {
        checkoutLink.click();
    }

    public void clickFilterSearchKeyWord() {
        filterSearchKeyWord.sendKeys("shoes");
        filterSearchKeyWord.click();
    }



}
