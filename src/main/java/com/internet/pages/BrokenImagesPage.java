package com.internet.pages;
import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BrokenImagesPage extends BasePage {

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    By images = By.tagName("img");

    public BrokenImagesPage checkBrokenImages() {

        List<WebElement> imageList = driver.findElements(images);
        int brokenCount = 0;

        for (WebElement img : imageList) {
            String width = img.getAttribute("naturalWidth");
            if (width.equals("0")) {
                brokenCount++;
            }
        }

        System.out.println("Broken images count: " + brokenCount);
        Assertions.assertEquals(2, brokenCount);
        return this;
    }
}

