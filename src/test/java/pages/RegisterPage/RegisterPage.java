package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//div[@class='auth-logo']");
    private By myAccount = By.xpath("//*[@id=\"my_account\"]/span");
    private By newAccount = By.xpath("/html/body/div[7]/div/div[2]/a[2]");
    private By inputEmailAddress = By.xpath("//*[@id=\"user_login_email\"]");
    private By clickContinueButton = By.id("user_login_email");


    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }


    public boolean IsFormTitleDisplayed() {
        LOG.info("Verify if formTitle is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public boolean IsMyAccountDisplayed() {
        LOG.info("Verify if myAccount is displayed");
        return driver.findElement(myAccount).isDisplayed();
    }

    public void setNewAccount() {
        LOG.info("Click New Account button");
        driver.findElement(newAccount).click();


    }


    public void typeInEmail(String email) {
        LOG.info("Type In Email");
        driver.findElement(inputEmailAddress).sendKeys(email);

    }

    public void setClickContinueButton() {
        LOG.info("Click Continue button");
        driver.findElement(clickContinueButton).click();


    }


}

