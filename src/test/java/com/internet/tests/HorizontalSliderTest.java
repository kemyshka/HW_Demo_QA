package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class HorizontalSliderTest extends TestBase {

    @Test
    void moveSliderTest() {
        new HomePage(driver)
                .openHorizontalSliderPage()
                .moveSliderRight(4)
                .verifyValue("2");
    }
}
