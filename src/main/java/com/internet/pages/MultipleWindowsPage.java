package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Click Here")
    WebElement clickHereLink;

    public void openNewWindow() {
        click(clickHereLink);
    }
}
