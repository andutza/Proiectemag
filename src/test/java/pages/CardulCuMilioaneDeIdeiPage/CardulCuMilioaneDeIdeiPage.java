package pages.CardulCuMilioaneDeIdeiPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CardulCuMilioaneDeIdeiPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(CardulCuMilioaneDeIdeiPage.class);
    public static CardulCuMilioaneDeIdeiPage instance;

    private CardulCuMilioaneDeIdeiPage() {
    }

    public static CardulCuMilioaneDeIdeiPage getInstance() {
        if (instance == null) {
            instance = new CardulCuMilioaneDeIdeiPage();
        }
        return instance;

    }

    private final By clickCardulCuMilioaneDeIdei = By.xpath("//*[@id=\"auxiliary\"]/div/div/ul[2]/li[4]/a");
    private final By clickContinuaButton = By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[1]/button");
    private final By click50LeiButton = By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[3]/div[2]/a[1]");
    private final By clickContinua = By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[3]/button");
    private final By inputRecipientName = By.xpath("//*[@id=\"recipient-name\"]");
    private final By InputRecipientEmail = By.xpath("//*[@id=\"recipient-email\"]");
    private final By InputRecipientEmailConfirm = By.xpath("//*[@id=\"recipient-email-confirm\"]");
    private final By inputSenderName = By.xpath("//*[@id=\"sender-name\"]");
    private final By inputSenderMessage = By.xpath("//*[@id=\"sender-message\"]");


    public void setClickCardulCuMilioaneDeIdei() {
        LOG.info("Click CardulCuMilioaneDeIdei ");
        driver.findElement(clickCardulCuMilioaneDeIdei).click();
    }

    public void setClickContinuaButton() {
        LOG.info("Click Continua Button");
        driver.findElement(clickContinuaButton).click();
    }

    public void setClick50LeiButton() {
        LOG.info("Click 50Lei Button");
        driver.findElement(click50LeiButton).click();
    }

    public void setClickContinua() {
        LOG.info("Click Continua");
        driver.findElement(clickContinua).click();
    }

    public void typeInRecipientName(String rName) {
        LOG.info("Type In RecipientName");
        driver.findElement(inputRecipientName).sendKeys(rName);

    }

    public void typeInRecipientEmail(String Email) {
        LOG.info("Type In RecipientEmail");
        driver.findElement(InputRecipientEmail).sendKeys(Email);

    }

    public void typeInRecipientEmailConfirm(String Email) {
        LOG.info("Type In RecipientEmailConfirm");
        driver.findElement(InputRecipientEmailConfirm).sendKeys(Email);

    }

    public void typeInSenderName(String sName) {
        LOG.info("Type In SenderName");
        driver.findElement(inputSenderName).sendKeys(sName);

    }

    public void typeInSenderMessage(String Message) {
        LOG.info("Type In SenderMessage");
        driver.findElement(inputSenderMessage).sendKeys(Message);

    }


}