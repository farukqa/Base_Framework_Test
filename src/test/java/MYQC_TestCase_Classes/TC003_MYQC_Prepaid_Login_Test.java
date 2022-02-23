package MYQC_TestCase_Classes;

import MYQC_Browser_Pages.MYQC_Login_Page;
import MYQC_Reusable_Classes.myqc_Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC003_MYQC_Prepaid_Login_Test extends myqc_Base {

    //creating an object of the page
   // MYQC_Login_Page login_page = PageFactory.initElements(driver,MYQC_Login_Page.class);


    @Test
    public void MYQC_Login() throws InterruptedException, IOException {
     //   driver = initilizeDriver();
        //creating an object of the page
        MYQC_Login_Page login_page = PageFactory.initElements(driver,MYQC_Login_Page.class);
        Thread.sleep(2000);
        login_page.clickUserName();
        login_page.enterUserName("mdhasan_faruk@yahoo.com");
        Thread.sleep(2000);
        login_page.clickPass();
        login_page.enterPassword("Kronites2!");
        login_page.clickLoginButton();


    }
}
