package pages.GeniusPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class GeniusPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.GeniusPage.GeniusPage.class);
    public static pages.GeniusPage.GeniusPage instance;


    private GeniusPage() {
    }

    public static pages.GeniusPage.GeniusPage getInstance() {
        if (instance == null) {
            instance = new pages.GeniusPage.GeniusPage();
        }
        return instance;
    }

    private final By clickGenius = By.xpath("//*[@id=\"auxiliary\"]/div/div/ul[2]/li[1]/a");



    public void setClickGenius() {
        LOG.info("Click Genius button");
        driver.findElement(clickGenius).click();


    }


}


