package com.internet.pages;
import com.internet.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public String getLeftFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getMiddleFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String text = driver.findElement(By.id("content")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getRightFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame("frame-bottom");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}

