package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends TestBase {

    @Test
    void brokenImagesTest() {

        new HomePage(driver)
                .openBrokenImagesPage()
                .checkBrokenImages();
    }
}
