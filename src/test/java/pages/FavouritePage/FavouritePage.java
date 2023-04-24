package pages.FavouritePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class FavouritePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(FavouritePage.class);
    public static FavouritePage instance;

    private FavouritePage() {
    }

    public static FavouritePage getInstance() {
        if (instance == null) {
            instance = new FavouritePage();
        }
        return instance;

    }

    private final By clickFavourite = By.xpath("//*[@id=\"my_wishlist\"]/span[2]");

    public void setClickFavourite() {
        LOG.info("Click Favourite ");
        driver.findElement(clickFavourite).click();
        driver.navigate().back();
    }
}
