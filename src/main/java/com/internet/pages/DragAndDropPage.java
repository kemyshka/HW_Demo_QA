package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage dragAToB() {
        waitOfElementVisibility(columnA, 10);
        scrollWithJS(0, 300);
        actions.clickAndHold(columnA)
                .moveToElement(columnB)
                .release()
                .perform();
    return this;
    }


    public DragAndDropPage verifyDropped() {
        Assertions.assertEquals("B", columnA.getText());
        Assertions.assertEquals("A", columnB.getText());
        return this;
    }
}
