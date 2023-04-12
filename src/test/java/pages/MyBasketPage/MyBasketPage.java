package pages.MyBasketPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class MyBasketPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MyBasketPage.class);
    public static MyBasketPage instance;

    private MyBasketPage() {
    }

    public static MyBasketPage getInstance() {
        if (instance == null) {
            instance = new MyBasketPage();
        }
        return instance;

    }

    private final By clickMyBasket = By.xpath("//*[@id=\"my_cart\"]/span[2]");
    private final By clickSeeBasketDetails = By.xpath("//i [@class='em em-forward']");

    public void setClickMyBasket() {
        LOG.info("Click My Basket ");
        driver.findElement(clickMyBasket).click();


    }

    public void setClickSeeBasketDetails() {
        LOG.info("Click See Basket Details ");
        driver.findElement(clickSeeBasketDetails).click();


    }
}
