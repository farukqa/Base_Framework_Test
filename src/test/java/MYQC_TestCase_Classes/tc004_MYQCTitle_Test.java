package MYQC_TestCase_Classes;

import MYQC_Browser_Pages.myqc_Home_Page;
import MYQC_Reusable_Classes.myqc_Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc004_MYQCTitle_Test extends myqc_Base {


    @Test
    public void MYQC_AccountName() throws InterruptedException {


        //creating an object of the page
      //  MYQC_Login_Page login_page = PageFactory.initElements(driver,MYQC_Login_Page.class);
        myqc_Home_Page homePage = PageFactory.initElements(driver,myqc_Home_Page.class);

        Thread.sleep(4000);
        System.out.println("Title displayed: "+homePage.checkAccountName());
        String actualTitle = homePage.checkAccountName();
        String expectedTitle = "Faruk Hasan" ;
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(4000);

    }

}
