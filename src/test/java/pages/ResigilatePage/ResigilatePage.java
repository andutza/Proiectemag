package pages.ResigilatePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ResigilatePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.ResigilatePage.ResigilatePage.class);
    public static pages.ResigilatePage.ResigilatePage instance;


    private ResigilatePage() {
    }

    public static pages.ResigilatePage.ResigilatePage getInstance() {
        if (instance == null) {
            instance = new pages.ResigilatePage.ResigilatePage();
        }
        return instance;
    }

    private final By clickResigilate = By.xpath("//*[@id=\"auxiliary\"]/div/div/ul[2]/li[2]/a");
    private final By clickTelevizoareElectronice = By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[3]/a/span");
    private final By clickFashionSport = By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[8]/a/span");
    private final By clickTrolere = By.xpath("//*[@id=\"navbar\"]/div[3]/div/div/ul/li[5]/a/span");
    private final By clickRightArrow = By.xpath("//*[@id=\"main-section\"]/section[9]/div[3]/div/div[1]/div/div[3]/div[2]/a/i");
    private final By clickCumparaResigilat = By.xpath("//button[@type='submit' and @class='btn btn-default btn-sm btn-block bundle-product-buy-button po-text-small gtm_nhdl6r' and @data-offer-id='9612526']\n");


    public void setClickResigilate() {
        LOG.info("Click Resigilate button");
        driver.findElement(clickResigilate).click();


    }


    public void setClickTelevizoareElectronice() {
        LOG.info("Click TelevizoareElectronice button");
        driver.findElement(clickTelevizoareElectronice).click();


    }

    public void setClickFashionSport() {
        LOG.info("Click FashionSport button");
        driver.findElement(clickFashionSport).click();


    }

    public void setClickTrolere() {
        LOG.info("Click Trolere button");
        driver.findElement(clickTrolere).click();


    }

    public void setClickRightArrow() {
        LOG.info("Click Right Arrow");
        driver.findElement(clickRightArrow).click();


    }


    public void setClickCumparaResigilat() {
        LOG.info("Click CumparaResigilat");
        driver.findElement(clickCumparaResigilat).click();


    }


}
