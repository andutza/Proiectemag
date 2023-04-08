package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void register(){
        driver.get(newUrl);

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(registerPage.IsFormTitleDisplayed(),"logo is not displayed");
    }
}
