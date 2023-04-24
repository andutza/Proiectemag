package tests.OfertaZileiTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;


public class OfertaZileiTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(OfertaZileiTest.class);

    @Test
    public void clickOfertaZilei() {

        LOG.info("Click Oferta Zilei");
        ofertaZileiPage.setClickOfertaZilei();

        LOG.info("Click Image");
        ofertaZileiPage.setClickImage();

        LOG.info("Click Oferta Zilei Badge");
        ofertaZileiPage.setClickOfertaZileiBadge();

        LOG.info("Click Add To Basket");
        ofertaZileiPage.setClickAddToBasketButton();




    }


}