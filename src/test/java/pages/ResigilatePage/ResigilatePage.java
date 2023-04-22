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


}
