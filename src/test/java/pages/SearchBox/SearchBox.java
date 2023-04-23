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
    private final By clickMagnifyingGlass = By.xpath("//i[@class='em em-search']");
    private final By clickAddToBasket = By.xpath("//i [@class='em em-forward']");
    private final By clickCompareCheckBox = By.xpath("//*[@id=\"main-container\"]/section[2]/div/div[1]/div/div/div/label");
    private final By clickAddToFavourite = By.xpath("//*[@id=\"main-container\"]");


    public void typeInSearchProduct(String product) {
        LOG.info("Type In Product name");
        driver.findElement(inputSearchBox).sendKeys(product);

    }

    public void setclickMagnifyingGlass() {
        LOG.info("Click Magnifying Glass ");
        driver.findElement(clickMagnifyingGlass).click();


    }

    public void setClickAddToBasket() {
        LOG.info("Click Add To Basket ");
        driver.findElement(clickAddToBasket).click();


    }

    public void setClickCompareCheckBox() {
        LOG.info("Click Compare check Box ");
        driver.findElement(clickCompareCheckBox).click();


    }

    public void setClickAddToFavourite() {
        LOG.info("Click Add To Favourite ");
        driver.findElement(clickAddToFavourite).click();


    }

}
