package MYQC_Browser_Pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myqc_Home_Page {

    WebDriver driver;

    // constructor that will be automatically called as soon as the object of the
    // class is created
    public myqc_Home_Page(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/h3")
    public static WebElement accountTitle;

    @FindBy(how = How.CLASS_NAME, using = "template-gen")
    public static List<WebElement> options;

   // int size = options.size();

    //  List<WebElement> optionsNew = driver.findElements(By.className("template-gen"));

    public String checkAccountName() {
        return accountTitle.getText();


    }




    }


