package tests.FavouriteTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FavouriteTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(FavouriteTest.class);

    @Test
    public void clickFavourite() {

        LOG.info("Click Favourite");
        favouritePage.setClickFavourite();
    }


}
