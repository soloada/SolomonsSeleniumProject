package org.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.PageObjects.LandingPage;
import org.PageObjects.SubmenuPage;
import org.TestComponents.BaseTest;
import org.TestComponents.TakeScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class Submenu_Steps extends BaseTest {


    //public SubmenuPage submenuPage;

    public LandingPage landingPage;

    @Given("That User navigates to Landing page")
    public void thatUserNavigatesToLandingPage() throws IOException {
        landingPage = launchApplication();
        Assert.assertEquals(driver.getCurrentUrl(), LandingPage.url);
        Assert.assertEquals(driver.getTitle(),title);
        TakeScreenShot takeScreenShot = new TakeScreenShot(driver);
        takeScreenShot.TakingScreenShots();


    }

    @When("User hoover over  dropdowns and click one product in each dropdowns as follow £ POUND STERLING-£ Pound Sterling")
    public void userHooverOverDropdownsAndClickOneProductInEachDropdownsAsFollow£POUNDSTERLING£PoundSterling() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setCurrency();
    }

    @And("ITEMS-View Cart")
    public void itemsViewCart() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setItemsLink();
    }

    @And("HOME-Checkout")
    public void homeCheckout() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setHomeDropdown();
    }

    @And("APPAREL & ACCESSORIES-tShirt")
    public void apparelACCESSORIESTShirt() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.ApparelDropdown();
    }

    @And("makeup-face")
    public void makeupFace() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.makeupList();
    }

    @And("SKINCARE-gift_ideas_sets")
    public void skincareGift_ideas_sets() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.SkincareMenu();
    }

    @And("Fragrance-women")
    public void fragranceWomen() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.FragranceMenu();
    }

    @And("Men-preShave_shave")
    public void menPreShave_shave() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.menMenu();
    }

    @And("Haircare_Shampoo")
    public void haircare_shampoo() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.HaircareMenu();
    }

    @And("Book-Paperback")
    public void bookPaperback() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.booksMenu();
    }

    @Then("user should be able to hover each dropdown and click on at-least one product")
    public void userShouldBeAbleToHoverEachDropdownAndClickOnAtLeastOneProduct() {
    }


}
