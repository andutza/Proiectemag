package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//*[@id=\"masthead\"]/div/div/div[1]/a/img");

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
}
