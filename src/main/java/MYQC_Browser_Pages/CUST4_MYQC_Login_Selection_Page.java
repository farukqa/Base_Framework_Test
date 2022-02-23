package MYQC_Browser_Pages;
import MYQC_Reusable_Classes.myqc_Base;
import com.aventstack.extentreports.ExtentTest;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CUST4_MYQC_Login_Selection_Page extends myqc_Base {
    ExtentTest logger;

    public WebDriver driver;
    public CUST4_MYQC_Login_Selection_Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // locator for login button
    @FindBy(how = How.LINK_TEXT, using = "Login with Quickcharge Authentication")
    public WebElement preLoginButton;


    // method to get text of the MYQC button

    public String buttonText(){
        return preLoginButton.getText();
    }

    // Method to click login button
   public void preClickLogin() {
        preLoginButton.click();

    }
}
