package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css="a[href='/windows']")
    WebElement windowsLink;

    @FindBy(css="a[href='/javascript_alerts']")
    WebElement alertsLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MultipleWindowsPage getMultipleWindowsPage() {
        click(windowsLink);
        return new MultipleWindowsPage(driver);
    }

    public AlertsPage getJavaScriptAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }
}

