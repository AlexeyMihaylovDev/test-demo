package pages.logonPage;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.mainPage.DashboardPage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[placeholder='Username']") // input username field
    private WebElement userName;

    @FindBy(css = "[placeholder='Password']") // input password field
    private WebElement password;

    @FindBy(css = ".mx-button.login.no-select") // login button
    private WebElement login_button;

    @FindBy(css = ".icon.New_login_logo") // logo text
    private WebElement logo;

    @FindBy(css = ".error-text:nth-child(3)") // error email address
    private WebElement error_email;



    public String get_error_email_text (){
        return error_email.getText();
    }


    public DashboardPage click_loginButton () {
        a_click(login_button);
        return new DashboardPage(driver);
    }





    public LoginPage type_userName (String text) {
       type(userName,text);
       return this;
    }

    public LoginPage type_password (String pass) {
        type(password,pass);
        return this;
    }

    public String get_logo_text ()  {   //починить
        return getText(logo);
    }


}

