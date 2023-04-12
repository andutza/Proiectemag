package tests.MyBasketTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class MyBasketTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(MyBasketTest.class);
    @Test
    public void checkIfLogoIsDisplayed() {

        LOG.info("Click my basket");
        myBasketPage.setClickMyBasket();

        LOG.info("Click see basket details");
        myBasketPage.setClickSeeBasketDetails();
    }










}
