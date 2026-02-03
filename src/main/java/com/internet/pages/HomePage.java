package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public AlertsPage getJavaScriptAlerts() {
        click(javaScriptAlerts);
        return new AlertsPage(driver);
    }
    @FindBy(css = "a[href='/windows']")
    WebElement multipleWindows;

    public MultipleWindowsPage getMultipleWindowsPage() {
        click(multipleWindows);
        return new MultipleWindowsPage(driver);
    }
}
