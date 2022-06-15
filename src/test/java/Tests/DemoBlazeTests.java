package Tests;

import Data.ReadTestData;
import org.testng.annotations.Test;
import pages.Cart.CartPage;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import pages.PlaceOrder.PlaceOrderPage;

public class DemoBlazeTests extends WebTestBase{

    LoginPage loginPageObj;
    HomePage  homePageObj;
    CartPage  cartPageObj;
    PlaceOrderPage placeOrderPageObj;

    @Test(priority = 1)
    public void ScenarioOne_EndToEnd() throws InterruptedException {
        loginPageObj = new LoginPage(driver);
        loginPageObj.clickOnLoginLink();
        loginPageObj.enterTextInLoginUsernameTxtField(ReadTestData.getUsername("Username"));
        loginPageObj.enterTextInLoginPasswordTxtField(ReadTestData.getPassword("Password"));
        loginPageObj.clickOnLoginButtonFromLoginPopup();
        homePageObj = new HomePage(driver);
        homePageObj.clickOnSecondProductFromHomePage();
        homePageObj.addProductFromHomeScreenToCart();
        homePageObj.verifyProductAdded();
    }

    @Test(priority = 2)
    public void ScenarioTwo_EndToEnd() throws InterruptedException {
        homePageObj = new HomePage(driver);
        homePageObj.clickOnHomeIcon();
        homePageObj.clickOnFirstProductFromHomePage();
        homePageObj.addProductFromHomeScreenToCart();
        cartPageObj = new CartPage(driver);
        cartPageObj.clickOnCartIcon();
        cartPageObj.AssertOnProductsAddedToCart();
        cartPageObj.AssertOnProductsAddedToCartTotalPrice();
    }

    @Test(priority = 3)
    public void ScenarioThree_EndToEnd() throws InterruptedException {
        placeOrderPageObj = new PlaceOrderPage(driver);
        placeOrderPageObj.clickOnPlaceOrderCTAFromCartScreen();
        placeOrderPageObj.FillOrderData();
        placeOrderPageObj.clickOnPurchaseCTA();
        placeOrderPageObj.ClickOnOkCTAfromSuccessfulPlaceOrder();
        homePageObj = new HomePage(driver);
        homePageObj.verifyHomePageIsDisplayed();
    }
}
