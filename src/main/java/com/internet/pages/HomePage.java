package com.internet.pages;
import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css="a[href='/windows']")
    WebElement windowsLink;

    @FindBy(css="a[href='/javascript_alerts']")
    WebElement alertsLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage openHomePage() {
        driver.get("https://the-internet.herokuapp.com");
        return this;
    }


    public MultipleWindowsPage getMultipleWindowsPage() {
        click(windowsLink);
        return new MultipleWindowsPage(driver);
    }

    public AlertsPage getJavaScriptAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }
    @FindBy(css = "a[href='/nested_frames']")
    WebElement nestedFrames;

    public NestedFramesPage getNestedFramesPage() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }
    @FindBy(css = "a[href='/dropdown']")
    WebElement dropdown;

    public DropdownPage getDropdownPage() {
        click(dropdown);
        return new DropdownPage(driver);
    }
    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDrop;

    public DragAndDropPage openDragAndDropPage() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }
    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement horizontalSlider;

    public HorizontalSliderPage openHorizontalSliderPage() {
        click(horizontalSlider);
        return new HorizontalSliderPage(driver);
    }
    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;

    public ContextMenuPage openContextMenuPage() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }
    @FindBy(css = "a[href='/upload']")
    WebElement upload;

    public UploadPage openUploadPage() {
        click(upload);
        return new UploadPage(driver);
    }


}

