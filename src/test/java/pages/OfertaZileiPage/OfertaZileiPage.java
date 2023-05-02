package pages.OfertaZileiPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class OfertaZileiPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(OfertaZileiPage.class);
    public static OfertaZileiPage instance;

    private OfertaZileiPage() {
    }

    public static OfertaZileiPage getInstance() {
        if (instance == null) {
            instance = new OfertaZileiPage();
        }
        return instance;

    }

    private final By clickOfertaZilei = By.xpath("//a[@title='Oferta Zilei']");
    private final By clickImage = By.xpath("//*[@id=\"cp_widget_55287\"]/div/div[2]/div[1]/a/img");
    private final By clickOfertaZileiBadge = By.xpath("//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/a/div[2]/div[1]/span");
    private final By clickAddToBasketButton = By.xpath("//i[@class='em em-cart_fill gtm_680klw']");




    public void setClickOfertaZilei() {
        LOG.info("Click Oferta Zilei button");
        driver.findElement(clickOfertaZilei).click();

    }

    public void setClickImage() {
        LOG.info("Click Image");
        driver.findElement(clickImage).click();

    }

    public void setClickOfertaZileiBadge() {
        LOG.info("Click Badge");
        driver.findElement(clickOfertaZileiBadge).click();

    }

    public void setClickAddToBasketButton() {
        LOG.info("Click Add To Button");
        driver.findElement(clickAddToBasketButton).click();
        driver.navigate().back();

    }


}