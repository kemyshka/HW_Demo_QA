package com.internet.utils;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Random;

public class MyListener implements WebDriverListener {

    Logger logger = LoggerFactory.getLogger(MyListener.class);

    private final WebDriver driver;

    public MyListener(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {

        logger.error("TEST FAILED!");
        logger.error("Method: {}", method.getName());
        logger.error("Error: {}", e.getTargetException());

        int i = new Random().nextInt(1000);
        String path = "screenshots/screen_" + i + ".png";

        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(tmp, new File(path));
            logger.error("Screenshot saved: {}", path);
        } catch (IOException ex) {
            logger.error("Cannot save screenshot", ex);
        }
    }

    @Override
    public void afterClick(WebElement element) {
        logger.info("Clicked on element: {}", element);
    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        logger.info("Entered text into element: {}", element);
    }

    @Override
    public void afterGet(WebDriver driver, String url) {
        logger.info("Opened URL: {}", url);
    }

    @Override
    public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
        logger.info("Performed action");
    }

    @Override
    public void afterGetText(WebElement element, String result) {
        logger.info("Got text: {}", result);
    }
}
