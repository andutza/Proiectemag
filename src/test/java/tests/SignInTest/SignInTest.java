package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);
    private String newUrl = getBaseUrl() + "user/login";


    @Test

    public void signInPage() {
        driver.get(newUrl);

        String email = "tudoranda@yahoo.com";
        String password = "Emagonline1.";


        LOG.info("Complete the email field");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email field is not displayed");
        signInPage.typeInEmail(email);


        LOG.info("Click the Next button");
        signInPage.setClickContinueButton();


        LOG.info("Type in  password");
        signInPage.typeInPassword(password);//nu merge pentru ca imi apare un captcha sa trec mai departe

        LOG.info("Click the Next button");
        signInPage.setClickContinueButton();
    }

}

