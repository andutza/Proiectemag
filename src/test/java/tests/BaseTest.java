package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.FavouritePage.FavouritePage;
import pages.MyBasketPage.MyBasketPage;
import pages.RegisterPage.RegisterPage;
import pages.SearchBox.SearchBox;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();
    public SignInPage signInPage = SignInPage.getInstance();
    public SearchBox searchBox= SearchBox.getInstance();
    public MyBasketPage myBasketPage = MyBasketPage.getInstance();
    public FavouritePage favouritePage = FavouritePage.getInstance();




    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}