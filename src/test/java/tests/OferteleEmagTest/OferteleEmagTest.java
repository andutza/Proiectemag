package tests.OferteleEmagTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.OferteleEmagPage.OferteleEmagPage;
import tests.BaseTest;
import tests.OfertaZileiTest.OfertaZileiTest;

public class OferteleEmagTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(OferteleEmagTest.class);

    @Test
    public void clickOferteleEmag() {

        LOG.info("Click Ofertele Emag");
        oferteleEmagPage.setClickOferteleEmag();

        LOG.info("Click Day Offer");
        oferteleEmagPage.setClickDayOffer();

    }
}
