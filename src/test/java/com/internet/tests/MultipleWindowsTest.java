package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.MultipleWindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleWindowsTest extends TestBase {

    MultipleWindowsPage windowsPage;

    @BeforeEach
    public void precondition() {
        windowsPage = new com.internet.pages.HomePage(driver)
                .getMultipleWindowsPage();
    }

    @Test
    public void newWindowTest() {

        windowsPage.openNewWindow();

        assertEquals("New Window", driver.getTitle());
    }

}
