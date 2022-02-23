package MYQC_TestCase_Classes;

import MYQC_Browser_Pages.CUST4_MYQC_Login_Selection_Page;
import MYQC_Reusable_Classes.myqc_Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC001_MYQC_Login_Selection_Button_Text extends myqc_Base {


   @Test()
    public void MYQC_Login_Button_Text() throws InterruptedException, IOException {
        driver = initilizeDriver();
        //creating an object of the CUST4_MYQC_Login_Selection_Page
        CUST4_MYQC_Login_Selection_Page go_To_MYQC_Page = PageFactory.initElements(driver, CUST4_MYQC_Login_Selection_Page.class);
        // going to the cust4 myqc link
        driver.get("https://mmhcustfour.mmhcloud.com/myqc/#main");
        Thread.sleep(3000);
        assertText(go_To_MYQC_Page.buttonText(), "Login with Quickcharge Authentication");
        System.out.println("Button Text displayed:"+ go_To_MYQC_Page.buttonText());

    }

    }



