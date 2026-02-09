package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileInput;

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    WebElement uploadedFileName;

    public UploadPage uploadFile(String path) {
        fileInput.sendKeys(path);
        return this;
    }

    public UploadPage clickUploadButton() {
        uploadButton.click();
        return this;
    }

    public UploadPage verifyFileUploaded(String expectedFileName) {
        Assertions.assertEquals(expectedFileName,
                uploadedFileName.getText());
        return this;
    }
}
