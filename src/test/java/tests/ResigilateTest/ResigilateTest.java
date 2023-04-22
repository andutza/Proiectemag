package tests.ResigilateTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;


public class ResigilateTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(ResigilateTest.class);

    @Test
    public void clickResigilate() {

        LOG.info("Click Resigilate");
        resigilatePage.setClickResigilate();




        LOG.info("Click TelevizoareElectronice");
        resigilatePage.setClickTelevizoareElectronice();




        LOG.info("Click FashionSport");
        resigilatePage.setClickFashionSport();



        LOG.info("Click Trolere");
        resigilatePage.setClickTrolere();




    }





}