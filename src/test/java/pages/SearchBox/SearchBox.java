package pages.SearchBox;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SearchBox extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBox.class);
    public static SearchBox instance;


    private SearchBox() {
    }

    public static SearchBox getInstance() {
        if (instance == null) {
            instance = new SearchBox();
        }
        return instance;
    }

    private final By inputSearchBox = By.id("searchboxTrigger");
    private final By clickMagnifyingGlass = By.id("em em-search navbar-icon");

    public void typeInSearchProduct(String product) {
        LOG.info("Type In Product name");
        driver.findElement(inputSearchBox).sendKeys(product);

    }

        public void setclickMagnifyingGlass(){
            LOG.info("Click Magnifying Glass ");
            driver.findElement(clickMagnifyingGlass).click();


        }

    }
