package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl()+"user/login";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void register() {
        driver.get(newUrl);

        String email = "tudoranda@yahoo.com";

        LOG.info("Check title");
        Assert.assertTrue(registerPage.IsFormTitleDisplayed(), "Title is not displayed");

        LOG.info("Type in Email Address");
        registerPage.typeInEmail(email);

        LOG.info("Click Continue button");
        registerPage.setClickContinueButton();



    }



}
