package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.AlertsPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsAlertsTest extends TestBase {

    AlertsPage alerts;

    @BeforeEach
    public void precondition() {
        alerts = new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void jsAlertTest() {
        alerts.clickJsAlert();
        alerts.acceptAlert();
        assertEquals("You successfully clicked an alert", alerts.getResult());
    }

    @Test
    public void jsConfirmCancelTest() {
        alerts.clickJsConfirm();
        alerts.dismissAlert();
        assertEquals("You clicked: Cancel", alerts.getResult());
    }

    @Test
    public void jsPromptTest() {
        alerts.clickJsPrompt();
        alerts.sendTextToPrompt("Hello");
        assertTrue(alerts.getResult().contains("Hello"));
    }
}

