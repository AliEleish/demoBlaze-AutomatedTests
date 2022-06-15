package pages.Login;

import base.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPO extends PageObjectBase {

    @FindBy(how = How.ID, using = "login2")
    public WebElement LoginLink;

    @FindBy(how = How.ID , using = "loginusername")
    public  WebElement LoginUsernameTxtField;

    @FindBy(how = How.ID , using = "loginpassword")
    public  WebElement LoginPasswordTxtField;

    @FindBy(how = How.XPATH , using = "(//button[@class='btn btn-primary'])[3]")
    public  WebElement LoginPopupButton;

    public LoginPO(WebDriver driver) {
        super(driver);
    }

}
