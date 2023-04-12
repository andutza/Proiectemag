package tests.FavouriteTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.MyBasketTest.MyBasketTest;

public class FavouriteTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(FavouriteTest.class);

    @Test
    public void checkIfLogoIsDisplayed() {



        LOG.info("Click Favourite");
        favouritePage.setClickFavourite();
    }


}
