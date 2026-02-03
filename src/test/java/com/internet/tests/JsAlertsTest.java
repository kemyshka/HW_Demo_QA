package com.internet.tests;
import com.internet.core.TestBase;
import com.internet.pages.AlertsPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;

public class JsAlertsTest extends TestBase {

    AlertsPage alerts;

    @BeforeEach
    public void precondition() {
        alerts = new HomePage(driver).getJavaScriptAlerts();
    }

}

