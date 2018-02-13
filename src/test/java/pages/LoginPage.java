package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Souke Family on 13/02/2018.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.txtUsername = txtUsername;
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUsername;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }


}
