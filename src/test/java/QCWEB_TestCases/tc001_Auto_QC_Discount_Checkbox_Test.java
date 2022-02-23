package QCWEB_TestCases;

import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tc001_Auto_QC_Discount_Checkbox_Test {


    WebDriver driver;
    String baseUrl = "https://www.mmhcloud.com/gateway/login";



    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void cust4_Remote_Gateway_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        //maximizing the window
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //maximizing the window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement userName = driver.findElement(By.id("userName"));
        userName.click();
        userName.sendKeys("fhasan@mmhayes.com");

        WebElement password = driver.findElement(By.id("userPass"));
        password.click();
        password.sendKeys("MMHqa20*");

        driver.findElement(By.xpath("/html/body/div[1]/button[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"4\"]/td[8]/span")).click();
        Thread.sleep(2000);

    }
    @Test
    public void qcsetup_Selection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //*[@id="accordionMenu"]/h3[3]
        driver.findElement(By.xpath("//*[@id=\"accordionMenu\"]/h3[3]")).click();
    }
    @Test
    public void terminal_Page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //*[@id="accordionMenu"]/div[3]/span[42]/a
        driver.findElement(By.xpath("//*[@id=\"accordionMenu\"]/div[3]/span[42]/a")).click();

    }
    @Test
    public void terminal_Page_Advanced_Search() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"search_terminalGrid_top\"]/div/span")).click();

    }
    @Test
    public void terminal_Search_POS_Terminal() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement search = driver.findElement(By.xpath("//*[@id=\"jqg1\"]"));
        search.sendKeys("0NRDIST1");
        driver.findElement(By.xpath("//*[@id=\"fbox_terminalGrid_search\"]")).click();

        Thread.sleep(8000);
        //checking the status of the checkbox
       WebElement status =  driver.findElement(By.xpath("//*[@id=\"POSTERMINALDC\"]/div[2]/div[5]/div[1]/label"));
       System.out.println("status after visiting the terminal: "+status.getAttribute("aria-pressed"));

        //clicking the auto discount button
        driver.findElement(By.xpath("//*[@id=\"POSTERMINALDC\"]/div[2]/div[5]/div[1]/label")).click();
        Thread.sleep(2000);
        //clicking the auto discount button one more time
        driver.findElement(By.xpath("//*[@id=\"POSTERMINALDC\"]/div[2]/div[5]/div[1]/label")).click();
        Thread.sleep(2000);
        //checking the status again
        WebElement status1 =  driver.findElement(By.xpath("//*[@id=\"POSTERMINALDC\"]/div[2]/div[5]/div[1]/label"));
        System.out.println("status after clicking the checkbox: "+status1.getAttribute("aria-pressed"));
        Thread.sleep(2000);

        //getting the text of the checkbox
       WebElement autoQCDiscountText = driver.findElement(By.xpath("//*[@id=\"POSTERMINALDC\"]/div[2]/div[5]/div[1]"));
       System.out.println("Checkbox label: "+autoQCDiscountText.getText());
       Thread.sleep(1000);
       //save it
       driver.findElement(By.xpath("//*[@id=\"saveButton\"]")).click();
       Thread.sleep(8000);
       driver.getCurrentUrl();
       Thread.sleep(6000);
       // inspect the audit log
        driver.findElement(By.xpath("//*[@id=\"showHistory\"]/span")).click();
        //checking the field name
       WebElement fieldName = driver.findElement(By.xpath("//*[@id=\"114459\"]/td[7]"));
       fieldName.getText();
       System.out.println("Field name displayed: "+fieldName.getText());
       Thread.sleep(2000);



       //checking before value
        WebElement beforeValue = driver.findElement(By.xpath("//*[@id=\"114458\"]/td[8]"));
        System.out.println("Before Value displayed: "+beforeValue.getText());
        Thread.sleep(2000);
        //checking after value
        WebElement afterValue = driver.findElement(By.xpath("//*[@id=\"114454\"]/td[9]"));
        System.out.println("After Value displayed: "+afterValue.getText());

    }


   /*@Test
    public void terminal_Type_Selection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //*[@id="accordionMenu"]/div[3]/span[42]/a
       //*[@id="fbox_terminalGrid"]/table[2]/tbody/tr[3]/td[2]/select
       WebElement terminalType = driver.findElement(By.xpath("//*[@id=\"fbox_terminalGrid\"]/table[2]/tbody/tr[3]/td[2]/select"));
       Select terminal = new Select(terminalType);
       terminal.selectByValue("TERMINALTYPEID");
       Thread.sleep(2000);


    }*/
   /* @Test
    public void terminal_Type_POS_Selection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //*[@id="fbox_terminalGrid"]/table[2]/tbody/tr[3]/td[4]
        WebElement dropDownList = driver.findElement(By.xpath("//*[@id=\"fbox_terminalGrid\"]/table[2]/tbody/tr[3]/td[4]"));
     //  WebElement dropDownList = driver.findElement(By.xpath("//*[starts-with(@id,'jqg')]"));
        Thread.sleep(2000);
        dropDownList.click();
        Thread.sleep(1000);
      //Select objSelect = new Select(dropDownList);
        Thread.sleep(1000);
    //objSelect.selectByVisibleText("POS Terminal");
    //   driver.findElement(By.xpath("//*[@id=\"jqg2\"]/option[6]")).click();






    }*/

}
