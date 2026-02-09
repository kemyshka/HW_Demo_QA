package com.internet.pages;
import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement slider;

    @FindBy(id = "range")
    WebElement sliderValue;

    public HorizontalSliderPage moveSliderRight(int times) {
        for (int i = 0; i < times; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        return this;
    }

    public HorizontalSliderPage verifyValue(String expectedValue) {
        Assertions.assertEquals(expectedValue, sliderValue.getText());
        return this;
    }
}
