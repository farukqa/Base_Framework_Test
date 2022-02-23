package MYQC_Reusable_Classes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class myqc_Base {
    public static WebDriver driver;


    public WebDriver initilizeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\fhasan\\IdeaProjects\\Selenium_Page_Object_Model_Test\\src\\main\\java\\MYQC_Reusable_Classes\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //add the precondition arguments
            options.addArguments("start-maximized", "incognito");
            driver = new ChromeDriver(options);
            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\fhasan\\Desktop\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return driver;
    }

    public static void assertText(String actual, String real) {
        Assert.assertEquals(actual, real);


    }
    //getting a screenshot




}





