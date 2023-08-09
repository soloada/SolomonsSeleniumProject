package org.TestCases;

import org.PageObjects.FooterPage;
import org.PageObjects.LoginPage;
import org.TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class footerTest extends BaseTest {
    //WebDriver driver;
    @Test
    public void footerRunner(){

        FooterPage footerPage = new FooterPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        footerPage.logoVerification();
        footerPage.clickLoginLink();
        //footerPage.clickSpecialsLink();
        //footerPage.clickAccountLink();
        footerPage.clickCartLink();
       /*footerPage.clickCheckoutLink();*/
        footerPage.clickFilterSearchKeyWord();









    }
}
