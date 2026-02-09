package com.internet.pages;
import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Click Here")
    WebElement clickHereLink;

    public void openNewWindow() {
        Set<String> oldWindows = driver.getWindowHandles();

        click(clickHereLink);
        Set<String> newWindows = driver.getWindowHandles();
        for (String window : newWindows) {
            if (!oldWindows.contains(window)) {
                driver.switchTo().window(window);
                break;
            }

    }
}
}
