package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "hot-spot")
    WebElement hotSpot;


    public ContextMenuPage rightClickAndAcceptAlert() {
        actions.contextClick(hotSpot).perform();
        driver.switchTo().alert().accept();
        return this;
    }

    public ContextMenuPage pressKeys() {
        actions
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        return this;
    }


    public HomePage clickBack() {
        driver.navigate().back();
        return new HomePage(driver);
    }
}
