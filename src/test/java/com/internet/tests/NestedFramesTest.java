package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedFramesTest extends TestBase {

    NestedFramesPage framesPage;

    @BeforeEach
    public void precondition() {
        framesPage = new HomePage(driver).getNestedFramesPage();
    }

    @Test
    public void verifyFramesText() {
        assertEquals("LEFT", framesPage.getLeftFrameText());
        assertEquals("MIDDLE", framesPage.getMiddleFrameText());
        assertEquals("RIGHT", framesPage.getRightFrameText());
        assertEquals("BOTTOM", framesPage.getBottomFrameText());
    }
}

