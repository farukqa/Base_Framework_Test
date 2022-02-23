package MYQC_Browser_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class MYQC_Login_Page {



    WebDriver driver;

    // constructor that will be automatically called as soon as the object of the
    // class is created
    public MYQC_Login_Page(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "loginName")
    public static WebElement userNameField;

    @FindBy(how = How.ID, using = "loginPassword")
    public static WebElement passwordField;

    @FindBy(how = How.ID, using = "loginButton")
    public  static WebElement clickLogin;


    //Method to enter username
    public void clickUserName() {
        userNameField.click();

    }

    public void enterUserName(String user) {
        userNameField.sendKeys(user);

    }

    public void clickPass() {
        passwordField.click();

    }

    public void enterPassword(String pass) {
        passwordField.sendKeys(pass);

    }

    //Method to click on Login button
    public void clickLoginButton() {
        clickLogin.click();



    }


}

