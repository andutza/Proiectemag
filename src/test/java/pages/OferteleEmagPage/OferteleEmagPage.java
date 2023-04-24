package pages.OferteleEmagPage;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class OferteleEmagPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.OferteleEmagPage.OferteleEmagPage.class);
    public static pages.OferteleEmagPage.OferteleEmagPage instance;

    private OferteleEmagPage() {
    }

    public static pages.OferteleEmagPage.OferteleEmagPage getInstance() {
        if (instance == null) {
            instance = new pages.OferteleEmagPage.OferteleEmagPage();
        }
        return instance;

    }

    private final By clickOferteleEmag = By.xpath("//a[@title='Ofertele eMAG']");
    private final By clickDayOffer = By.xpath("//div[@class='card-thumbnail']");


    public void setClickOferteleEmag() {
        LOG.info("Click Ofertele Emag button");
        driver.findElement(clickOferteleEmag).click();

    }


    public void setClickDayOffer() {
        LOG.info("Click DayOffer Image");
        driver.findElement(clickDayOffer).click();

    }
}