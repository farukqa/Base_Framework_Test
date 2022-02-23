package MYQC_TestCase_Classes;

import MYQC_Browser_Pages.CUST4_MYQC_Login_Selection_Page;
import MYQC_Reusable_Classes.myqc_Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC002_MYQC_Login_Selection_Test extends myqc_Base {


    @Test
    public void Go_To_MYQC_Login_Page_Test() throws InterruptedException, IOException {
        //driver = initilizeDriver();
        //creating anb object of the CUST4_MYQC_Login_Selection_Page
        CUST4_MYQC_Login_Selection_Page go_To_MYQC_Page = PageFactory.initElements(driver, CUST4_MYQC_Login_Selection_Page.class);
        //Clicking on the button to go to the MYQC login page
        go_To_MYQC_Page.preClickLogin();
        Thread.sleep(5000);
    }

}
