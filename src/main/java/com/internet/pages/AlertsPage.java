package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlertButton;

    public void clickJsAlert() {
        click(jsAlertButton);
    }


    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    public void clickJsConfirm() {
        click(jsConfirmButton);
    }


    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPromptButton;

    public void clickJsPrompt() {
        click(jsPromptButton);
    }


    @FindBy(id = "result")
    WebElement resultText;

    public String getResult() {
        return resultText.getText();
    }


    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void sendTextToPrompt(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }
}
