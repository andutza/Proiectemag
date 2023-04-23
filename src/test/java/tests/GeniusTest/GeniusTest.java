package tests.GeniusTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.GeniusPage.GeniusPage;
import tests.BaseTest;


public class GeniusTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(GeniusTest.class);

    @Test
    public void clickGenius() {

        LOG.info("Click Genius");
        geniusPage.setClickGenius();

    }


}