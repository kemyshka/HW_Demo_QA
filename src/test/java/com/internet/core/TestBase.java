package com.internet.core;
import com.internet.utils.MyListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import java.time.Duration;

public class TestBase {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {

        WebDriver originalDriver = new ChromeDriver();

        driver = new EventFiringDecorator(
                new MyListener(originalDriver)
        ).decorate(originalDriver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

