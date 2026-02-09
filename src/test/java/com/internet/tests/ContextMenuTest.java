package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase {

    @Test
    void contextMenuTest() {

        HomePage homePage = new HomePage(driver);

        homePage
                .openContextMenuPage()
                .rightClickAndAcceptAlert()
                .pressKeys()
                .clickBack();
        Assertions.assertTrue(driver.getCurrentUrl()
                .equals("https://the-internet.herokuapp.com/"));
    }
}
