package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class UploadFileTest extends TestBase {

    @Test
    void uploadFileTest() {

        new HomePage(driver)
                .openUploadPage()
                .uploadFile("C:\\Tools\\astronaut.jpg")
                .clickUploadButton()
                .verifyFileUploaded("astronaut.jpg");
    }
}
