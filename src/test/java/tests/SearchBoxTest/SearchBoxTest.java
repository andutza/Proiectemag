package tests.SearchBoxTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SearchBox.SearchBox;
import tests.BaseTest;

public class SearchBoxTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SearchBox.class);

    @Test
    public void checkIfLogoIsDisplayed() {


        String product = "dezumidificator";


        LOG.info("Type in  product");
        searchBox.typeInSearchProduct(product);


        LOG.info("Click Magnifying Glass");
        searchBox.setclickMagnifyingGlass();

        LOG.info("Click Add To basket");
        searchBox.setClickAddToBasket();


        LOG.info("Click Compare Check Box");
        searchBox.setClickCompareCheckBox();


        LOG.info("Click Add To Favourite");
        searchBox.setClickAddToFavourite();
    }
}
