package tests.SearchBoxTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SearchBox.SearchBox;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SearchBoxTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SearchBox.class);
    private String newUrl = getBaseUrl() + "user/myaccount?ref=ua_user_dashboard";


    @Test

    public void checkIfLogoIsDisplayed() {
        driver.get(newUrl);

        String product = "dezumidificator";


        LOG.info("Type in  product");
        searchBox.typeInSearchProduct(product);


        LOG.info("Click Magnifying Glass");
        searchBox.setclickMagnifyingGlass();
    }
}
