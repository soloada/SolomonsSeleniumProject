package org.TestCases;

import org.PageObjects.LandingPage;
import org.PageObjects.SubmenuPage;
import org.TestComponents.BaseTest;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.TestComponents.TakeScreenShot;

import java.io.IOException;

public class SubmenuTest extends BaseTest  {

//public TakeScreenShot screenShots;

    @Test
    public void submenuRunner() throws IOException {
        SubmenuPage submenu = new SubmenuPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), LandingPage.url);
        Assert.assertEquals(driver.getTitle(),title);
        TakeScreenShot takeScreenShot = new TakeScreenShot(driver);
        //takeScreenShot.TakingScreenShots();
        submenu.setCurrency();
        submenu.setItemsLink();
       /* List<WebElement> homeDropList = submenu.getHomeDropdown();
        System.out.println(homeDropList.stream().map(WebElement::getText).collect(Collectors.toList()).toString());
        homeDropList.stream().filter(h-> h.getText().equalsIgnoreCase(menuItem)).
                filter(d->d.getText().equalsIgnoreCase(menuItem)).findFirst().ifPresent(WebElement::click);*/
                        //forEach(WebElement::click);

        submenu.setHomeDropdown();
        submenu.ApparelDropdown();
        submenu.makeupList();
        submenu.SkincareMenu();
        submenu.FragranceMenu();
        submenu.menMenu();
        submenu.HaircareMenu();
        submenu.booksMenu();




    }
}
