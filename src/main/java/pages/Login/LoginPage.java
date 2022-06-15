package pages.Login;

import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginPO {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public void clickOnLoginLink() throws InterruptedException {
        clickElement(LoginLink,50);
    }

    public void enterTextInLoginUsernameTxtField(String text)
    {
        enterTextIntoElement(LoginUsernameTxtField, 20,text);
    }

    public void enterTextInLoginPasswordTxtField(String text)
    {
        enterTextIntoElement(LoginPasswordTxtField,20, text);
    }

    public void clickOnLoginButtonFromLoginPopup() throws InterruptedException {
        clickElement(LoginPopupButton,50);
    }

}
