package pages.SignInPage;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private final By inputEmailAddress = By.id("user_login_email");
    private final By clickContinueButton = By.id("user_login_continue");


    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if EmailField is displayed");
        return driver.findElement(inputEmailAddress).isDisplayed();
    }


    public void typeInEmail(String email) {
        LOG.info("Type In Email Address");
        driver.findElement(inputEmailAddress).sendKeys(email);

    }

    public void setClickContinueButton() {
        LOG.info("Click Continue button");
        driver.findElement(clickContinueButton).click();


    }


}








