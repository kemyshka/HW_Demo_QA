package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.DropdownPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTest extends TestBase {

    DropdownPage dropdownPage;

    @BeforeEach
    public void precondition() {
        dropdownPage = new HomePage(driver).getDropdownPage();
    }

    @Test
    public void selectOptionTest() {
        dropdownPage.selectByVisibleText("Option 2");
        assertEquals("Option 2", dropdownPage.getSelectedOption());
    }
    @Test
    public void dragAndDropTest() {
        new HomePage(driver)
                .openHomePage()
                .openDragAndDropPage()
                .dragAToB()
                .verifyDropped();
    }

}
